package cn.ymsys.api.common.websocket.client.handler;

import cn.ymsys.api.common.websocket.protocol.response.LogoutResponsePacket;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class LogoutResponseHandler extends SimpleChannelInboundHandler<LogoutResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutResponsePacket msg) throws Exception {
        if (msg.isSuccess()) {
            SessionUtil.unBindSession(ctx.channel());
            System.out.println("退出登录成功");
        } else {
            System.out.println("退出登录失败");
        }
    }
}
