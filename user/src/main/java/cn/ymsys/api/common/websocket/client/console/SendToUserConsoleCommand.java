package cn.ymsys.api.common.websocket.client.console;

import cn.ymsys.api.common.websocket.protocol.request.MessageRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @author feng
 * @date 2019-04-21
 */
public class SendToUserConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("发信息给某个用户，请输入接收用户的userId:");
        String toUserId = scanner.next();
        System.out.println("请输入消息内容:");
        String message = scanner.next();

        channel.writeAndFlush(new MessageRequestPacket(toUserId, message));
    }
}
