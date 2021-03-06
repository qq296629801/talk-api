package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Notice;
import cn.ymsys.api.orm.model.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int countByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int deleteByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int insert(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int insertSelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    List<Notice> selectByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    Notice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    int updateByPrimaryKey(Notice record);
}