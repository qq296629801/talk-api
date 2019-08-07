package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class Money implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.user_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.group_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.oper
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer oper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.oper_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.oper_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.last_oper_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.last_oper_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.id
     *
     * @return the value of t_money.id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.id
     *
     * @param id the value for t_money.id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.user_id
     *
     * @return the value of t_money.user_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.user_id
     *
     * @param userId the value for t_money.user_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.group_id
     *
     * @return the value of t_money.group_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.group_id
     *
     * @param groupId the value for t_money.group_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.money
     *
     * @return the value of t_money.money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.money
     *
     * @param money the value for t_money.money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.oper
     *
     * @return the value of t_money.oper
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.oper
     *
     * @param oper the value for t_money.oper
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setOper(Integer oper) {
        this.oper = oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.oper_user
     *
     * @return the value of t_money.oper_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.oper_user
     *
     * @param operUser the value for t_money.oper_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.oper_time
     *
     * @return the value of t_money.oper_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.oper_time
     *
     * @param operTime the value for t_money.oper_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.last_oper_user
     *
     * @return the value of t_money.last_oper_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.last_oper_user
     *
     * @param lastOperUser the value for t_money.last_oper_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.last_oper_time
     *
     * @return the value of t_money.last_oper_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.last_oper_time
     *
     * @param lastOperTime the value for t_money.last_oper_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Money other = (Money) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", groupId=").append(groupId);
        sb.append(", money=").append(money);
        sb.append(", oper=").append(oper);
        sb.append(", operUser=").append(operUser);
        sb.append(", operTime=").append(operTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}