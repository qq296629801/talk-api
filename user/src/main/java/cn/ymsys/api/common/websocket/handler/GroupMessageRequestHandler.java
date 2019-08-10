package cn.ymsys.api.common.websocket.handler;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.ymsys.api.common.enums.ChatTypeEnum;
import cn.ymsys.api.common.request.ChatRequest;
import cn.ymsys.api.common.request.GroupMsgRequest;
import cn.ymsys.api.common.util.Const;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.GroupMessageRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupMessageResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.ChatService;
import cn.ymsys.api.service.GroupMsgService;
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
        Session session = SessionUtil.getSession(ctx.channel());
        String userId = session.getUserId();
        Integer msgType = msg.getMsgType();
        String message = messageMatch(msg);
        // 消息类型匹配
        messageMatch(msg);

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
        chatReq.setContext(message);

        // 保存聊天记录
        GroupMsgService groupMsgService = SpringContextUtil.getBean(GroupMsgService.class);
        ChatService chatService = SpringContextUtil.getBean(ChatService.class);
        groupMsgService.create(groupMsgReq);
        chatService.openChat(chatReq);

        // 构造群聊消息的响应数据包
        GroupMessageResponsePacket gmrPacket = new GroupMessageResponsePacket();
        gmrPacket.setFromGroupId(groupId);
        gmrPacket.setFromUser(session);
        gmrPacket.setMessage(message);
        gmrPacket.setGroupMessages(groupMsgService.queryGroupMsgs(groupMsgReq));

        // 拿到群聊对应的 ChannelGroup 写到每个客户端
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.writeAndFlush(gmrPacket);
    }

    private String messageMatch(GroupMessageRequestPacket msg) {
        if (msg.getMsgType() == 0) {
            return new String(msg.getData());
        } else {
            String path = String.format("%s%s.%s", Const.ROOT, IdUtil.simpleUUID(), msg.getFileType());
            FileUtil.writeBytes(msg.getData(), path);
            return path;
        }
    }
}
