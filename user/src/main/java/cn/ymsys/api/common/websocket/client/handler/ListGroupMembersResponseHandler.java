package cn.ymsys.api.common.websocket.client.handler;

import cn.ymsys.api.common.websocket.protocol.response.ListGroupMembersResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class ListGroupMembersResponseHandler extends SimpleChannelInboundHandler<ListGroupMembersResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ListGroupMembersResponsePacket msg) throws Exception {
        System.out.println("群[" + msg.getGroupId() + "]内成员列表:" + msg.getOnlineUsers());
    }
}
