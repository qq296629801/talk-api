package cn.ymsys.api.orm.model;

import java.io.Serializable;
import java.util.Date;

public class Word implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_word.id
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_word.context
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    private String context;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_word.oper_user
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    private String operUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_word.oper_time
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    private Date operTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_word.id
     *
     * @return the value of t_word.id
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_word.id
     *
     * @param id the value for t_word.id
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_word.context
     *
     * @return the value of t_word.context
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_word.context
     *
     * @param context the value for t_word.context
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_word.oper_user
     *
     * @return the value of t_word.oper_user
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public String getOperUser() {
        return operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_word.oper_user
     *
     * @param operUser the value for t_word.oper_user
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_word.oper_time
     *
     * @return the value of t_word.oper_time
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_word.oper_time
     *
     * @param operTime the value for t_word.oper_time
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
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
        Word other = (Word) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContext() == null ? other.getContext() == null : this.getContext().equals(other.getContext()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContext() == null) ? 0 : getContext().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_word
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", context=").append(context);
        sb.append(", operUser=").append(operUser);
        sb.append(", operTime=").append(operTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}