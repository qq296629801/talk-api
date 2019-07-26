package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

/**
 * 服务端发送至客户端的消息数据包
 *
 * @author mjy
 * @date 2019-04-20
 */
@Data
public class MessageResponsePacket extends Packet {

    /**
     * 消息来源用户
     */
    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_RESPONSE;
    }
}
