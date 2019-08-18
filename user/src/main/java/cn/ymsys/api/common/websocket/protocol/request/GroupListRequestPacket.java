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
public class GroupListRequestPacket extends Packet {
    private String condition;

    @Override
    public Byte getCommand() {
        return Command.GROUP_LIST_REQUEST;
    }
}
