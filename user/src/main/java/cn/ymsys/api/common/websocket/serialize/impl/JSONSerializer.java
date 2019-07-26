package cn.ymsys.api.common.websocket.serialize.impl;

import cn.ymsys.api.common.websocket.serialize.Serializer;
import cn.ymsys.api.common.websocket.serialize.SerializerAlgorithm;
import com.alibaba.fastjson.JSON;

/**
 * json 序列化器
 *
 * @author mjy
 * @date 2019-04-20
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
