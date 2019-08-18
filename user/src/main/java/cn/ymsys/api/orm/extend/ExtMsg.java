package cn.ymsys.api.orm.extend;

import cn.ymsys.api.orm.model.GroupMsg;
import lombok.Data;

@Data
public class ExtMsg extends GroupMsg implements Comparable<ExtMsg> {
    private String avatar;
    private String userName;

    @Override
    public int compareTo(ExtMsg msg) {
        return this.getId() - msg.getId();
    }
}
