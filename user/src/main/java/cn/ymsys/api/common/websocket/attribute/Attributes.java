package cn.ymsys.api.common.websocket.attribute;

import cn.ymsys.api.common.websocket.session.Session;
import io.netty.util.AttributeKey;

/**
 * 用于缓存到 channel 中的属性的键
 *
 * @author mjy
 * @date 2019-04-20
 */
public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
