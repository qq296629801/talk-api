package cn.ymsys.api.orm.extend;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExtGroupMapper {
    @Select("select g.id as chatId,g.group_name as chatName,g.avator,g.last_oper_time as lastOperTime,gu.group_master groupMaster from s_group_user gu INNER JOIN s_group g on gu.group_id=g.id where g.`status` =0 and gu.`status` =0 and gu.user_id=#{userId} and g.group_name like #{condition}")
    List<ExtGroup> getGroupList(@Param("userId") String userID, @Param("condition") String condition);
}
