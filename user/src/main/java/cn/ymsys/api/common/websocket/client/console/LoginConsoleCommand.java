package cn.ymsys.api.common.websocket.client.console;

import cn.ymsys.api.common.websocket.protocol.request.LoginRequestPacket;
import cn.ymsys.api.common.websocket.util.SessionUtil;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @author feng
 * @date 2019-04-21
 */
public class LoginConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        if (SessionUtil.hasLogin(channel)) {
            System.out.println("客户端已经登录");
            return;
        }
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();

        System.out.println("请输入用户名登录:");
        String userId = scanner.next();
        loginRequestPacket.setUsername(userId);
        loginRequestPacket.setPassword("123456");

        channel.writeAndFlush(loginRequestPacket);
    }
}
