package cn.ymsys.api.common.request;

import cn.ymsys.api.common.util.PagerUtil;
import lombok.Data;

@Data
public class NoticeRequest extends PagerUtil {
    private Integer groupId;
    private String context;
    private Integer noticeId;
}
