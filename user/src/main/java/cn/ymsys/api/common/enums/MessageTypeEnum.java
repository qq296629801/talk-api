package cn.ymsys.api.common.enums;

public enum MessageTypeEnum {
    TEXT(0, "普通文字消息"),
    IMAGE(1, "图片消息"),
    FILE(2, "文件消息"),
    VOICE(3, "语音消息"),
    VIDEO(4, "视频消息"),
    ATTEND(5, "签到");
    private int value;
    private String name;

    MessageTypeEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static String valueOf(int value) {
        return MessageTypeEnum.values()[value].name;
    }
}
