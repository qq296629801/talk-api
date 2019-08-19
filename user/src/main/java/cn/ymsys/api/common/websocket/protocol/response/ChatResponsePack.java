package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.orm.extend.ExtChat;
import lombok.Data;

import java.util.List;

@Data
public class ChatResponsePack extends Packet {
    private List<ExtChat> chats;

    @Override
    public Byte getCommand() {
        return Command.CHAT_RESPONSE;
    }
}
