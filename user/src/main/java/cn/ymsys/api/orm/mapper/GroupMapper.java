package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Group;
import cn.ymsys.api.orm.model.GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int countByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int deleteByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int insert(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int insertSelective(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    List<Group> selectByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);
}