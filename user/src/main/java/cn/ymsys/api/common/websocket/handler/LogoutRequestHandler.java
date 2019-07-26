package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.websocket.protocol.request.LogoutRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.LogoutResponsePacket;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class LogoutRequestHandler extends SimpleChannelInboundHandler<LogoutRequestPacket> {

    public static final LogoutRequestHandler INSTANCE = new LogoutRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutRequestPacket msg) throws Exception {
        SessionUtil.unBindSession(ctx.channel());

        LogoutResponsePacket logoutResponsePacket = new LogoutResponsePacket();
        logoutResponsePacket.setSuccess(true);
        ctx.channel().writeAndFlush(logoutResponsePacket);
    }
}
