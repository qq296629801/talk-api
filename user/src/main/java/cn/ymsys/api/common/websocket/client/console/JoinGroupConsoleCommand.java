package cn.ymsys.api.common.websocket.client.console;

import cn.ymsys.api.common.websocket.protocol.request.JoinGroupRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class JoinGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        JoinGroupRequestPacket joinGroupRequestPacket = new JoinGroupRequestPacket();

        System.out.println("输入 groupId，加入群聊:");
        String groupId = scanner.next();

        joinGroupRequestPacket.setGroupId(groupId);
        channel.writeAndFlush(joinGroupRequestPacket);
    }
}
