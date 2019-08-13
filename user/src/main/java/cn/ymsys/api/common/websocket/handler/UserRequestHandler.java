package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.websocket.protocol.request.UserRequestPacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 */
@ChannelHandler.Sharable
public class UserRequestHandler extends SimpleChannelInboundHandler<UserRequestPacket> {
    public static final UserRequestHandler INSTANCE = new UserRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, UserRequestPacket msg) throws Exception {
        // 拿到消息发送方的会话信息
        Session session = SessionUtil.getSession(ctx.channel());
        

    }
}
