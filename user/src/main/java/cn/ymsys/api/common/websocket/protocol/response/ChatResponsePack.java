package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.orm.model.Chat;
import lombok.Data;

import java.util.List;

@Data
public class ChatResponsePack extends Packet {
    private List<Chat> chats;

    @Override
    public Byte getCommand() {
        return Command.CHAT_RESPONSE;
    }
}
