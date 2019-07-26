package cn.ymsys.api.common.websocket.client.handler;

import cn.ymsys.api.common.websocket.protocol.response.CreateGroupResponsePack;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class CreateGroupResponseHandler extends SimpleChannelInboundHandler<CreateGroupResponsePack> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CreateGroupResponsePack msg) throws Exception {
        System.out.println("群创建成功，id 为[" + msg.getGroupId() + "]，");
        System.out.println("群成员:" + msg.getUserNameList());
    }
}
