package cn.ymsys.api.orm.extend;

import cn.ymsys.api.orm.model.GroupMsg;
import lombok.Data;

@Data
public class ExtMsg extends GroupMsg {
    private String avatar;
    private String userName;
}
