package cn.ymsys.api.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public AttendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAttendTimeIsNull() {
            addCriterion("attend_time is null");
            return (Criteria) this;
        }

        public Criteria andAttendTimeIsNotNull() {
            addCriterion("attend_time is not null");
            return (Criteria) this;
        }

        public Criteria andAttendTimeEqualTo(Date value) {
            addCriterion("attend_time =", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeNotEqualTo(Date value) {
            addCriterion("attend_time <>", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeGreaterThan(Date value) {
            addCriterion("attend_time >", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attend_time >=", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeLessThan(Date value) {
            addCriterion("attend_time <", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeLessThanOrEqualTo(Date value) {
            addCriterion("attend_time <=", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeIn(List<Date> values) {
            addCriterion("attend_time in", values, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeNotIn(List<Date> values) {
            addCriterion("attend_time not in", values, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeBetween(Date value1, Date value2) {
            addCriterion("attend_time between", value1, value2, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeNotBetween(Date value1, Date value2) {
            addCriterion("attend_time not between", value1, value2, "attendTime");
            return (Criteria) this;
        }

        public Criteria andOperUserIsNull() {
            addCriterion("oper_user is null");
            return (Criteria) this;
        }

        public Criteria andOperUserIsNotNull() {
            addCriterion("oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andOperUserEqualTo(String value) {
            addCriterion("oper_user =", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotEqualTo(String value) {
            addCriterion("oper_user <>", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserGreaterThan(String value) {
            addCriterion("oper_user >", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserGreaterThanOrEqualTo(String value) {
            addCriterion("oper_user >=", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserLessThan(String value) {
            addCriterion("oper_user <", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserLessThanOrEqualTo(String value) {
            addCriterion("oper_user <=", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserLike(String value) {
            addCriterion("oper_user like", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotLike(String value) {
            addCriterion("oper_user not like", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserIn(List<String> values) {
            addCriterion("oper_user in", values, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotIn(List<String> values) {
            addCriterion("oper_user not in", values, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserBetween(String value1, String value2) {
            addCriterion("oper_user between", value1, value2, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotBetween(String value1, String value2) {
            addCriterion("oper_user not between", value1, value2, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("oper_time is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Date value) {
            addCriterion("oper_time =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Date value) {
            addCriterion("oper_time <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Date value) {
            addCriterion("oper_time >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oper_time >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Date value) {
            addCriterion("oper_time <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("oper_time <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Date> values) {
            addCriterion("oper_time in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Date> values) {
            addCriterion("oper_time not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Date value1, Date value2) {
            addCriterion("oper_time between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("oper_time not between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andLastOperUserIsNull() {
            addCriterion("last_oper_user is null");
            return (Criteria) this;
        }

        public Criteria andLastOperUserIsNotNull() {
            addCriterion("last_oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastOperUserEqualTo(String value) {
            addCriterion("last_oper_user =", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserNotEqualTo(String value) {
            addCriterion("last_oper_user <>", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserGreaterThan(String value) {
            addCriterion("last_oper_user >", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserGreaterThanOrEqualTo(String value) {
            addCriterion("last_oper_user >=", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserLessThan(String value) {
            addCriterion("last_oper_user <", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserLessThanOrEqualTo(String value) {
            addCriterion("last_oper_user <=", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserLike(String value) {
            addCriterion("last_oper_user like", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserNotLike(String value) {
            addCriterion("last_oper_user not like", value, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserIn(List<String> values) {
            addCriterion("last_oper_user in", values, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserNotIn(List<String> values) {
            addCriterion("last_oper_user not in", values, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserBetween(String value1, String value2) {
            addCriterion("last_oper_user between", value1, value2, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperUserNotBetween(String value1, String value2) {
            addCriterion("last_oper_user not between", value1, value2, "lastOperUser");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeIsNull() {
            addCriterion("last_oper_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeIsNotNull() {
            addCriterion("last_oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeEqualTo(Date value) {
            addCriterion("last_oper_time =", value, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeNotEqualTo(Date value) {
            addCriterion("last_oper_time <>", value, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeGreaterThan(Date value) {
            addCriterion("last_oper_time >", value, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_oper_time >=", value, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeLessThan(Date value) {
            addCriterion("last_oper_time <", value, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_oper_time <=", value, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeIn(List<Date> values) {
            addCriterion("last_oper_time in", values, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeNotIn(List<Date> values) {
            addCriterion("last_oper_time not in", values, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeBetween(Date value1, Date value2) {
            addCriterion("last_oper_time between", value1, value2, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andLastOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_oper_time not between", value1, value2, "lastOperTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_attend
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 26 10:58:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_attend
     *
     * @mbggenerated Fri Jul 26 10:58:59 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}