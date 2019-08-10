package cn.ymsys.api.common.websocket.handler;

import cn.ymsys.api.common.util.DataUtil;
import cn.ymsys.api.common.util.SpringContextUtil;
import cn.ymsys.api.common.websocket.protocol.request.LoginRequestPacket;
import cn.ymsys.api.common.websocket.protocol.response.JoinGroupResponsePacket;
import cn.ymsys.api.common.websocket.protocol.response.LoginResponsePacket;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import cn.ymsys.api.orm.model.GroupUser;
import cn.ymsys.api.orm.model.User;
import cn.ymsys.api.service.BlacklistService;
import cn.ymsys.api.service.GroupService;
import cn.ymsys.api.service.UserService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;

/**
 * 登录请求逻辑处理器
 *
 * @author mjy
 * @date 2019-04-21
 */
@ChannelHandler.Sharable
public class LoginRequestHandler extends SimpleChannelInboundHandler<LoginRequestPacket> {
    public static final LoginRequestHandler INSTANCE = new LoginRequestHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginRequestPacket msg) throws Exception {
        GroupService groupService = SpringContextUtil.getBean(GroupService.class);


        // 处理登录请求数据包
        LoginResponsePacket loginResponsePacket = new LoginResponsePacket();
        loginResponsePacket.setVersion(msg.getVersion());
        loginResponsePacket.setUsername(msg.getUsername());

        // 登录校验
        String username = msg.getUsername();
        String password = msg.getPassword();
        UserService userService = SpringContextUtil.getBean(UserService.class);
        User user = userService.find(username, password);

        if (valid(user)) {
            loginResponsePacket.setSuccess(true);
            // 随机生成userId，生产环境需要注册账号并生成userId，然后存储在数据库中
            String userId = user.getId();
            loginResponsePacket.setUserId(userId);
            // 缓存用户会话信息和连接的映射关系
            SessionUtil.bindSession(new Session(userId, username), ctx.channel());
            for (GroupUser groupUser : groupService.queryGroupsByUserId(userId)) {
                //判断群是否在
                String groupId = groupUser.getGroupId();

                ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
                //构建加群响应
                JoinGroupResponsePacket joinGroupResponsePacket = new JoinGroupResponsePacket();
                joinGroupResponsePacket.setSuccess(true);
                joinGroupResponsePacket.setGroupId(groupId);
                if (channelGroup != null) {
                    //直接加入
                    channelGroup.add(ctx.channel());
                } else {
                    //创建群
                    channelGroup = new DefaultChannelGroup(ctx.executor());
                    channelGroup.add(ctx.channel());
                    //缓存群会话
                    SessionUtil.bindChannelGroup(groupId, channelGroup);
                }
                //加群响应
                ctx.channel().writeAndFlush(joinGroupResponsePacket);
            }
        } else {
            loginResponsePacket.setSuccess(false);
            loginResponsePacket.setReason("账号密码校验失败");
        }
        // 登录响应
        ctx.channel().writeAndFlush(loginResponsePacket);
    }

    private boolean valid(User user) {
        BlacklistService blackService = SpringContextUtil.getBean(BlacklistService.class);
        return DataUtil.isNotNull(user) && !blackService.checkBlacklist(user.getId());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        // 清除用户会话信息和连接的映射关系
        SessionUtil.unBindSession(ctx.channel());
    }
}
