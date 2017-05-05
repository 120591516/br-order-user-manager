package br.order.user.pojo.empUserRelation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelationshipExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationshipExample() {
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

        public Criteria andRelationshipIdIsNull() {
            addCriterion("relationship_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIsNotNull() {
            addCriterion("relationship_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdEqualTo(String value) {
            addCriterion("relationship_id =", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotEqualTo(String value) {
            addCriterion("relationship_id <>", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdGreaterThan(String value) {
            addCriterion("relationship_id >", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_id >=", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLessThan(String value) {
            addCriterion("relationship_id <", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLessThanOrEqualTo(String value) {
            addCriterion("relationship_id <=", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLike(String value) {
            addCriterion("relationship_id like", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotLike(String value) {
            addCriterion("relationship_id not like", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIn(List<String> values) {
            addCriterion("relationship_id in", values, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotIn(List<String> values) {
            addCriterion("relationship_id not in", values, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdBetween(String value1, String value2) {
            addCriterion("relationship_id between", value1, value2, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotBetween(String value1, String value2) {
            addCriterion("relationship_id not between", value1, value2, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdIsNull() {
            addCriterion("customer_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdIsNotNull() {
            addCriterion("customer_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdEqualTo(String value) {
            addCriterion("customer_info_id =", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotEqualTo(String value) {
            addCriterion("customer_info_id <>", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdGreaterThan(String value) {
            addCriterion("customer_info_id >", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_id >=", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdLessThan(String value) {
            addCriterion("customer_info_id <", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdLessThanOrEqualTo(String value) {
            addCriterion("customer_info_id <=", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdLike(String value) {
            addCriterion("customer_info_id like", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotLike(String value) {
            addCriterion("customer_info_id not like", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdIn(List<String> values) {
            addCriterion("customer_info_id in", values, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotIn(List<String> values) {
            addCriterion("customer_info_id not in", values, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdBetween(String value1, String value2) {
            addCriterion("customer_info_id between", value1, value2, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotBetween(String value1, String value2) {
            addCriterion("customer_info_id not between", value1, value2, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdIsNull() {
            addCriterion("customer_info_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdIsNotNull() {
            addCriterion("customer_info_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdEqualTo(String value) {
            addCriterion("customer_info_relation_id =", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdNotEqualTo(String value) {
            addCriterion("customer_info_relation_id <>", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdGreaterThan(String value) {
            addCriterion("customer_info_relation_id >", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_relation_id >=", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdLessThan(String value) {
            addCriterion("customer_info_relation_id <", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdLessThanOrEqualTo(String value) {
            addCriterion("customer_info_relation_id <=", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdLike(String value) {
            addCriterion("customer_info_relation_id like", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdNotLike(String value) {
            addCriterion("customer_info_relation_id not like", value, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdIn(List<String> values) {
            addCriterion("customer_info_relation_id in", values, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdNotIn(List<String> values) {
            addCriterion("customer_info_relation_id not in", values, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdBetween(String value1, String value2) {
            addCriterion("customer_info_relation_id between", value1, value2, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoRelationIdNotBetween(String value1, String value2) {
            addCriterion("customer_info_relation_id not between", value1, value2, "customerInfoRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdIsNull() {
            addCriterion("dict_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdIsNotNull() {
            addCriterion("dict_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdEqualTo(Long value) {
            addCriterion("dict_relation_id =", value, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdNotEqualTo(Long value) {
            addCriterion("dict_relation_id <>", value, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdGreaterThan(Long value) {
            addCriterion("dict_relation_id >", value, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_relation_id >=", value, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdLessThan(Long value) {
            addCriterion("dict_relation_id <", value, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_relation_id <=", value, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdIn(List<Long> values) {
            addCriterion("dict_relation_id in", values, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdNotIn(List<Long> values) {
            addCriterion("dict_relation_id not in", values, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdBetween(Long value1, Long value2) {
            addCriterion("dict_relation_id between", value1, value2, "dictRelationId");
            return (Criteria) this;
        }

        public Criteria andDictRelationIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_relation_id not between", value1, value2, "dictRelationId");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
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