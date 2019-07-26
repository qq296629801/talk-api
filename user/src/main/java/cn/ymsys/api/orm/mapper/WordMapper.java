package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Word;
import cn.ymsys.api.orm.model.WordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int countByExample(WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int deleteByExample(WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int insert(Word record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int insertSelective(Word record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    List<Word> selectByExample(WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") Word record, @Param("example") WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:57:38 CST 2019
     */
    int updateByExample(@Param("record") Word record, @Param("example") WordExample example);
}