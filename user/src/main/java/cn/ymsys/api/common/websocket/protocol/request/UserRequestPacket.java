package cn.ymsys.api.common.websocket.protocol.request;

import cn.ymsys.api.common.websocket.protocol.Packet;
import lombok.Data;

@Data
public class UserRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return null;
    }
}
