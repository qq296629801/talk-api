package cn.ymsys.api.common.response;

import cn.ymsys.api.orm.model.User;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class UserResponse extends JSONArray {
    public UserResponse(List<User> users) {
        super(users.isEmpty() ? 0 : users.size());
        for (User user : users) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userName", user.getUserName());
            jsonObject.put("nickName", user.getNickName());
            jsonObject.put("lastOperTime", user.getLastOperTime());
            jsonObject.put("operTime", user.getOperTime());
            jsonObject.put("money", user.getMoney());
            jsonObject.put("status", user.getStatus());
        }
    }
}
