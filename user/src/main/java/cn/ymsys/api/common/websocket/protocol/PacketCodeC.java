package cn.ymsys.api.common.websocket.protocol;

import cn.ymsys.api.common.websocket.protocol.command.Command;
import cn.ymsys.api.common.websocket.protocol.request.*;
import cn.ymsys.api.common.websocket.protocol.response.*;
import cn.ymsys.api.common.websocket.serialize.Serializer;
import cn.ymsys.api.common.websocket.serialize.impl.JSONSerializer;
import io.netty.buffer.ByteBuf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据包编解码器
 * 自定义协议规则:
 * magic4字节 + 版本1字节 + 序列化算法1字节 + 指令1字节 + 数据长度4字节 + 数据内容
 *
 * @author mjy
 * @date 2019-07-26
 */
public class PacketCodeC {

    public static final int MAGIC_NUMBER = 0x12345678;
    public static final PacketCodeC INSTANCE = new PacketCodeC();

    private static final Map<Byte, Class<? extends Packet>> packetTypeMap;
    private static final Map<Byte, Serializer> serializerMap;

    static {
        packetTypeMap = new HashMap<>();
        packetTypeMap.put(Command.LOGIN_REQUEST, LoginRequestPacket.class);
        packetTypeMap.put(Command.LOGIN_RESPONSE, LoginResponsePacket.class);
        packetTypeMap.put(Command.LOGOUT_REQUEST, LogoutRequestPacket.class);
        packetTypeMap.put(Command.LOGOUT_RESPONSE, LogoutResponsePacket.class);
        packetTypeMap.put(Command.MESSAGE_REQUEST, MessageRequestPacket.class);
        packetTypeMap.put(Command.MESSAGE_RESPONSE, MessageResponsePacket.class);
        packetTypeMap.put(Command.CREATE_GROUP_REQUEST, CreateGroupRequestPacket.class);
        packetTypeMap.put(Command.CREATE_GROUP_RESPONSE, CreateGroupResponsePack.class);
        packetTypeMap.put(Command.JOIN_GROUP_REQUEST, JoinGroupRequestPacket.class);
        packetTypeMap.put(Command.JOIN_GROUP_RESPONSE, JoinGroupResponsePacket.class);
        packetTypeMap.put(Command.LIST_GROUP_MEMBERS_REQUEST, ListGroupMembersRequestPacket.class);
        packetTypeMap.put(Command.LIST_GROUP_MEMBERS_RESPONSE, ListGroupMembersResponsePacket.class);
        packetTypeMap.put(Command.GROUP_MESSAGE_REQUEST, GroupMessageRequestPacket.class);
        packetTypeMap.put(Command.GROUP_MESSAGE_RESPONSE, GroupMessageResponsePacket.class);
        packetTypeMap.put(Command.HEART_BEAT_REQUEST, HeartBeatRequestPacket.class);
        packetTypeMap.put(Command.HEART_BEAT_RESPONSE, HeartBeatResponsePacket.class);
        packetTypeMap.put(Command.CHAT_REQUEST, ChatRequestPacket.class);
        packetTypeMap.put(Command.CHAT_RESPONSE, ChatResponsePack.class);
        packetTypeMap.put(Command.USER_INFO_REQUEST, UserRequestPacket.class);
        packetTypeMap.put(Command.USER_INFO_RESPONSE, UserResponsePacket.class);
        packetTypeMap.put(Command.GROUP_MESSAGE_LIST_REQUEST, GroupMessageListRequestPacket.class);
        packetTypeMap.put(Command.GROUP_MESSAGE_LIST_RESPONSE, GroupMessageListResponsePacket.class);
        packetTypeMap.put(Command.GROUP_LIST_REQUEST, GroupListRequestPacket.class);
        packetTypeMap.put(Command.GROUP_LIST_RESPONSE, GroupListResponsePacket.class);
        serializerMap = new HashMap<>();
        Serializer serializer = new JSONSerializer();
        serializerMap.put(serializer.getSerializerAlgorithm(), serializer);
    }

    /**
     * 编码
     * 报文格式：magic4字节 + 版本1字节 + 序列化算法1字节 + 指令1字节 + 数据长度4字节 + 数据内容
     * 总字节长度 = 11 + 数据内容长度
     *
     * @param byteBuf 字节码容器
     * @param packet  Packet数据包
     * @return ByteBuf字节码
     */
    public void encode(ByteBuf byteBuf, Packet packet) {
        // 序列化 Java 对象
        byte[] bytes = Serializer.DEFAULT.serialize(packet);

        // 通讯协议规则
        byteBuf.writeInt(MAGIC_NUMBER);
        byteBuf.writeByte(packet.getVersion());
        byteBuf.writeByte(Serializer.DEFAULT.getSerializerAlgorithm());
        byteBuf.writeByte(packet.getCommand());
        byteBuf.writeInt(bytes.length);
        byteBuf.writeBytes(bytes);
    }

    /**
     * 解码
     * 报文格式：magic4字节 + 版本1字节 + 序列化算法1字节 + 指令1字节 + 数据长度4字节 + 数据内容
     * 总字节长度 = 11 + 数据内容长度
     *
     * @param byteBuf ByteBuf字节码
     * @return Packet数据包
     */
    public Packet decode(ByteBuf byteBuf) {
        System.out.println("解码开始-----------");
        // 跳过 magic number
        byteBuf.skipBytes(4);

        // 跳过版本号
        byteBuf.skipBytes(1);

        // 序列化算法标识
        byte serializeAlgorithm = byteBuf.readByte();
        System.out.println("serializeAlgorithm = " + serializeAlgorithm);

        // 指令
        byte command = byteBuf.readByte();
        System.out.println("command = " + command);

        // 数据包长度
        int lenght = byteBuf.readInt();
        System.out.println("lenght = " + lenght);

        byte[] bytes = new byte[lenght];
        // 数据包
        byteBuf.readBytes(bytes);
        System.out.println("bytes = " + Arrays.toString(bytes));

        // 根据指令获取数据的原类型
        Class<? extends Packet> requestType = packetTypeMap.get(command);
        // 根据序列化算法获取序列化器
        Serializer serializer = serializerMap.get(serializeAlgorithm);

        if (requestType != null && serializer != null) {
            // 将数据包反序列化成 java 对象
            Packet packet = serializer.deserialize(requestType, bytes);
            System.out.println("packet = " + packet);
            System.out.println("解码结束-----------");
            return packet;
        }
        System.out.println("解码结束-----------");
        return null;
    }

}
