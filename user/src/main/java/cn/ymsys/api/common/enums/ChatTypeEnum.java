package cn.ymsys.api.common.enums;

public enum ChatTypeEnum {
    GROUP(1, "群聊"),
    FRIEND(0, "好友");
    private int value;
    private String name;

    ChatTypeEnum(int value, String name) {
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
        return ChatTypeEnum.values()[value].name;
    }
}
