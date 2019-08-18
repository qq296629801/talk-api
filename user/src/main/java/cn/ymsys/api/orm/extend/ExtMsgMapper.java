package cn.ymsys.api.orm.extend;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExtMsgMapper {
    @Select("SELECT m.group_id as groupId,m.send_uid as sendUid,m.msg_context as msgContext,m.oper_time as operTime,u.avatar,u.user_name as userName,m.id from s_group_msg m INNER JOIN s_user u on u.id=m.send_uid where m.`status` =0 and u.`status` =0 and m.group_id=#{groupId} order by m.last_oper_time desc")
    List<ExtMsg> queryMessageList(@Param("groupId") String groupId);
}
