package br.order.user.pojo.empComUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseEmpExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseEmpExample() {
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

        public Criteria andEnterpriseEmpIdIsNull() {
            addCriterion("enterprise_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdIsNotNull() {
            addCriterion("enterprise_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdEqualTo(String value) {
            addCriterion("enterprise_emp_id =", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdNotEqualTo(String value) {
            addCriterion("enterprise_emp_id <>", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdGreaterThan(String value) {
            addCriterion("enterprise_emp_id >", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_emp_id >=", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdLessThan(String value) {
            addCriterion("enterprise_emp_id <", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_emp_id <=", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdLike(String value) {
            addCriterion("enterprise_emp_id like", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdNotLike(String value) {
            addCriterion("enterprise_emp_id not like", value, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdIn(List<String> values) {
            addCriterion("enterprise_emp_id in", values, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdNotIn(List<String> values) {
            addCriterion("enterprise_emp_id not in", values, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdBetween(String value1, String value2) {
            addCriterion("enterprise_emp_id between", value1, value2, "enterpriseEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmpIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_emp_id not between", value1, value2, "enterpriseEmpId");
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