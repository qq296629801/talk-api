package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.request.GroupMsgRequest;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.GroupMessageListRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupMessageListResponsePacket;
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
public class GroupMsgListRequestHandler extends SimpleChannelInboundHandler<GroupMessageListRequestPacket> {
    public static final GroupMsgListRequestHandler INSTANCE = new GroupMsgListRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMessageListRequestPacket msg) throws Exception {
        // 获取群聊天记录
        String groupId = msg.getToGroupId();
        Session session = SessionUtil.getSession(ctx.channel());
        GroupMsgRequest vo = new GroupMsgRequest();
        vo.setGroupId(groupId);
        GroupMsgService groupMessageService = SpringContextUtil.getBean(GroupMsgService.class);

        // 构造群聊消息的响应数据包
        GroupMessageListResponsePacket groupResPacket = new GroupMessageListResponsePacket();
        groupResPacket.setFromGroupId(groupId);
        groupResPacket.setFromUser(session);
        groupResPacket.setGroupMessages(groupMessageService.queryGroupMsgs(vo));

        // 拿到群聊对应的 ChannelGroup，写到每个客户端
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.writeAndFlush(groupResPacket);
    }
}
