package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.orm.extend.ExtUser;
import lombok.Data;

import java.util.List;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> onlineUsers;

    private List<ExtUser> members;

    @Override
    public Byte getCommand() {
        return Command.LIST_GROUP_MEMBERS_RESPONSE;
    }
}
