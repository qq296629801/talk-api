package cn.ymsys.api.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TalkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public TalkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
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
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
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

        public Criteria andTalkTypeIsNull() {
            addCriterion("talk_type is null");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIsNotNull() {
            addCriterion("talk_type is not null");
            return (Criteria) this;
        }

        public Criteria andTalkTypeEqualTo(Integer value) {
            addCriterion("talk_type =", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotEqualTo(Integer value) {
            addCriterion("talk_type <>", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeGreaterThan(Integer value) {
            addCriterion("talk_type >", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("talk_type >=", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeLessThan(Integer value) {
            addCriterion("talk_type <", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("talk_type <=", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIn(List<Integer> values) {
            addCriterion("talk_type in", values, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotIn(List<Integer> values) {
            addCriterion("talk_type not in", values, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeBetween(Integer value1, Integer value2) {
            addCriterion("talk_type between", value1, value2, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("talk_type not between", value1, value2, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkIdIsNull() {
            addCriterion("talk_id is null");
            return (Criteria) this;
        }

        public Criteria andTalkIdIsNotNull() {
            addCriterion("talk_id is not null");
            return (Criteria) this;
        }

        public Criteria andTalkIdEqualTo(String value) {
            addCriterion("talk_id =", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotEqualTo(String value) {
            addCriterion("talk_id <>", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdGreaterThan(String value) {
            addCriterion("talk_id >", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdGreaterThanOrEqualTo(String value) {
            addCriterion("talk_id >=", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLessThan(String value) {
            addCriterion("talk_id <", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLessThanOrEqualTo(String value) {
            addCriterion("talk_id <=", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLike(String value) {
            addCriterion("talk_id like", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotLike(String value) {
            addCriterion("talk_id not like", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdIn(List<String> values) {
            addCriterion("talk_id in", values, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotIn(List<String> values) {
            addCriterion("talk_id not in", values, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdBetween(String value1, String value2) {
            addCriterion("talk_id between", value1, value2, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotBetween(String value1, String value2) {
            addCriterion("talk_id not between", value1, value2, "talkId");
            return (Criteria) this;
        }

        public Criteria andReadNumberIsNull() {
            addCriterion("read_number is null");
            return (Criteria) this;
        }

        public Criteria andReadNumberIsNotNull() {
            addCriterion("read_number is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumberEqualTo(Integer value) {
            addCriterion("read_number =", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberNotEqualTo(Integer value) {
            addCriterion("read_number <>", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberGreaterThan(Integer value) {
            addCriterion("read_number >", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_number >=", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberLessThan(Integer value) {
            addCriterion("read_number <", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberLessThanOrEqualTo(Integer value) {
            addCriterion("read_number <=", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberIn(List<Integer> values) {
            addCriterion("read_number in", values, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberNotIn(List<Integer> values) {
            addCriterion("read_number not in", values, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberBetween(Integer value1, Integer value2) {
            addCriterion("read_number between", value1, value2, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("read_number not between", value1, value2, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNull() {
            addCriterion("read_status is null");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNotNull() {
            addCriterion("read_status is not null");
            return (Criteria) this;
        }

        public Criteria andReadStatusEqualTo(Boolean value) {
            addCriterion("read_status =", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotEqualTo(Boolean value) {
            addCriterion("read_status <>", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThan(Boolean value) {
            addCriterion("read_status >", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("read_status >=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThan(Boolean value) {
            addCriterion("read_status <", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("read_status <=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusIn(List<Boolean> values) {
            addCriterion("read_status in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotIn(List<Boolean> values) {
            addCriterion("read_status not in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("read_status between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("read_status not between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andOpenUserIsNull() {
            addCriterion("open_user is null");
            return (Criteria) this;
        }

        public Criteria andOpenUserIsNotNull() {
            addCriterion("open_user is not null");
            return (Criteria) this;
        }

        public Criteria andOpenUserEqualTo(String value) {
            addCriterion("open_user =", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserNotEqualTo(String value) {
            addCriterion("open_user <>", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserGreaterThan(String value) {
            addCriterion("open_user >", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserGreaterThanOrEqualTo(String value) {
            addCriterion("open_user >=", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserLessThan(String value) {
            addCriterion("open_user <", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserLessThanOrEqualTo(String value) {
            addCriterion("open_user <=", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserLike(String value) {
            addCriterion("open_user like", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserNotLike(String value) {
            addCriterion("open_user not like", value, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserIn(List<String> values) {
            addCriterion("open_user in", values, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserNotIn(List<String> values) {
            addCriterion("open_user not in", values, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserBetween(String value1, String value2) {
            addCriterion("open_user between", value1, value2, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenUserNotBetween(String value1, String value2) {
            addCriterion("open_user not between", value1, value2, "openUser");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(Date value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(Date value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(Date value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(Date value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<Date> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<Date> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(Date value1, Date value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserIsNull() {
            addCriterion("last_open_user is null");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserIsNotNull() {
            addCriterion("last_open_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserEqualTo(String value) {
            addCriterion("last_open_user =", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserNotEqualTo(String value) {
            addCriterion("last_open_user <>", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserGreaterThan(String value) {
            addCriterion("last_open_user >", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserGreaterThanOrEqualTo(String value) {
            addCriterion("last_open_user >=", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserLessThan(String value) {
            addCriterion("last_open_user <", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserLessThanOrEqualTo(String value) {
            addCriterion("last_open_user <=", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserLike(String value) {
            addCriterion("last_open_user like", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserNotLike(String value) {
            addCriterion("last_open_user not like", value, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserIn(List<String> values) {
            addCriterion("last_open_user in", values, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserNotIn(List<String> values) {
            addCriterion("last_open_user not in", values, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserBetween(String value1, String value2) {
            addCriterion("last_open_user between", value1, value2, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenUserNotBetween(String value1, String value2) {
            addCriterion("last_open_user not between", value1, value2, "lastOpenUser");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeIsNull() {
            addCriterion("last_open_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeIsNotNull() {
            addCriterion("last_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeEqualTo(Date value) {
            addCriterion("last_open_time =", value, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeNotEqualTo(Date value) {
            addCriterion("last_open_time <>", value, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeGreaterThan(Date value) {
            addCriterion("last_open_time >", value, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_open_time >=", value, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeLessThan(Date value) {
            addCriterion("last_open_time <", value, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_open_time <=", value, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeIn(List<Date> values) {
            addCriterion("last_open_time in", values, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeNotIn(List<Date> values) {
            addCriterion("last_open_time not in", values, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeBetween(Date value1, Date value2) {
            addCriterion("last_open_time between", value1, value2, "lastOpenTime");
            return (Criteria) this;
        }

        public Criteria andLastOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_open_time not between", value1, value2, "lastOpenTime");
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
     * This class corresponds to the database table t_talk
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 07 09:47:54 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_talk
     *
     * @mbggenerated Wed Aug 07 09:47:54 CST 2019
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