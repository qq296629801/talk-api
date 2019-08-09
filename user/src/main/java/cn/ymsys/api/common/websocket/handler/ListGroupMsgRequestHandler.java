package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.request.GroupMsgRequest;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.GroupMessageRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupMessageResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.GroupMsgService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;

/**
 * @author mjy
 */
@ChannelHandler.Sharable
public class ListGroupMsgRequestHandler extends SimpleChannelInboundHandler<GroupMessageRequestPacket> {
    public static final ListGroupMsgRequestHandler INSTANCE = new ListGroupMsgRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMessageRequestPacket msg) throws Exception {

        String groupId = msg.getToGroupId();
        Session session = SessionUtil.getSession(ctx.channel());

        GroupMsgRequest vo = new GroupMsgRequest();
        vo.setMsgType(msg.getMsgType());
        vo.setGroupId(msg.getToGroupId());
        vo.setMessage(new String(msg.getData()));
        vo.setSendUid(session.getUserId());

        // 保存聊天记录
        GroupMsgService groupMessageService = SpringContextUtil.getBean(GroupMsgService.class);

        // 构造群聊消息的响应数据包
        GroupMessageResponsePacket groupMessageResponsePacket = new GroupMessageResponsePacket();
        groupMessageResponsePacket.setFromGroupId(groupId);
        groupMessageResponsePacket.setFromUser(session);
        groupMessageResponsePacket.setGroupMessages(groupMessageService.queryGroupMsgs(vo));

        // 拿到群聊对应的 ChannelGroup，写到每个客户端
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.writeAndFlush(groupMessageResponsePacket);
    }
}
