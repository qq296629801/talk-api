package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.GroupUser;
import cn.ymsys.api.orm.model.GroupUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    int countByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    int deleteByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    int insert(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    int insertSelective(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    List<GroupUser> selectByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_user
     *
     * @mbggenerated Fri Jul 26 10:53:11 CST 2019
     */
    int updateByExample(@Param("record") GroupUser record, @Param("example") GroupUserExample example);
}