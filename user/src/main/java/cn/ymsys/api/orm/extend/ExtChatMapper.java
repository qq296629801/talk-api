package cn.ymsys.api.orm.extend;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExtChatMapper {
    @Select("SELECT CASE  WHEN c.chat_type = 1 THEN ( SELECT group_name FROM s_group WHERE id = c.chat_id ) ELSE ( SELECT nick_name FROM s_user WHERE id = c.chat_id ) END AS chatName , CASE  WHEN c.chat_type = 1 THEN ( SELECT avator FROM s_group WHERE id = c.chat_id ) ELSE ( SELECT avatar FROM s_user WHERE id = c.chat_id ) END AS imgUrl, c.content, c.chat_type AS chatType, c.unread_number AS unreadNumber, c.unread_status AS unreadStatus FROM t_chat c WHERE c.`status` = 0 and c.user_id=#{userId} order by last_open_time desc")
    List<ExtChat> queryChats(@Param("userId") String userId);
}
