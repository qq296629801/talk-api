package cn.ymsys.api.orm.extend;

import cn.ymsys.api.orm.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExtUserMapper {
    @Select("select u.* from s_user u ,s_group_user g where g.`status` =0 and u.`status` =0 and u.id=g.user_id and g.group_id=#{groupId}")
    List<User> queryUsers(@Param("groupId") String groupId);
}