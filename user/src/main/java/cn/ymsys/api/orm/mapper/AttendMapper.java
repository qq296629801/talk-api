package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Attend;
import cn.ymsys.api.orm.model.AttendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int countByExample(AttendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int deleteByExample(AttendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int insert(Attend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int insertSelective(Attend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    List<Attend> selectByExample(AttendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    Attend selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") Attend record, @Param("example") AttendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int updateByExample(@Param("record") Attend record, @Param("example") AttendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int updateByPrimaryKeySelective(Attend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Tue Jul 30 21:43:58 CST 2019
     */
    int updateByPrimaryKey(Attend record);
}