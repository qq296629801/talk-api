package cn.ymsys.api.common.request;

import cn.ymsys.api.common.util.PagerUtil;
import lombok.Data;

@Data
public class GroupRequest extends PagerUtil {
    private String groupName;
    private String groupId;
    private String userId;
    private String avator;
}
