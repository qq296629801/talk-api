package cn.ymsys.api.common.websocket.protocol.request;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户端发送至服务端的消息数据包
 *
 * @author mjy
 * @date 2019-04-20
 */
@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {

    /**
     * 消息要发给哪个用户
     */
    private String toUserId;

    /**
     * 消息内容
     */
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }
}
