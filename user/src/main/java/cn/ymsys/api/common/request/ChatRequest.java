package cn.ymsys.api.common.request;

import cn.ymsys.api.common.util.PagerUtil;
import lombok.Data;

@Data
public class ChatRequest extends PagerUtil {
    private String userId;
    private Integer chatType;
    private String chatId;
    private String desc;
    private Integer id;
}
