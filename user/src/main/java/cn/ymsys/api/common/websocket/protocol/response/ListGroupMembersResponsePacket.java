package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.common.websocket.session.Session;
import lombok.Data;

import java.util.List;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    /**
     * 生产环境中，这里可能会构造另外一个对象来装载用户信息而非 Session
     */
    private List<Session> sessionList;

    @Override
    public Byte getCommand() {
        return Command.LIST_GROUP_MEMBERS_RESPONSE;
    }
}
