package cn.ymsys.api.common.websocket.protocol.request;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

@Data
public class UserRequestPacket extends Packet {
    private byte[] avatar;
    private String fileType;
    private String nickName;

    @Override
    public Byte getCommand() {
        return Command.USER_INFO_REQUEST;
    }
}
