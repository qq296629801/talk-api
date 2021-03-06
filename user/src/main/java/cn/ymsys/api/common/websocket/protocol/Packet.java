package cn.ymsys.api.common.websocket.protocol;

import lombok.Data;

/**
 * 数据包抽象基类
 *
 * @author mjy
 * @date 2019-04-20
 */
@Data
public abstract class Packet {

    /**
     * 协议版本
     */
    private Byte version = 1;

    /**
     * 获取指令
     *
     * @return
     */
    public abstract Byte getCommand();

}
