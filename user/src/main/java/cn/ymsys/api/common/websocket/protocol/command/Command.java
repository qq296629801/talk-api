package cn.ymsys.api.common.websocket.protocol.command;

/**
 * 指令
 *
 * @author mjy
 * @date 2019-04-20
 */
public interface Command {

    Byte LOGIN_REQUEST = 1;
    Byte LOGIN_RESPONSE = 2;

    Byte MESSAGE_REQUEST = 3;
    Byte MESSAGE_RESPONSE = 4;

    Byte LOGOUT_REQUEST = 5;
    Byte LOGOUT_RESPONSE = 6;

    Byte CREATE_GROUP_REQUEST = 7;
    Byte CREATE_GROUP_RESPONSE = 8;

    Byte LIST_GROUP_MEMBERS_REQUEST = 9;
    Byte LIST_GROUP_MEMBERS_RESPONSE = 10;

    Byte JOIN_GROUP_REQUEST = 11;
    Byte JOIN_GROUP_RESPONSE = 12;

    Byte QUIT_GROUP_REQUEST = 13;
    Byte QUIT_GROUP_RESPONSE = 14;

    Byte GROUP_MESSAGE_REQUEST = 15;
    Byte GROUP_MESSAGE_RESPONSE = 16;

    Byte HEART_BEAT_REQUEST = 17;
    Byte HEART_BEAT_RESPONSE = 18;

    Byte CHAT_REQUEST = 19;
    Byte CHAT_RESPONSE = 20;

    Byte USER_INFO_REQUEST = 21;
    Byte USER_INFO_RESPONSE = 22;

    Byte GROUP_MESSAGE_LIST_REQUEST = 23;
    Byte GROUP_MESSAGE_LIST_RESPONSE = 24;

    Byte GROUP_LIST_REQUEST = 25;
    Byte GROUP_LIST_RESPONSE = 26;
}
