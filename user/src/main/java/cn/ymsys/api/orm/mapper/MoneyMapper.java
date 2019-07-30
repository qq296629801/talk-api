package cn.ymsys.api.orm.mapper;

import cn.ymsys.api.orm.model.Money;
import cn.ymsys.api.orm.model.MoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int countByExample(MoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int deleteByExample(MoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int insert(Money record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int insertSelective(Money record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    List<Money> selectByExample(MoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    Money selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") Money record, @Param("example") MoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int updateByExample(@Param("record") Money record, @Param("example") MoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int updateByPrimaryKeySelective(Money record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Tue Jul 30 20:18:26 CST 2019
     */
    int updateByPrimaryKey(Money record);
}