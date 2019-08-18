package cn.ymsys.api.common.websocket.client.handler;

import cn.ymsys.api.common.websocket.protocol.response.LoginResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class LoginResponseHandler extends SimpleChannelInboundHandler<LoginResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginResponsePacket msg) throws Exception {
        if (msg.isSuccess()) {
            System.out.println("[" + msg.getUserName() + "]登录成功，userId 为:" + msg.getUserId());
            SessionUtil.bindSession(new Session(msg.getUserId(), msg.getUserName()), ctx.channel());
        } else {
            System.out.println("[" + msg.getUserName() + "]登录失败，原因:" + msg.getReason());
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接被关闭!");
        // 清除用户会话信息和连接的映射关系
        SessionUtil.unBindSession(ctx.channel());
    }
}
