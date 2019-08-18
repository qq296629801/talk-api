package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.orm.extend.ExtGroup;
import lombok.Data;

import java.util.List;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
public class GroupListResponsePacket extends Packet {

    private List<ExtGroup> groups;
    private Session fromUser;
    private String reason;

    @Override
    public Byte getCommand() {
        return Command.GROUP_LIST_RESPONSE;
    }
}
