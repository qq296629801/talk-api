package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.request.GroupRequest;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.GroupListRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupListResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.GroupService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class GroupListRequestHandler extends SimpleChannelInboundHandler<GroupListRequestPacket> {

    public static final GroupListRequestHandler INSTANCE = new GroupListRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupListRequestPacket msg) throws Exception {

        Session session = SessionUtil.getSession(ctx.channel());
        String userId = session.getUserId();

        GroupRequest vo = new GroupRequest();
        vo.setCondition(msg.getCondition());
        vo.setUserId(userId);
        GroupService groupService = SpringContextUtil.getBean(GroupService.class);

        // 构造群聊消息的响应数据包
        GroupListResponsePacket groupResPacket = new GroupListResponsePacket();
        groupResPacket.setFromUser(session);
        groupResPacket.setGroups(groupService.getGroupList(vo));
        // 拿到群聊对应的 ChannelGroup 写到每个客户端
        ctx.channel().writeAndFlush(groupResPacket);
    }
}
