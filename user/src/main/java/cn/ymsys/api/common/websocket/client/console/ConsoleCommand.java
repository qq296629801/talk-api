package cn.ymsys.api.common.websocket.client.console;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 控制台指令根接口
 *
 * @author feng
 * @date 2019-04-21
 */
public interface ConsoleCommand {

    void exec(Scanner scanner, Channel channel);
}
