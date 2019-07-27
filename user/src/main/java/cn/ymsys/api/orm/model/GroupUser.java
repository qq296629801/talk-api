package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class GroupUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_user.group_id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_user.user_id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_user.oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_user.oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_user.last_oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_user.last_oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_group_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_user.group_id
     *
     * @return the value of s_group_user.group_id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_user.group_id
     *
     * @param groupId the value for s_group_user.group_id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_user.user_id
     *
     * @return the value of s_group_user.user_id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_user.user_id
     *
     * @param userId the value for s_group_user.user_id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_user.oper_time
     *
     * @return the value of s_group_user.oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_user.oper_time
     *
     * @param operTime the value for s_group_user.oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_user.oper_user
     *
     * @return the value of s_group_user.oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_user.oper_user
     *
     * @param operUser the value for s_group_user.oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_user.last_oper_time
     *
     * @return the value of s_group_user.last_oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_user.last_oper_time
     *
     * @param lastOperTime the value for s_group_user.last_oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_user.last_oper_user
     *
     * @return the value of s_group_user.last_oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_user.last_oper_user
     *
     * @param lastOperUser the value for s_group_user.last_oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
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
        GroupUser other = (GroupUser) that;
        return (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", userId=").append(userId);
        sb.append(", operTime=").append(operTime);
        sb.append(", operUser=").append(operUser);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}