package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
public class QuitGroupResponsePacket extends Packet {

    private boolean success;

    private String groupId;

    @Override
    public Byte getCommand() {
        return Command.QUIT_GROUP_RESPONSE;
    }
}
