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
public class GroupMessageListRequestPacket extends Packet {

    private String toGroupId;
    private int msgType;
    private String fileType;
    private byte[] data;

    public GroupMessageListRequestPacket(String toGroupId, byte[] data) {
        this.toGroupId = toGroupId;
        this.data = data;
    }

    @Override
    public Byte getCommand() {
        return Command.GROUP_MESSAGE_LIST_REQUEST;
    }
}
