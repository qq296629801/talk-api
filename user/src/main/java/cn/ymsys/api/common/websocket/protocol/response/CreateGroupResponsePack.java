package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

import java.util.List;

/**
 * 创建群组响应数据包
 *
 * @author feng
 * @date 2019-04-21
 */
@Data
public class CreateGroupResponsePack extends Packet {

    private boolean success;

    /**
     * 群组ID
     */
    private String groupId;

    /**
     * 群组内成员的名称列表，生产环境，还有更多字段，比如成员的基本信息
     */
    private List<String> userNameList;

    @Override
    public Byte getCommand() {
        return Command.CREATE_GROUP_RESPONSE;
    }
}
