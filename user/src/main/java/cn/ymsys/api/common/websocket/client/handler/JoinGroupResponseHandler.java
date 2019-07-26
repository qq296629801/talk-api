package cn.ymsys.api.common.websocket.client.handler;

import cn.ymsys.api.common.websocket.protocol.response.JoinGroupResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class JoinGroupResponseHandler extends SimpleChannelInboundHandler<JoinGroupResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, JoinGroupResponsePacket msg) throws Exception {
        if (msg.isSuccess()) {
            System.out.println("加入群[" + msg.getGroupId() + "]成功!");
        } else {
            System.out.println("加入群[" + msg.getGroupId() + "]失败，原因:" + msg.getReason());
        }
    }
}
