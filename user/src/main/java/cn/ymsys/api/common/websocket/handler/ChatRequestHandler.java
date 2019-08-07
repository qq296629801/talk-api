package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.request.ChatRequest;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.ChatRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.ChatResponsePack;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.ChatService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 */
public class ChatRequestHandler extends SimpleChannelInboundHandler<ChatRequestPacket> {
    public static final ChatRequestHandler INSTANCE = new ChatRequestHandler();


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ChatRequestPacket msg) throws Exception {
        Session session = SessionUtil.getSession(ctx.channel());

        ChatService chatService = SpringContextUtil.getBean(ChatService.class);

        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setUserId(session.getUserId());

        ChatResponsePack chatResponsePack = new ChatResponsePack();
        chatResponsePack.setChats(chatService.queryChats(chatRequest));

        ctx.channel().writeAndFlush(chatResponsePack);

    }
}
