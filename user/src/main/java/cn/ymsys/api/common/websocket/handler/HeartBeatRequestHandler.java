package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.websocket.protocol.request.HeartBeatRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.HeartBeatResponsePacket;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 心跳检测
 *
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class HeartBeatRequestHandler extends SimpleChannelInboundHandler<HeartBeatRequestPacket> {

    public static final HeartBeatRequestHandler INSTANCE = new HeartBeatRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HeartBeatRequestPacket msg) throws Exception {
        ctx.writeAndFlush(new HeartBeatResponsePacket());
    }
}
