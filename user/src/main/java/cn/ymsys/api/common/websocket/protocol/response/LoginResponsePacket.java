package cn.ymsys.api.common.websocket.protocol.response;

import cn.ymsys.api.common.websocket.protocol.Packet;
import cn.ymsys.api.common.websocket.protocol.command.Command;
import lombok.Data;

/**
 * 登录响应数据包
 *
 * @author mjy
 * @date 2019-04-20
 */
@Data
public class LoginResponsePacket extends Packet {

    private String userId;

    private String username;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_RESPONSE;
    }
}
