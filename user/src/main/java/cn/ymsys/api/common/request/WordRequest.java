package cn.ymsys.api.common.request;

import cn.ymsys.api.common.util.PagerUtil;
import lombok.Data;

@Data
public class WordRequest extends PagerUtil {
    private Integer wordId;
    private String context;
}
