package br.order.user.pojo.empComDept;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseDepExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseDepExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andEnterpriseDepIdIsNull() {
            addCriterion("enterprise_dep_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdIsNotNull() {
            addCriterion("enterprise_dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdEqualTo(String value) {
            addCriterion("enterprise_dep_id =", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdNotEqualTo(String value) {
            addCriterion("enterprise_dep_id <>", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdGreaterThan(String value) {
            addCriterion("enterprise_dep_id >", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_id >=", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdLessThan(String value) {
            addCriterion("enterprise_dep_id <", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_id <=", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdLike(String value) {
            addCriterion("enterprise_dep_id like", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdNotLike(String value) {
            addCriterion("enterprise_dep_id not like", value, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdIn(List<String> values) {
            addCriterion("enterprise_dep_id in", values, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdNotIn(List<String> values) {
            addCriterion("enterprise_dep_id not in", values, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdBetween(String value1, String value2) {
            addCriterion("enterprise_dep_id between", value1, value2, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_dep_id not between", value1, value2, "enterpriseDepId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdIsNull() {
            addCriterion("enterprise_dep_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdIsNotNull() {
            addCriterion("enterprise_dep_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdEqualTo(String value) {
            addCriterion("enterprise_dep_parent_id =", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdNotEqualTo(String value) {
            addCriterion("enterprise_dep_parent_id <>", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdGreaterThan(String value) {
            addCriterion("enterprise_dep_parent_id >", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_parent_id >=", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdLessThan(String value) {
            addCriterion("enterprise_dep_parent_id <", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_parent_id <=", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdLike(String value) {
            addCriterion("enterprise_dep_parent_id like", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdNotLike(String value) {
            addCriterion("enterprise_dep_parent_id not like", value, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdIn(List<String> values) {
            addCriterion("enterprise_dep_parent_id in", values, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdNotIn(List<String> values) {
            addCriterion("enterprise_dep_parent_id not in", values, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdBetween(String value1, String value2) {
            addCriterion("enterprise_dep_parent_id between", value1, value2, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepParentIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_dep_parent_id not between", value1, value2, "enterpriseDepParentId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(String value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(String value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(String value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(String value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLike(String value) {
            addCriterion("enterprise_id like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotLike(String value) {
            addCriterion("enterprise_id not like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<String> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<String> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(String value1, String value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameIsNull() {
            addCriterion("enterprise_dep_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameIsNotNull() {
            addCriterion("enterprise_dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameEqualTo(String value) {
            addCriterion("enterprise_dep_name =", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotEqualTo(String value) {
            addCriterion("enterprise_dep_name <>", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameGreaterThan(String value) {
            addCriterion("enterprise_dep_name >", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_name >=", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameLessThan(String value) {
            addCriterion("enterprise_dep_name <", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_name <=", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameLike(String value) {
            addCriterion("enterprise_dep_name like", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotLike(String value) {
            addCriterion("enterprise_dep_name not like", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameIn(List<String> values) {
            addCriterion("enterprise_dep_name in", values, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotIn(List<String> values) {
            addCriterion("enterprise_dep_name not in", values, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameBetween(String value1, String value2) {
            addCriterion("enterprise_dep_name between", value1, value2, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_dep_name not between", value1, value2, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelIsNull() {
            addCriterion("enterprise_dep_level is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelIsNotNull() {
            addCriterion("enterprise_dep_level is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelEqualTo(Integer value) {
            addCriterion("enterprise_dep_level =", value, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelNotEqualTo(Integer value) {
            addCriterion("enterprise_dep_level <>", value, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelGreaterThan(Integer value) {
            addCriterion("enterprise_dep_level >", value, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_dep_level >=", value, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelLessThan(Integer value) {
            addCriterion("enterprise_dep_level <", value, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_dep_level <=", value, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelIn(List<Integer> values) {
            addCriterion("enterprise_dep_level in", values, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelNotIn(List<Integer> values) {
            addCriterion("enterprise_dep_level not in", values, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_dep_level between", value1, value2, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_dep_level not between", value1, value2, "enterpriseDepLevel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusIsNull() {
            addCriterion("enterprise_dep_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusIsNotNull() {
            addCriterion("enterprise_dep_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusEqualTo(Integer value) {
            addCriterion("enterprise_dep_status =", value, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_dep_status <>", value, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusGreaterThan(Integer value) {
            addCriterion("enterprise_dep_status >", value, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_dep_status >=", value, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusLessThan(Integer value) {
            addCriterion("enterprise_dep_status <", value, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_dep_status <=", value, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusIn(List<Integer> values) {
            addCriterion("enterprise_dep_status in", values, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_dep_status not in", values, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_dep_status between", value1, value2, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_dep_status not between", value1, value2, "enterpriseDepStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeIsNull() {
            addCriterion("enterprise_dep_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeIsNotNull() {
            addCriterion("enterprise_dep_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_dep_create_time =", value, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_dep_create_time <>", value, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_dep_create_time >", value, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_dep_create_time >=", value, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeLessThan(Date value) {
            addCriterion("enterprise_dep_create_time <", value, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_dep_create_time <=", value, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_dep_create_time in", values, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_dep_create_time not in", values, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_dep_create_time between", value1, value2, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_dep_create_time not between", value1, value2, "enterpriseDepCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeIsNull() {
            addCriterion("enterprise_dep_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeIsNotNull() {
            addCriterion("enterprise_dep_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeEqualTo(Date value) {
            addCriterion("enterprise_dep_edit_time =", value, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_dep_edit_time <>", value, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_dep_edit_time >", value, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_dep_edit_time >=", value, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeLessThan(Date value) {
            addCriterion("enterprise_dep_edit_time <", value, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_dep_edit_time <=", value, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeIn(List<Date> values) {
            addCriterion("enterprise_dep_edit_time in", values, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_dep_edit_time not in", values, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_dep_edit_time between", value1, value2, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_dep_edit_time not between", value1, value2, "enterpriseDepEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdIsNull() {
            addCriterion("enterprise_dep_edit_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdIsNotNull() {
            addCriterion("enterprise_dep_edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdEqualTo(String value) {
            addCriterion("enterprise_dep_edit_id =", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdNotEqualTo(String value) {
            addCriterion("enterprise_dep_edit_id <>", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdGreaterThan(String value) {
            addCriterion("enterprise_dep_edit_id >", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_edit_id >=", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdLessThan(String value) {
            addCriterion("enterprise_dep_edit_id <", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_edit_id <=", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdLike(String value) {
            addCriterion("enterprise_dep_edit_id like", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdNotLike(String value) {
            addCriterion("enterprise_dep_edit_id not like", value, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdIn(List<String> values) {
            addCriterion("enterprise_dep_edit_id in", values, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdNotIn(List<String> values) {
            addCriterion("enterprise_dep_edit_id not in", values, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdBetween(String value1, String value2) {
            addCriterion("enterprise_dep_edit_id between", value1, value2, "enterpriseDepEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEditIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_dep_edit_id not between", value1, value2, "enterpriseDepEditId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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