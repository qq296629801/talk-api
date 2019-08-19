package cn.ymsys.api.orm.extend;

import cn.ymsys.api.orm.model.User;
import lombok.Data;

@Data
public class ExtUser extends User {
    private boolean groupMaster;
    private String groupNickName;
}
