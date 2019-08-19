package cn.ymsys.api.common.websocket.handler;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.ymsys.api.common.request.UserRequest;
import cn.ymsys.api.common.util.Const;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.UserRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.UserResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.UserService;
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
        UserService userService = SpringContextUtil.getBean(UserService.class);
        String path = String.format("%s%s.%s", Const.ROOT, IdUtil.simpleUUID(), msg.getFileType());
        UserResponsePacket userResPacket = new UserResponsePacket();

        try {
            FileUtil.writeBytes(msg.getAvatar().getBytes(), path);
            UserRequest vo = new UserRequest();
            vo.setId(session.getUserId());
            vo.setAvatar(path);
            vo.setNickName(msg.getNickName());
            userService.update(vo);
        } catch (Exception e) {
            userResPacket.setSuccess(false);
            userResPacket.setReason(e.getMessage());
        }

        userResPacket.setSuccess(true);
        userResPacket.setReason("");

        ctx.channel().writeAndFlush(userResPacket);
    }
}
