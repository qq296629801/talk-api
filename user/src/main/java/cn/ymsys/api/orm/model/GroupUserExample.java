package cn.ymsys.api.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public GroupUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
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
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupMasterIsNull() {
            addCriterion("group_master is null");
            return (Criteria) this;
        }

        public Criteria andGroupMasterIsNotNull() {
            addCriterion("group_master is not null");
            return (Criteria) this;
        }

        public Criteria andGroupMasterEqualTo(Boolean value) {
            addCriterion("group_master =", value, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterNotEqualTo(Boolean value) {
            addCriterion("group_master <>", value, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterGreaterThan(Boolean value) {
            addCriterion("group_master >", value, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("group_master >=", value, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterLessThan(Boolean value) {
            addCriterion("group_master <", value, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterLessThanOrEqualTo(Boolean value) {
            addCriterion("group_master <=", value, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterIn(List<Boolean> values) {
            addCriterion("group_master in", values, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterNotIn(List<Boolean> values) {
            addCriterion("group_master not in", values, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterBetween(Boolean value1, Boolean value2) {
            addCriterion("group_master between", value1, value2, "groupMaster");
            return (Criteria) this;
        }

        public Criteria andGroupMasterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("group_master not between", value1, value2, "groupMaster");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameIsNull() {
            addCriterion("group_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameIsNotNull() {
            addCriterion("group_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameEqualTo(String value) {
            addCriterion("group_nick_name =", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameNotEqualTo(String value) {
            addCriterion("group_nick_name <>", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameGreaterThan(String value) {
            addCriterion("group_nick_name >", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_nick_name >=", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameLessThan(String value) {
            addCriterion("group_nick_name <", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameLessThanOrEqualTo(String value) {
            addCriterion("group_nick_name <=", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameLike(String value) {
            addCriterion("group_nick_name like", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameNotLike(String value) {
            addCriterion("group_nick_name not like", value, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameIn(List<String> values) {
            addCriterion("group_nick_name in", values, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameNotIn(List<String> values) {
            addCriterion("group_nick_name not in", values, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameBetween(String value1, String value2) {
            addCriterion("group_nick_name between", value1, value2, "groupNickName");
            return (Criteria) this;
        }

        public Criteria andGroupNickNameNotBetween(String value1, String value2) {
            addCriterion("group_nick_name not between", value1, value2, "groupNickName");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_group_user
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 19 21:16:53 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_group_user
     *
     * @mbggenerated Mon Aug 19 21:16:53 CST 2019
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