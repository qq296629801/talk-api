package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Talk;
import cn.ymsys.api.orm.model.TalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int countByExample(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int deleteByExample(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int insert(Talk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int insertSelective(Talk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    List<Talk> selectByExampleWithBLOBs(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    List<Talk> selectByExample(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int updateByExampleSelective(@Param("record") Talk record, @Param("example") TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Talk record, @Param("example") TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Thu Jul 25 20:26:37 CST 2019
     */
    int updateByExample(@Param("record") Talk record, @Param("example") TalkExample example);
}