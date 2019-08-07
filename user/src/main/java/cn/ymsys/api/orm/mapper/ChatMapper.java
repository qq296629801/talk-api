package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Chat;
import cn.ymsys.api.orm.model.ChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int countByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int deleteByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int insert(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int insertSelective(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    List<Chat> selectByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    Chat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") Chat record, @Param("example") ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int updateByExample(@Param("record") Chat record, @Param("example") ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int updateByPrimaryKeySelective(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat
     *
     * @mbggenerated Wed Aug 07 18:06:42 CST 2019
     */
    int updateByPrimaryKey(Chat record);
}