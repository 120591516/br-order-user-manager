package br.order.user.pojo.empUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRegistExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerRegistExample() {
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

        public Criteria andCustomerRegistIdIsNull() {
            addCriterion("customer_regist_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdIsNotNull() {
            addCriterion("customer_regist_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdEqualTo(String value) {
            addCriterion("customer_regist_id =", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdNotEqualTo(String value) {
            addCriterion("customer_regist_id <>", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdGreaterThan(String value) {
            addCriterion("customer_regist_id >", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_regist_id >=", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdLessThan(String value) {
            addCriterion("customer_regist_id <", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdLessThanOrEqualTo(String value) {
            addCriterion("customer_regist_id <=", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdLike(String value) {
            addCriterion("customer_regist_id like", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdNotLike(String value) {
            addCriterion("customer_regist_id not like", value, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdIn(List<String> values) {
            addCriterion("customer_regist_id in", values, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdNotIn(List<String> values) {
            addCriterion("customer_regist_id not in", values, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdBetween(String value1, String value2) {
            addCriterion("customer_regist_id between", value1, value2, "customerRegistId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistIdNotBetween(String value1, String value2) {
            addCriterion("customer_regist_id not between", value1, value2, "customerRegistId");
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

        public Criteria andCustomerRegistPasswordIsNull() {
            addCriterion("customer_regist_password is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordIsNotNull() {
            addCriterion("customer_regist_password is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordEqualTo(String value) {
            addCriterion("customer_regist_password =", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordNotEqualTo(String value) {
            addCriterion("customer_regist_password <>", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordGreaterThan(String value) {
            addCriterion("customer_regist_password >", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("customer_regist_password >=", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordLessThan(String value) {
            addCriterion("customer_regist_password <", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordLessThanOrEqualTo(String value) {
            addCriterion("customer_regist_password <=", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordLike(String value) {
            addCriterion("customer_regist_password like", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordNotLike(String value) {
            addCriterion("customer_regist_password not like", value, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordIn(List<String> values) {
            addCriterion("customer_regist_password in", values, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordNotIn(List<String> values) {
            addCriterion("customer_regist_password not in", values, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordBetween(String value1, String value2) {
            addCriterion("customer_regist_password between", value1, value2, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistPasswordNotBetween(String value1, String value2) {
            addCriterion("customer_regist_password not between", value1, value2, "customerRegistPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIsNull() {
            addCriterion("customer_person is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIsNotNull() {
            addCriterion("customer_person is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonEqualTo(Integer value) {
            addCriterion("customer_person =", value, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonNotEqualTo(Integer value) {
            addCriterion("customer_person <>", value, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonGreaterThan(Integer value) {
            addCriterion("customer_person >", value, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_person >=", value, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonLessThan(Integer value) {
            addCriterion("customer_person <", value, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonLessThanOrEqualTo(Integer value) {
            addCriterion("customer_person <=", value, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIn(List<Integer> values) {
            addCriterion("customer_person in", values, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonNotIn(List<Integer> values) {
            addCriterion("customer_person not in", values, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonBetween(Integer value1, Integer value2) {
            addCriterion("customer_person between", value1, value2, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_person not between", value1, value2, "customerPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdIsNull() {
            addCriterion("customer_person_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdIsNotNull() {
            addCriterion("customer_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdEqualTo(String value) {
            addCriterion("customer_person_id =", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdNotEqualTo(String value) {
            addCriterion("customer_person_id <>", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdGreaterThan(String value) {
            addCriterion("customer_person_id >", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_person_id >=", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdLessThan(String value) {
            addCriterion("customer_person_id <", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdLessThanOrEqualTo(String value) {
            addCriterion("customer_person_id <=", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdLike(String value) {
            addCriterion("customer_person_id like", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdNotLike(String value) {
            addCriterion("customer_person_id not like", value, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdIn(List<String> values) {
            addCriterion("customer_person_id in", values, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdNotIn(List<String> values) {
            addCriterion("customer_person_id not in", values, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdBetween(String value1, String value2) {
            addCriterion("customer_person_id between", value1, value2, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerPersonIdNotBetween(String value1, String value2) {
            addCriterion("customer_person_id not between", value1, value2, "customerPersonId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIsNull() {
            addCriterion("customer_company is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIsNotNull() {
            addCriterion("customer_company is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyEqualTo(Integer value) {
            addCriterion("customer_company =", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotEqualTo(Integer value) {
            addCriterion("customer_company <>", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyGreaterThan(Integer value) {
            addCriterion("customer_company >", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_company >=", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLessThan(Integer value) {
            addCriterion("customer_company <", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("customer_company <=", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIn(List<Integer> values) {
            addCriterion("customer_company in", values, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotIn(List<Integer> values) {
            addCriterion("customer_company not in", values, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyBetween(Integer value1, Integer value2) {
            addCriterion("customer_company between", value1, value2, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_company not between", value1, value2, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdIsNull() {
            addCriterion("customer_company_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdIsNotNull() {
            addCriterion("customer_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdEqualTo(String value) {
            addCriterion("customer_company_id =", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdNotEqualTo(String value) {
            addCriterion("customer_company_id <>", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdGreaterThan(String value) {
            addCriterion("customer_company_id >", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_company_id >=", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdLessThan(String value) {
            addCriterion("customer_company_id <", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("customer_company_id <=", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdLike(String value) {
            addCriterion("customer_company_id like", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdNotLike(String value) {
            addCriterion("customer_company_id not like", value, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdIn(List<String> values) {
            addCriterion("customer_company_id in", values, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdNotIn(List<String> values) {
            addCriterion("customer_company_id not in", values, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdBetween(String value1, String value2) {
            addCriterion("customer_company_id between", value1, value2, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIdNotBetween(String value1, String value2) {
            addCriterion("customer_company_id not between", value1, value2, "customerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailIsNull() {
            addCriterion("customer_regist_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailIsNotNull() {
            addCriterion("customer_regist_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailEqualTo(Integer value) {
            addCriterion("customer_regist_email =", value, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailNotEqualTo(Integer value) {
            addCriterion("customer_regist_email <>", value, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailGreaterThan(Integer value) {
            addCriterion("customer_regist_email >", value, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_regist_email >=", value, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailLessThan(Integer value) {
            addCriterion("customer_regist_email <", value, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailLessThanOrEqualTo(Integer value) {
            addCriterion("customer_regist_email <=", value, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailIn(List<Integer> values) {
            addCriterion("customer_regist_email in", values, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailNotIn(List<Integer> values) {
            addCriterion("customer_regist_email not in", values, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailBetween(Integer value1, Integer value2) {
            addCriterion("customer_regist_email between", value1, value2, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEmailNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_regist_email not between", value1, value2, "customerRegistEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsIsNull() {
            addCriterion("customer_regist_sms is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsIsNotNull() {
            addCriterion("customer_regist_sms is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsEqualTo(Integer value) {
            addCriterion("customer_regist_sms =", value, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsNotEqualTo(Integer value) {
            addCriterion("customer_regist_sms <>", value, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsGreaterThan(Integer value) {
            addCriterion("customer_regist_sms >", value, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_regist_sms >=", value, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsLessThan(Integer value) {
            addCriterion("customer_regist_sms <", value, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsLessThanOrEqualTo(Integer value) {
            addCriterion("customer_regist_sms <=", value, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsIn(List<Integer> values) {
            addCriterion("customer_regist_sms in", values, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsNotIn(List<Integer> values) {
            addCriterion("customer_regist_sms not in", values, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsBetween(Integer value1, Integer value2) {
            addCriterion("customer_regist_sms between", value1, value2, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_regist_sms not between", value1, value2, "customerRegistSms");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusIsNull() {
            addCriterion("customer_regist_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusIsNotNull() {
            addCriterion("customer_regist_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusEqualTo(Integer value) {
            addCriterion("customer_regist_status =", value, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusNotEqualTo(Integer value) {
            addCriterion("customer_regist_status <>", value, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusGreaterThan(Integer value) {
            addCriterion("customer_regist_status >", value, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_regist_status >=", value, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusLessThan(Integer value) {
            addCriterion("customer_regist_status <", value, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_regist_status <=", value, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusIn(List<Integer> values) {
            addCriterion("customer_regist_status in", values, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusNotIn(List<Integer> values) {
            addCriterion("customer_regist_status not in", values, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_regist_status between", value1, value2, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_regist_status not between", value1, value2, "customerRegistStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeIsNull() {
            addCriterion("customer_regist_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeIsNotNull() {
            addCriterion("customer_regist_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeEqualTo(Date value) {
            addCriterion("customer_regist_create_time =", value, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_regist_create_time <>", value, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeGreaterThan(Date value) {
            addCriterion("customer_regist_create_time >", value, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_regist_create_time >=", value, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeLessThan(Date value) {
            addCriterion("customer_regist_create_time <", value, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_regist_create_time <=", value, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeIn(List<Date> values) {
            addCriterion("customer_regist_create_time in", values, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_regist_create_time not in", values, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_regist_create_time between", value1, value2, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_regist_create_time not between", value1, value2, "customerRegistCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeIsNull() {
            addCriterion("customer_regist_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeIsNotNull() {
            addCriterion("customer_regist_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeEqualTo(Date value) {
            addCriterion("customer_regist_edit_time =", value, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeNotEqualTo(Date value) {
            addCriterion("customer_regist_edit_time <>", value, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeGreaterThan(Date value) {
            addCriterion("customer_regist_edit_time >", value, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_regist_edit_time >=", value, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeLessThan(Date value) {
            addCriterion("customer_regist_edit_time <", value, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_regist_edit_time <=", value, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeIn(List<Date> values) {
            addCriterion("customer_regist_edit_time in", values, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeNotIn(List<Date> values) {
            addCriterion("customer_regist_edit_time not in", values, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_regist_edit_time between", value1, value2, "customerRegistEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerRegistEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_regist_edit_time not between", value1, value2, "customerRegistEditTime");
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