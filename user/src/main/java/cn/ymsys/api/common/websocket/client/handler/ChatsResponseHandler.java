package cn.ymsys.api.common.websocket.client.handler;

import cn.ymsys.api.common.websocket.protocol.response.ChatResponsePack;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ChatsResponseHandler extends SimpleChannelInboundHandler<ChatResponsePack> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ChatResponsePack msg) throws Exception {
        System.out.println("聊天列表获取成功" + msg.getChats() + "");
    }
}
