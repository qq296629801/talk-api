package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.websocket.protocol.request.GroupMessageRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupMessageResponsePacket;
import cn.ymsys.api.common.websocket.util.SessionUtil;
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
        // 构造群聊消息的响应数据包
        String groupId = msg.getToGroupId();
        String message = msg.getMessage();
        GroupMessageResponsePacket groupMessageResponsePacket = new GroupMessageResponsePacket();
        groupMessageResponsePacket.setFromGroupId(groupId);
        groupMessageResponsePacket.setFromUser(SessionUtil.getSession(ctx.channel()));
        groupMessageResponsePacket.setMessage(message);

        // 拿到群聊对应的 ChannelGroup，写到每个客户端
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.writeAndFlush(groupMessageResponsePacket);
    }
}
