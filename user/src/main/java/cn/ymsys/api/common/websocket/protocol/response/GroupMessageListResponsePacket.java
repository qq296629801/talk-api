package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.common.websocket.session.Session;
import cn.ymsys.api.orm.extend.ExtMsg;
import lombok.Data;

import java.util.List;

/**
 * @author mjy
 * @date 2019-04-21
 */
@Data
public class GroupMessageListResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private boolean success;

    private String reason;

    private List<ExtMsg> messageList;

    @Override
    public Byte getCommand() {
        return Command.GROUP_MESSAGE_LIST_RESPONSE;
    }
}
