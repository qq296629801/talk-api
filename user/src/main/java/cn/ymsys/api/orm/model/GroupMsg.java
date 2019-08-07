package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class GroupMsg implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.id
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.group_id
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.msg_type
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private Integer msgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.send_uid
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private String sendUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.msg_context
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private String msgContext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.status
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.oper_time
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.oper_user
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.last_oper_time
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group_msg.last_oper_user
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_group_msg
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.id
     *
     * @return the value of s_group_msg.id
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.id
     *
     * @param id the value for s_group_msg.id
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.group_id
     *
     * @return the value of s_group_msg.group_id
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.group_id
     *
     * @param groupId the value for s_group_msg.group_id
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.msg_type
     *
     * @return the value of s_group_msg.msg_type
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.msg_type
     *
     * @param msgType the value for s_group_msg.msg_type
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.send_uid
     *
     * @return the value of s_group_msg.send_uid
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public String getSendUid() {
        return sendUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.send_uid
     *
     * @param sendUid the value for s_group_msg.send_uid
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setSendUid(String sendUid) {
        this.sendUid = sendUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.msg_context
     *
     * @return the value of s_group_msg.msg_context
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public String getMsgContext() {
        return msgContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.msg_context
     *
     * @param msgContext the value for s_group_msg.msg_context
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setMsgContext(String msgContext) {
        this.msgContext = msgContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.status
     *
     * @return the value of s_group_msg.status
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.status
     *
     * @param status the value for s_group_msg.status
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.oper_time
     *
     * @return the value of s_group_msg.oper_time
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.oper_time
     *
     * @param operTime the value for s_group_msg.oper_time
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.oper_user
     *
     * @return the value of s_group_msg.oper_user
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.oper_user
     *
     * @param operUser the value for s_group_msg.oper_user
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.last_oper_time
     *
     * @return the value of s_group_msg.last_oper_time
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.last_oper_time
     *
     * @param lastOperTime the value for s_group_msg.last_oper_time
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group_msg.last_oper_user
     *
     * @return the value of s_group_msg.last_oper_user
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group_msg.last_oper_user
     *
     * @param lastOperUser the value for s_group_msg.last_oper_user
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_msg
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
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
        GroupMsg other = (GroupMsg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getSendUid() == null ? other.getSendUid() == null : this.getSendUid().equals(other.getSendUid()))
            && (this.getMsgContext() == null ? other.getMsgContext() == null : this.getMsgContext().equals(other.getMsgContext()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_msg
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getSendUid() == null) ? 0 : getSendUid().hashCode());
        result = prime * result + ((getMsgContext() == null) ? 0 : getMsgContext().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_msg
     *
     * @mbggenerated Wed Aug 07 10:28:33 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", msgType=").append(msgType);
        sb.append(", sendUid=").append(sendUid);
        sb.append(", msgContext=").append(msgContext);
        sb.append(", status=").append(status);
        sb.append(", operTime=").append(operTime);
        sb.append(", operUser=").append(operUser);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}