package br.order.user.pojo.empCom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andEnterpriseFullNameIsNull() {
            addCriterion("enterprise_full_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameIsNotNull() {
            addCriterion("enterprise_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameEqualTo(String value) {
            addCriterion("enterprise_full_name =", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotEqualTo(String value) {
            addCriterion("enterprise_full_name <>", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameGreaterThan(String value) {
            addCriterion("enterprise_full_name >", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_full_name >=", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameLessThan(String value) {
            addCriterion("enterprise_full_name <", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_full_name <=", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameLike(String value) {
            addCriterion("enterprise_full_name like", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotLike(String value) {
            addCriterion("enterprise_full_name not like", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameIn(List<String> values) {
            addCriterion("enterprise_full_name in", values, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotIn(List<String> values) {
            addCriterion("enterprise_full_name not in", values, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameBetween(String value1, String value2) {
            addCriterion("enterprise_full_name between", value1, value2, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_full_name not between", value1, value2, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameIsNull() {
            addCriterion("enterprise_simple_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameIsNotNull() {
            addCriterion("enterprise_simple_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameEqualTo(String value) {
            addCriterion("enterprise_simple_name =", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameNotEqualTo(String value) {
            addCriterion("enterprise_simple_name <>", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameGreaterThan(String value) {
            addCriterion("enterprise_simple_name >", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_simple_name >=", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameLessThan(String value) {
            addCriterion("enterprise_simple_name <", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_simple_name <=", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameLike(String value) {
            addCriterion("enterprise_simple_name like", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameNotLike(String value) {
            addCriterion("enterprise_simple_name not like", value, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameIn(List<String> values) {
            addCriterion("enterprise_simple_name in", values, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameNotIn(List<String> values) {
            addCriterion("enterprise_simple_name not in", values, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameBetween(String value1, String value2) {
            addCriterion("enterprise_simple_name between", value1, value2, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSimpleNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_simple_name not between", value1, value2, "enterpriseSimpleName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNull() {
            addCriterion("enterprise_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNotNull() {
            addCriterion("enterprise_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeEqualTo(String value) {
            addCriterion("enterprise_code =", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotEqualTo(String value) {
            addCriterion("enterprise_code <>", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThan(String value) {
            addCriterion("enterprise_code >", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_code >=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThan(String value) {
            addCriterion("enterprise_code <", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_code <=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLike(String value) {
            addCriterion("enterprise_code like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotLike(String value) {
            addCriterion("enterprise_code not like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIn(List<String> values) {
            addCriterion("enterprise_code in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotIn(List<String> values) {
            addCriterion("enterprise_code not in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeBetween(String value1, String value2) {
            addCriterion("enterprise_code between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_code not between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdIsNull() {
            addCriterion("enterprice_license_img_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdIsNotNull() {
            addCriterion("enterprice_license_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdEqualTo(String value) {
            addCriterion("enterprice_license_img_id =", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdNotEqualTo(String value) {
            addCriterion("enterprice_license_img_id <>", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdGreaterThan(String value) {
            addCriterion("enterprice_license_img_id >", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprice_license_img_id >=", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdLessThan(String value) {
            addCriterion("enterprice_license_img_id <", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdLessThanOrEqualTo(String value) {
            addCriterion("enterprice_license_img_id <=", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdLike(String value) {
            addCriterion("enterprice_license_img_id like", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdNotLike(String value) {
            addCriterion("enterprice_license_img_id not like", value, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdIn(List<String> values) {
            addCriterion("enterprice_license_img_id in", values, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdNotIn(List<String> values) {
            addCriterion("enterprice_license_img_id not in", values, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdBetween(String value1, String value2) {
            addCriterion("enterprice_license_img_id between", value1, value2, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseImgIdNotBetween(String value1, String value2) {
            addCriterion("enterprice_license_img_id not between", value1, value2, "enterpriceLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoIsNull() {
            addCriterion("enterprice_license_no is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoIsNotNull() {
            addCriterion("enterprice_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoEqualTo(String value) {
            addCriterion("enterprice_license_no =", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoNotEqualTo(String value) {
            addCriterion("enterprice_license_no <>", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoGreaterThan(String value) {
            addCriterion("enterprice_license_no >", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("enterprice_license_no >=", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoLessThan(String value) {
            addCriterion("enterprice_license_no <", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("enterprice_license_no <=", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoLike(String value) {
            addCriterion("enterprice_license_no like", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoNotLike(String value) {
            addCriterion("enterprice_license_no not like", value, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoIn(List<String> values) {
            addCriterion("enterprice_license_no in", values, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoNotIn(List<String> values) {
            addCriterion("enterprice_license_no not in", values, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoBetween(String value1, String value2) {
            addCriterion("enterprice_license_no between", value1, value2, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseNoNotBetween(String value1, String value2) {
            addCriterion("enterprice_license_no not between", value1, value2, "enterpriceLicenseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdIsNull() {
            addCriterion("enterprice_license_open_img_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdIsNotNull() {
            addCriterion("enterprice_license_open_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdEqualTo(String value) {
            addCriterion("enterprice_license_open_img_id =", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdNotEqualTo(String value) {
            addCriterion("enterprice_license_open_img_id <>", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdGreaterThan(String value) {
            addCriterion("enterprice_license_open_img_id >", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprice_license_open_img_id >=", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdLessThan(String value) {
            addCriterion("enterprice_license_open_img_id <", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdLessThanOrEqualTo(String value) {
            addCriterion("enterprice_license_open_img_id <=", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdLike(String value) {
            addCriterion("enterprice_license_open_img_id like", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdNotLike(String value) {
            addCriterion("enterprice_license_open_img_id not like", value, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdIn(List<String> values) {
            addCriterion("enterprice_license_open_img_id in", values, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdNotIn(List<String> values) {
            addCriterion("enterprice_license_open_img_id not in", values, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdBetween(String value1, String value2) {
            addCriterion("enterprice_license_open_img_id between", value1, value2, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicenseOpenImgIdNotBetween(String value1, String value2) {
            addCriterion("enterprice_license_open_img_id not between", value1, value2, "enterpriceLicenseOpenImgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdIsNull() {
            addCriterion("enterprice_conn_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdIsNotNull() {
            addCriterion("enterprice_conn_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdEqualTo(String value) {
            addCriterion("enterprice_conn_emp_id =", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdNotEqualTo(String value) {
            addCriterion("enterprice_conn_emp_id <>", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdGreaterThan(String value) {
            addCriterion("enterprice_conn_emp_id >", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprice_conn_emp_id >=", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdLessThan(String value) {
            addCriterion("enterprice_conn_emp_id <", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdLessThanOrEqualTo(String value) {
            addCriterion("enterprice_conn_emp_id <=", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdLike(String value) {
            addCriterion("enterprice_conn_emp_id like", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdNotLike(String value) {
            addCriterion("enterprice_conn_emp_id not like", value, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdIn(List<String> values) {
            addCriterion("enterprice_conn_emp_id in", values, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdNotIn(List<String> values) {
            addCriterion("enterprice_conn_emp_id not in", values, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdBetween(String value1, String value2) {
            addCriterion("enterprice_conn_emp_id between", value1, value2, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceConnEmpIdNotBetween(String value1, String value2) {
            addCriterion("enterprice_conn_emp_id not between", value1, value2, "enterpriceConnEmpId");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonIsNull() {
            addCriterion("enterprice_license_person is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonIsNotNull() {
            addCriterion("enterprice_license_person is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonEqualTo(String value) {
            addCriterion("enterprice_license_person =", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonNotEqualTo(String value) {
            addCriterion("enterprice_license_person <>", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonGreaterThan(String value) {
            addCriterion("enterprice_license_person >", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonGreaterThanOrEqualTo(String value) {
            addCriterion("enterprice_license_person >=", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonLessThan(String value) {
            addCriterion("enterprice_license_person <", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonLessThanOrEqualTo(String value) {
            addCriterion("enterprice_license_person <=", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonLike(String value) {
            addCriterion("enterprice_license_person like", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonNotLike(String value) {
            addCriterion("enterprice_license_person not like", value, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonIn(List<String> values) {
            addCriterion("enterprice_license_person in", values, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonNotIn(List<String> values) {
            addCriterion("enterprice_license_person not in", values, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonBetween(String value1, String value2) {
            addCriterion("enterprice_license_person between", value1, value2, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLicensePersonNotBetween(String value1, String value2) {
            addCriterion("enterprice_license_person not between", value1, value2, "enterpriceLicensePerson");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIsNull() {
            addCriterion("enterprise_address is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIsNotNull() {
            addCriterion("enterprise_address is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressEqualTo(String value) {
            addCriterion("enterprise_address =", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotEqualTo(String value) {
            addCriterion("enterprise_address <>", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressGreaterThan(String value) {
            addCriterion("enterprise_address >", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address >=", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLessThan(String value) {
            addCriterion("enterprise_address <", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address <=", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLike(String value) {
            addCriterion("enterprise_address like", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotLike(String value) {
            addCriterion("enterprise_address not like", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIn(List<String> values) {
            addCriterion("enterprise_address in", values, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotIn(List<String> values) {
            addCriterion("enterprise_address not in", values, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressBetween(String value1, String value2) {
            addCriterion("enterprise_address between", value1, value2, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotBetween(String value1, String value2) {
            addCriterion("enterprise_address not between", value1, value2, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusIsNull() {
            addCriterion("enterprise_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusIsNotNull() {
            addCriterion("enterprise_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusEqualTo(Integer value) {
            addCriterion("enterprise_status =", value, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_status <>", value, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusGreaterThan(Integer value) {
            addCriterion("enterprise_status >", value, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_status >=", value, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusLessThan(Integer value) {
            addCriterion("enterprise_status <", value, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_status <=", value, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusIn(List<Integer> values) {
            addCriterion("enterprise_status in", values, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_status not in", values, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_status between", value1, value2, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_status not between", value1, value2, "enterpriseStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeIsNull() {
            addCriterion("enterprise_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeIsNotNull() {
            addCriterion("enterprise_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_create_time =", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_create_time <>", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_create_time >", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_create_time >=", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeLessThan(Date value) {
            addCriterion("enterprise_create_time <", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_create_time <=", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_create_time in", values, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_create_time not in", values, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_create_time between", value1, value2, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_create_time not between", value1, value2, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeIsNull() {
            addCriterion("enterprise_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeIsNotNull() {
            addCriterion("enterprise_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeEqualTo(Date value) {
            addCriterion("enterprise_edit_time =", value, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_edit_time <>", value, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_edit_time >", value, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_edit_time >=", value, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeLessThan(Date value) {
            addCriterion("enterprise_edit_time <", value, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_edit_time <=", value, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeIn(List<Date> values) {
            addCriterion("enterprise_edit_time in", values, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_edit_time not in", values, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_edit_time between", value1, value2, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_edit_time not between", value1, value2, "enterpriseEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdIsNull() {
            addCriterion("enterprise_edit_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdIsNotNull() {
            addCriterion("enterprise_edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdEqualTo(String value) {
            addCriterion("enterprise_edit_id =", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdNotEqualTo(String value) {
            addCriterion("enterprise_edit_id <>", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdGreaterThan(String value) {
            addCriterion("enterprise_edit_id >", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_edit_id >=", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdLessThan(String value) {
            addCriterion("enterprise_edit_id <", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_edit_id <=", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdLike(String value) {
            addCriterion("enterprise_edit_id like", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdNotLike(String value) {
            addCriterion("enterprise_edit_id not like", value, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdIn(List<String> values) {
            addCriterion("enterprise_edit_id in", values, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdNotIn(List<String> values) {
            addCriterion("enterprise_edit_id not in", values, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdBetween(String value1, String value2) {
            addCriterion("enterprise_edit_id between", value1, value2, "enterpriseEditId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEditIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_edit_id not between", value1, value2, "enterpriseEditId");
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