package cn.ymsys.api.common.websocket.protocol.request;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
public class HeartBeatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return Command.HEART_BEAT_REQUEST;
    }
}
