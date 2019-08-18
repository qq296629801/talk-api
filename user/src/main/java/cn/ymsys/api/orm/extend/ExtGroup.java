package cn.ymsys.api.orm.extend;

import cn.ymsys.api.orm.model.Group;
import lombok.Data;

@Data
public class ExtGroup extends Group {
    private String chatId;
    private String chatName;
    private boolean groupMaster;
}
