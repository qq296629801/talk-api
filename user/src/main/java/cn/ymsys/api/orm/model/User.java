package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.id
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.user_name
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.password
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.nick_name
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.money
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private Integer money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.status
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.oper_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.oper_time
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.last_oper_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private String lastOperUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.last_oper_time
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private Date lastOperTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.id
     *
     * @return the value of s_user.id
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.id
     *
     * @param id the value for s_user.id
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.user_name
     *
     * @return the value of s_user.user_name
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.user_name
     *
     * @param userName the value for s_user.user_name
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.password
     *
     * @return the value of s_user.password
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.password
     *
     * @param password the value for s_user.password
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.nick_name
     *
     * @return the value of s_user.nick_name
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.nick_name
     *
     * @param nickName the value for s_user.nick_name
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.money
     *
     * @return the value of s_user.money
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.money
     *
     * @param money the value for s_user.money
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.status
     *
     * @return the value of s_user.status
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.status
     *
     * @param status the value for s_user.status
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.oper_user
     *
     * @return the value of s_user.oper_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.oper_user
     *
     * @param operUser the value for s_user.oper_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.oper_time
     *
     * @return the value of s_user.oper_time
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.oper_time
     *
     * @param operTime the value for s_user.oper_time
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.last_oper_user
     *
     * @return the value of s_user.last_oper_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public String getLastOperUser() {
        return lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.last_oper_user
     *
     * @param lastOperUser the value for s_user.last_oper_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.last_oper_time
     *
     * @return the value of s_user.last_oper_time
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public Date getLastOperTime() {
        return lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.last_oper_time
     *
     * @param lastOperTime the value for s_user.last_oper_time
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    public void setLastOperTime(Date lastOperTime) {
        this.lastOperTime = lastOperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getLastOperUser() == null ? other.getLastOperUser() == null : this.getLastOperUser().equals(other.getLastOperUser()))
            && (this.getLastOperTime() == null ? other.getLastOperTime() == null : this.getLastOperTime().equals(other.getLastOperTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getLastOperUser() == null) ? 0 : getLastOperUser().hashCode());
        result = prime * result + ((getLastOperTime() == null) ? 0 : getLastOperTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Sun Jul 28 02:20:22 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", money=").append(money);
        sb.append(", status=").append(status);
        sb.append(", operUser=").append(operUser);
        sb.append(", operTime=").append(operTime);
        sb.append(", lastOperUser=").append(lastOperUser);
        sb.append(", lastOperTime=").append(lastOperTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}