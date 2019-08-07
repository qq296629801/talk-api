package cn.ymsys.api.common.websocket.protocol.request;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

@Data
public class ChatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return Command.CHAT_REQUEST;
    }
}
