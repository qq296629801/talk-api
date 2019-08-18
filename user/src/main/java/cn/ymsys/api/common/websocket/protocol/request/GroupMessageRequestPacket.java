package cn.ymsys.api.common.websocket.protocol.request;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
@NoArgsConstructor
public class GroupMessageRequestPacket extends Packet {

    private String toGroupId;
    private int msgType;
    private String fileType;
    private String message;

    public GroupMessageRequestPacket(String toGroupId, String message) {
        this.toGroupId = toGroupId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return Command.GROUP_MESSAGE_REQUEST;
    }
}
