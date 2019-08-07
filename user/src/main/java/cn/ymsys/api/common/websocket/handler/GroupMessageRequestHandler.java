package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.request.GroupMsgRequest;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.GroupMessageRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.GroupMessageResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.orm.model.GroupMsg;
import cn.ymsys.api.service.GroupMessageService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;

import java.util.List;

/**
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class GroupMessageRequestHandler extends SimpleChannelInboundHandler<GroupMessageRequestPacket> {

    public static final GroupMessageRequestHandler INSTANCE = new GroupMessageRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMessageRequestPacket msg) throws Exception {

        String groupId = msg.getToGroupId();
        String message = msg.getMessage();
        Session session = SessionUtil.getSession(ctx.channel());

        GroupMsgRequest vo = new GroupMsgRequest();
        vo.setMsgType(msg.getMsgType());
        vo.setGroupId(msg.getToGroupId());
        vo.setMessage(msg.getMessage());
        vo.setSendUid(session.getUserId());
        // 获取聊天记录
        GroupMessageService groupMessageService = SpringContextUtil.getBean(GroupMessageService.class);
        groupMessageService.create(vo);
        List<GroupMsg> groupMsgs = groupMessageService.queryGroupMsgs(vo);

        // 构造群聊消息的响应数据包
        GroupMessageResponsePacket groupMessageResponsePacket = new GroupMessageResponsePacket();
        groupMessageResponsePacket.setFromGroupId(groupId);
        groupMessageResponsePacket.setFromUser(session);
        groupMessageResponsePacket.setMessage(message);
        groupMessageResponsePacket.setGroupMsgs(groupMsgs);

        // 拿到群聊对应的 ChannelGroup，写到每个客户端
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.writeAndFlush(groupMessageResponsePacket);
    }
}
