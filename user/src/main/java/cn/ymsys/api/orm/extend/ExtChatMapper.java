package cn.ymsys.api.orm.extend;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExtChatMapper {
    @Select("SELECT c.id,c.chat_id as chatId,CASE  WHEN c.chat_type = 1 THEN ( SELECT group_name FROM s_group WHERE id = c.chat_id ) ELSE ( SELECT nick_name FROM s_user WHERE id = c.chat_id ) END AS chatName , CASE  WHEN c.chat_type = 1 THEN ( SELECT avator FROM s_group WHERE id = c.chat_id ) ELSE ( SELECT avatar FROM s_user WHERE id = c.chat_id ) END AS imgUrl , CASE  WHEN c.chat_type = 1 THEN ( SELECT msg_context FROM s_group_msg WHERE group_id = c.chat_id ORDER BY id DESC LIMIT 0, 1 ) ELSE ( SELECT msg_context FROM s_friend_msg WHERE friend_uid = c.chat_id ORDER BY id DESC LIMIT 0, 1 ) END AS content, c.last_open_time AS lastOpenTime, c.chat_type AS chatType, c.unread_number AS unreadNumber, c.unread_status AS unreadStatus FROM t_chat c WHERE c.`status` = 0 and c.user_id=#{userId} order by last_open_time desc")
    List<ExtChat> queryChats(@Param("userId") String userId);
}
