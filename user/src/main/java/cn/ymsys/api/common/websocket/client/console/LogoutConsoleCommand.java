package cn.ymsys.api.common.websocket.client.console;

import cn.ymsys.api.common.websocket.protocol.request.LogoutRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @author mjy
 * @date 2019-04-21
 */
public class LogoutConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        LogoutRequestPacket logoutRequestPacket = new LogoutRequestPacket();
        channel.writeAndFlush(logoutRequestPacket);
    }
}
