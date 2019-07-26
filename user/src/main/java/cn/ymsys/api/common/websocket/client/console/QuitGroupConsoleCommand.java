package cn.ymsys.api.common.websocket.client.console;

import cn.ymsys.api.common.websocket.protocol.request.QuitGroupRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class QuitGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        QuitGroupRequestPacket quitGroupRequestPacket = new QuitGroupRequestPacket();

        System.out.println("请输入 groupId，退出群聊:");
        String groupId = scanner.next();

        quitGroupRequestPacket.setGroupId(groupId);
        channel.writeAndFlush(quitGroupRequestPacket);
    }
}
