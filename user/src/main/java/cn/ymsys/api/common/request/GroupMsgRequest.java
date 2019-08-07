package cn.ymsys.api.common.request;

import cn.ymsys.api.common.util.PagerUtil;
import lombok.Data;

@Data
public class GroupMsgRequest extends PagerUtil {
    private String groupId;
    private String sendUid;
    private Integer msgType;
    private String message;
    private Integer id;
}
