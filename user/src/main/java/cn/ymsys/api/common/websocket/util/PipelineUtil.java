package cn.ymsys.api.common.websocket.util;

import cn.ymsys.api.common.websocket.handler.*;
import io.netty.channel.ChannelPipeline;

/**
 * ChannelPipeline工具类
 *
 * @author mjy
 * @date 2019-04-22
 */
public class PipelineUtil {

    /**
     * 添加websocket/tcp通用handler
     *
     * @param pipeline
     */
    public static void addHandler(ChannelPipeline pipeline) {
        pipeline.addLast(
                // 登录
                LoginRequestHandler.INSTANCE,
                // 心跳检测
                HeartBeatRequestHandler.INSTANCE,
                // 身份校验
                AuthHandler.INSTANCE,
                // 单聊消息
                MessageRequestHandler.INSTANCE,
                // 创建群组
                CreateGroupRequestHandler.INSTANCE,
                // 加入群组
                JoinGroupRequestHandler.INSTANCE,
                // 退出群组
                QuitGroupRequestHandler.INSTANCE,
                // 获取群成员
                ListGroupMembersRequestHandler.INSTANCE,
                // 群消息
                GroupMessageRequestHandler.INSTANCE,
                // 退出登录
                LogoutRequestHandler.INSTANCE,
                // 聊天记录
                GroupMsgListRequestHandler.INSTANCE,
                // 聊天列表
                ChatsRequestHandler.INSTANCE,
                // 用户信息
                UserRequestHandler.INSTANCE
        );
    }

}
