package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.enums.ChatTypeEnum;
import cn.ymsys.api.common.request.ChatRequest;
import cn.ymsys.api.common.request.GroupMsgRequest;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.GroupMessageRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupMessageResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.ChatService;
import cn.ymsys.api.service.GroupMessageService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;

/**
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class GroupMessageRequestHandler extends SimpleChannelInboundHandler<GroupMessageRequestPacket> {

    public static final GroupMessageRequestHandler INSTANCE = new GroupMessageRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMessageRequestPacket msg) throws Exception {

        String groupId = msg.getToGroupId();
        String message = msg.getMessage();
        Session session = SessionUtil.getSession(ctx.channel());
        String userId = session.getUserId();
        Integer msgType = msg.getMsgType();

        // 构造聊天记录参数
        GroupMsgRequest groupMsgReq = new GroupMsgRequest();
        groupMsgReq.setMsgType(msgType);
        groupMsgReq.setGroupId(groupId);
        groupMsgReq.setMessage(message);
        groupMsgReq.setSendUid(userId);

        // 构造聊天列表参数
        ChatRequest chatReq = new ChatRequest();
        chatReq.setUserId(userId);
        chatReq.setChatId(groupId);
        chatReq.setChatType(ChatTypeEnum.GROUP.getValue());
        chatReq.setDesc(message);

        // 保存聊天记录
        GroupMessageService groupMessageService = SpringContextUtil.getBean(GroupMessageService.class);
        ChatService chatService = SpringContextUtil.getBean(ChatService.class);
        groupMessageService.create(groupMsgReq);
        chatService.openChat(chatReq);

        // 构造群聊消息的响应数据包
        GroupMessageResponsePacket groupMessageResponsePacket = new GroupMessageResponsePacket();
        groupMessageResponsePacket.setFromGroupId(groupId);
        groupMessageResponsePacket.setFromUser(session);
        groupMessageResponsePacket.setMessage(message);

        // 拿到群聊对应的 ChannelGroup，写到每个客户端
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.writeAndFlush(groupMessageResponsePacket);
    }
}
