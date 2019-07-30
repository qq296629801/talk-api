package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class Blacklist implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.id
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.user_group_id
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private Integer userGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.status
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.oper_user
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.oper_time
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.last_oper_time
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blacklist.last_oper_user
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blacklist
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.id
     *
     * @return the value of t_blacklist.id
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.id
     *
     * @param id the value for t_blacklist.id
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.user_group_id
     *
     * @return the value of t_blacklist.user_group_id
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public Integer getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.user_group_id
     *
     * @param userGroupId the value for t_blacklist.user_group_id
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.status
     *
     * @return the value of t_blacklist.status
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.status
     *
     * @param status the value for t_blacklist.status
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.oper_user
     *
     * @return the value of t_blacklist.oper_user
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.oper_user
     *
     * @param operUser the value for t_blacklist.oper_user
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.oper_time
     *
     * @return the value of t_blacklist.oper_time
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.oper_time
     *
     * @param operTime the value for t_blacklist.oper_time
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.last_oper_time
     *
     * @return the value of t_blacklist.last_oper_time
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.last_oper_time
     *
     * @param lastOperTime the value for t_blacklist.last_oper_time
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blacklist.last_oper_user
     *
     * @return the value of t_blacklist.last_oper_user
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blacklist.last_oper_user
     *
     * @param lastOperUser the value for t_blacklist.last_oper_user
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
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
        Blacklist other = (Blacklist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserGroupId() == null ? other.getUserGroupId() == null : this.getUserGroupId().equals(other.getUserGroupId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blacklist
     *
     * @mbggenerated Tue Jul 30 21:00:41 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userGroupId=").append(userGroupId);
        sb.append(", status=").append(status);
        sb.append(", operUser=").append(operUser);
        sb.append(", operTime=").append(operTime);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}