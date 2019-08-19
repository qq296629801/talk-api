package cn.ymsys.api.orm.extend;

import cn.ymsys.api.orm.model.Chat;
import lombok.Data;

@Data
public class ExtChat extends Chat {
    private String chatName;
    private String imgUrl;
}
