package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.websocket.protocol.request.UserRequestPacket;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class UserRequesstHandler extends SimpleChannelInboundHandler<UserRequestPacket> {
    public static final UserRequesstHandler INSTANCE = new UserRequesstHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, UserRequestPacket msg) throws Exception {

    }
}
