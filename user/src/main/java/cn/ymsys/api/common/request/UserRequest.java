package cn.ymsys.api.common.request;

import cn.ymsys.api.common.util.PagerUtil;
import lombok.Data;

@Data
public class UserRequest extends PagerUtil {
    private String id;
    private String username;
    private String password;
    private String nickName;
    private Integer money;
    private String avatar;
}
