package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class Attend implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.ip
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.group_id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.user_id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.attend_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private String attendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.oper_user
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.oper_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.last_oper_user
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.last_oper_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attend.status
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_attend
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.id
     *
     * @return the value of t_attend.id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.id
     *
     * @param id the value for t_attend.id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.ip
     *
     * @return the value of t_attend.ip
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.ip
     *
     * @param ip the value for t_attend.ip
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.group_id
     *
     * @return the value of t_attend.group_id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.group_id
     *
     * @param groupId the value for t_attend.group_id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.user_id
     *
     * @return the value of t_attend.user_id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.user_id
     *
     * @param userId the value for t_attend.user_id
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.attend_time
     *
     * @return the value of t_attend.attend_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public String getAttendTime() {
        return attendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.attend_time
     *
     * @param attendTime the value for t_attend.attend_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setAttendTime(String attendTime) {
        this.attendTime = attendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.oper_user
     *
     * @return the value of t_attend.oper_user
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.oper_user
     *
     * @param operUser the value for t_attend.oper_user
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.oper_time
     *
     * @return the value of t_attend.oper_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.oper_time
     *
     * @param operTime the value for t_attend.oper_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.last_oper_user
     *
     * @return the value of t_attend.last_oper_user
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.last_oper_user
     *
     * @param lastOperUser the value for t_attend.last_oper_user
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.last_oper_time
     *
     * @return the value of t_attend.last_oper_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.last_oper_time
     *
     * @param lastOperTime the value for t_attend.last_oper_time
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attend.status
     *
     * @return the value of t_attend.status
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attend.status
     *
     * @param status the value for t_attend.status
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
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
        Attend other = (Attend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAttendTime() == null ? other.getAttendTime() == null : this.getAttendTime().equals(other.getAttendTime()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAttendTime() == null) ? 0 : getAttendTime().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Sat Aug 10 13:30:43 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ip=").append(ip);
        sb.append(", groupId=").append(groupId);
        sb.append(", userId=").append(userId);
        sb.append(", attendTime=").append(attendTime);
        sb.append(", operUser=").append(operUser);
        sb.append(", operTime=").append(operTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}