package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Blacklist;
import cn.ymsys.api.orm.model.BlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlacklistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int countByExample(BlacklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int deleteByExample(BlacklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int insert(Blacklist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int insertSelective(Blacklist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    List<Blacklist> selectByExample(BlacklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    Blacklist selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") Blacklist record, @Param("example") BlacklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByExample(@Param("record") Blacklist record, @Param("example") BlacklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByPrimaryKeySelective(Blacklist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByPrimaryKey(Blacklist record);
}