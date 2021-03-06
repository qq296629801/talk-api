package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.ListGroupMembersRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.ListGroupMembersResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.service.GroupService;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class ListGroupMembersRequestHandler extends SimpleChannelInboundHandler<ListGroupMembersRequestPacket> {

    public static final ListGroupMembersRequestHandler INSTANCE = new ListGroupMembersRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ListGroupMembersRequestPacket msg) throws Exception {
        // 获取群的 ChannelGroup
        String groupId = msg.getGroupId();
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);

        // 遍历群成员的 channel，对应的 session，构造群成员的信息
        List<Session> sessionList = new ArrayList<>();
        for (Channel channel : channelGroup) {
            Session session = SessionUtil.getSession(channel);
            sessionList.add(session);
        }

        // 构造获取群成员列表响应客户端
        GroupService groupService = SpringContextUtil.getBean(GroupService.class);
        ListGroupMembersResponsePacket listGroupMembersResponsePacket = new ListGroupMembersResponsePacket();
        listGroupMembersResponsePacket.setGroupId(groupId);
        listGroupMembersResponsePacket.setOnlineUsers(sessionList);
        listGroupMembersResponsePacket.setMembers(groupService.queryUsersByGroupId(groupId));
        ctx.channel().writeAndFlush(listGroupMembersResponsePacket);
    }
}
