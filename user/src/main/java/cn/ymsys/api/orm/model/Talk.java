package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class Talk implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.user_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.talk_type
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer talkType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.talk_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String talkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.read_number
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer readNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.read_status
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Boolean readStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.open_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String openUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.open_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Date openTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.last_open_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String lastOpenUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.last_open_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Date lastOpenTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.status
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_talk.context
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private String context;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.id
     *
     * @return the value of t_talk.id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.id
     *
     * @param id the value for t_talk.id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.user_id
     *
     * @return the value of t_talk.user_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.user_id
     *
     * @param userId the value for t_talk.user_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.talk_type
     *
     * @return the value of t_talk.talk_type
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getTalkType() {
        return talkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.talk_type
     *
     * @param talkType the value for t_talk.talk_type
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.talk_id
     *
     * @return the value of t_talk.talk_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getTalkId() {
        return talkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.talk_id
     *
     * @param talkId the value for t_talk.talk_id
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.read_number
     *
     * @return the value of t_talk.read_number
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getReadNumber() {
        return readNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.read_number
     *
     * @param readNumber the value for t_talk.read_number
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.read_status
     *
     * @return the value of t_talk.read_status
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Boolean getReadStatus() {
        return readStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.read_status
     *
     * @param readStatus the value for t_talk.read_status
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.open_user
     *
     * @return the value of t_talk.open_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getOpenUser() {
        return openUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.open_user
     *
     * @param openUser the value for t_talk.open_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setOpenUser(String openUser) {
        this.openUser = openUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.open_time
     *
     * @return the value of t_talk.open_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Date getOpenTime() {
        return openTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.open_time
     *
     * @param openTime the value for t_talk.open_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.last_open_user
     *
     * @return the value of t_talk.last_open_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getLastOpenUser() {
        return lastOpenUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.last_open_user
     *
     * @param lastOpenUser the value for t_talk.last_open_user
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setLastOpenUser(String lastOpenUser) {
        this.lastOpenUser = lastOpenUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.last_open_time
     *
     * @return the value of t_talk.last_open_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Date getLastOpenTime() {
        return lastOpenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.last_open_time
     *
     * @param lastOpenTime the value for t_talk.last_open_time
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setLastOpenTime(Date lastOpenTime) {
        this.lastOpenTime = lastOpenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.status
     *
     * @return the value of t_talk.status
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.status
     *
     * @param status the value for t_talk.status
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_talk.context
     *
     * @return the value of t_talk.context
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_talk.context
     *
     * @param context the value for t_talk.context
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
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
        Talk other = (Talk) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTalkType() == null ? other.getTalkType() == null : this.getTalkType().equals(other.getTalkType()))
            && (this.getTalkId() == null ? other.getTalkId() == null : this.getTalkId().equals(other.getTalkId()))
            && (this.getReadNumber() == null ? other.getReadNumber() == null : this.getReadNumber().equals(other.getReadNumber()))
            && (this.getReadStatus() == null ? other.getReadStatus() == null : this.getReadStatus().equals(other.getReadStatus()))
            && (this.getOpenUser() == null ? other.getOpenUser() == null : this.getOpenUser().equals(other.getOpenUser()))
            && (this.getOpenTime() == null ? other.getOpenTime() == null : this.getOpenTime().equals(other.getOpenTime()))
            && (this.getLastOpenUser() == null ? other.getLastOpenUser() == null : this.getLastOpenUser().equals(other.getLastOpenUser()))
            && (this.getLastOpenTime() == null ? other.getLastOpenTime() == null : this.getLastOpenTime().equals(other.getLastOpenTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getContext() == null ? other.getContext() == null : this.getContext().equals(other.getContext()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTalkType() == null) ? 0 : getTalkType().hashCode());
        result = prime * result + ((getTalkId() == null) ? 0 : getTalkId().hashCode());
        result = prime * result + ((getReadNumber() == null) ? 0 : getReadNumber().hashCode());
        result = prime * result + ((getReadStatus() == null) ? 0 : getReadStatus().hashCode());
        result = prime * result + ((getOpenUser() == null) ? 0 : getOpenUser().hashCode());
        result = prime * result + ((getOpenTime() == null) ? 0 : getOpenTime().hashCode());
        result = prime * result + ((getLastOpenUser() == null) ? 0 : getLastOpenUser().hashCode());
        result = prime * result + ((getLastOpenTime() == null) ? 0 : getLastOpenTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getContext() == null) ? 0 : getContext().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
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
        sb.append(", talkType=").append(talkType);
        sb.append(", talkId=").append(talkId);
        sb.append(", readNumber=").append(readNumber);
        sb.append(", readStatus=").append(readStatus);
        sb.append(", openUser=").append(openUser);
        sb.append(", openTime=").append(openTime);
        sb.append(", lastOpenUser=").append(lastOpenUser);
        sb.append(", lastOpenTime=").append(lastOpenTime);
        sb.append(", status=").append(status);
        sb.append(", context=").append(context);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}