package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.group_name
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.socket_port
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Integer socketPort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.last_oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_group.last_oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_group
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.id
     *
     * @return the value of s_group.id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.id
     *
     * @param id the value for s_group.id
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.group_name
     *
     * @return the value of s_group.group_name
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.group_name
     *
     * @param groupName the value for s_group.group_name
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.socket_port
     *
     * @return the value of s_group.socket_port
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Integer getSocketPort() {
        return socketPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.socket_port
     *
     * @param socketPort the value for s_group.socket_port
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setSocketPort(Integer socketPort) {
        this.socketPort = socketPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.oper_user
     *
     * @return the value of s_group.oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.oper_user
     *
     * @param operUser the value for s_group.oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.oper_time
     *
     * @return the value of s_group.oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.oper_time
     *
     * @param operTime the value for s_group.oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.last_oper_user
     *
     * @return the value of s_group.last_oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.last_oper_user
     *
     * @param lastOperUser the value for s_group.last_oper_user
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_group.last_oper_time
     *
     * @return the value of s_group.last_oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_group.last_oper_time
     *
     * @param lastOperTime the value for s_group.last_oper_time
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
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
        Group other = (Group) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getSocketPort() == null ? other.getSocketPort() == null : this.getSocketPort().equals(other.getSocketPort()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getSocketPort() == null) ? 0 : getSocketPort().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group
     *
     * @mbggenerated Sat Jul 27 17:16:12 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupName=").append(groupName);
        sb.append(", socketPort=").append(socketPort);
        sb.append(", operUser=").append(operUser);
        sb.append(", operTime=").append(operTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}