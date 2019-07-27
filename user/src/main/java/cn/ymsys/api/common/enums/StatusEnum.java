package cn.ymsys.api.common.enums;

public enum StatusEnum {
    NORMAL(0, "正常"),
    DELETE(1, "删除");
    private int state;
    private String name;

    StatusEnum(int state, String name) {
        this.state = state;
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static String valueOf(int state) {
        return StatusEnum.values()[state].name;
    }
}
