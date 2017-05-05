package br.order.user.pojo.empUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInfoExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerInfoExample() {
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

        public Criteria andCustomerInfoPhoneIsNull() {
            addCriterion("customer_info_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneIsNotNull() {
            addCriterion("customer_info_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneEqualTo(String value) {
            addCriterion("customer_info_phone =", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneNotEqualTo(String value) {
            addCriterion("customer_info_phone <>", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneGreaterThan(String value) {
            addCriterion("customer_info_phone >", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_phone >=", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneLessThan(String value) {
            addCriterion("customer_info_phone <", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_info_phone <=", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneLike(String value) {
            addCriterion("customer_info_phone like", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneNotLike(String value) {
            addCriterion("customer_info_phone not like", value, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneIn(List<String> values) {
            addCriterion("customer_info_phone in", values, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneNotIn(List<String> values) {
            addCriterion("customer_info_phone not in", values, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneBetween(String value1, String value2) {
            addCriterion("customer_info_phone between", value1, value2, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_info_phone not between", value1, value2, "customerInfoPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailIsNull() {
            addCriterion("customer_info_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailIsNotNull() {
            addCriterion("customer_info_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailEqualTo(String value) {
            addCriterion("customer_info_email =", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailNotEqualTo(String value) {
            addCriterion("customer_info_email <>", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailGreaterThan(String value) {
            addCriterion("customer_info_email >", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_email >=", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailLessThan(String value) {
            addCriterion("customer_info_email <", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_info_email <=", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailLike(String value) {
            addCriterion("customer_info_email like", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailNotLike(String value) {
            addCriterion("customer_info_email not like", value, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailIn(List<String> values) {
            addCriterion("customer_info_email in", values, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailNotIn(List<String> values) {
            addCriterion("customer_info_email not in", values, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailBetween(String value1, String value2) {
            addCriterion("customer_info_email between", value1, value2, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEmailNotBetween(String value1, String value2) {
            addCriterion("customer_info_email not between", value1, value2, "customerInfoEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgIsNull() {
            addCriterion("customer_info_head_img is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgIsNotNull() {
            addCriterion("customer_info_head_img is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgEqualTo(String value) {
            addCriterion("customer_info_head_img =", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgNotEqualTo(String value) {
            addCriterion("customer_info_head_img <>", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgGreaterThan(String value) {
            addCriterion("customer_info_head_img >", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_head_img >=", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgLessThan(String value) {
            addCriterion("customer_info_head_img <", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgLessThanOrEqualTo(String value) {
            addCriterion("customer_info_head_img <=", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgLike(String value) {
            addCriterion("customer_info_head_img like", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgNotLike(String value) {
            addCriterion("customer_info_head_img not like", value, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgIn(List<String> values) {
            addCriterion("customer_info_head_img in", values, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgNotIn(List<String> values) {
            addCriterion("customer_info_head_img not in", values, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgBetween(String value1, String value2) {
            addCriterion("customer_info_head_img between", value1, value2, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoHeadImgNotBetween(String value1, String value2) {
            addCriterion("customer_info_head_img not between", value1, value2, "customerInfoHeadImg");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexIsNull() {
            addCriterion("customer_info_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexIsNotNull() {
            addCriterion("customer_info_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexEqualTo(Integer value) {
            addCriterion("customer_info_sex =", value, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexNotEqualTo(Integer value) {
            addCriterion("customer_info_sex <>", value, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexGreaterThan(Integer value) {
            addCriterion("customer_info_sex >", value, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_info_sex >=", value, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexLessThan(Integer value) {
            addCriterion("customer_info_sex <", value, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexLessThanOrEqualTo(Integer value) {
            addCriterion("customer_info_sex <=", value, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexIn(List<Integer> values) {
            addCriterion("customer_info_sex in", values, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexNotIn(List<Integer> values) {
            addCriterion("customer_info_sex not in", values, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexBetween(Integer value1, Integer value2) {
            addCriterion("customer_info_sex between", value1, value2, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoSexNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_info_sex not between", value1, value2, "customerInfoSex");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameIsNull() {
            addCriterion("customer_info_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameIsNotNull() {
            addCriterion("customer_info_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameEqualTo(String value) {
            addCriterion("customer_info_name =", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameNotEqualTo(String value) {
            addCriterion("customer_info_name <>", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameGreaterThan(String value) {
            addCriterion("customer_info_name >", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_name >=", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameLessThan(String value) {
            addCriterion("customer_info_name <", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameLessThanOrEqualTo(String value) {
            addCriterion("customer_info_name <=", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameLike(String value) {
            addCriterion("customer_info_name like", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameNotLike(String value) {
            addCriterion("customer_info_name not like", value, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameIn(List<String> values) {
            addCriterion("customer_info_name in", values, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameNotIn(List<String> values) {
            addCriterion("customer_info_name not in", values, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameBetween(String value1, String value2) {
            addCriterion("customer_info_name between", value1, value2, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNameNotBetween(String value1, String value2) {
            addCriterion("customer_info_name not between", value1, value2, "customerInfoName");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberIsNull() {
            addCriterion("customer_info_identity_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberIsNotNull() {
            addCriterion("customer_info_identity_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberEqualTo(String value) {
            addCriterion("customer_info_identity_number =", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberNotEqualTo(String value) {
            addCriterion("customer_info_identity_number <>", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberGreaterThan(String value) {
            addCriterion("customer_info_identity_number >", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_identity_number >=", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberLessThan(String value) {
            addCriterion("customer_info_identity_number <", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberLessThanOrEqualTo(String value) {
            addCriterion("customer_info_identity_number <=", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberLike(String value) {
            addCriterion("customer_info_identity_number like", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberNotLike(String value) {
            addCriterion("customer_info_identity_number not like", value, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberIn(List<String> values) {
            addCriterion("customer_info_identity_number in", values, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberNotIn(List<String> values) {
            addCriterion("customer_info_identity_number not in", values, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberBetween(String value1, String value2) {
            addCriterion("customer_info_identity_number between", value1, value2, "customerInfoIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdentityNumberNotBetween(String value1, String value2) {
            addCriterion("customer_info_identity_number not between", value1, value2, "customerInfoIdentityNumber");
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

        public Criteria andCustomerInfoAddressIsNull() {
            addCriterion("customer_info_address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressIsNotNull() {
            addCriterion("customer_info_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressEqualTo(String value) {
            addCriterion("customer_info_address =", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressNotEqualTo(String value) {
            addCriterion("customer_info_address <>", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressGreaterThan(String value) {
            addCriterion("customer_info_address >", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_address >=", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressLessThan(String value) {
            addCriterion("customer_info_address <", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressLessThanOrEqualTo(String value) {
            addCriterion("customer_info_address <=", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressLike(String value) {
            addCriterion("customer_info_address like", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressNotLike(String value) {
            addCriterion("customer_info_address not like", value, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressIn(List<String> values) {
            addCriterion("customer_info_address in", values, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressNotIn(List<String> values) {
            addCriterion("customer_info_address not in", values, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressBetween(String value1, String value2) {
            addCriterion("customer_info_address between", value1, value2, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoAddressNotBetween(String value1, String value2) {
            addCriterion("customer_info_address not between", value1, value2, "customerInfoAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusIsNull() {
            addCriterion("customer_info_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusIsNotNull() {
            addCriterion("customer_info_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusEqualTo(Integer value) {
            addCriterion("customer_info_status =", value, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusNotEqualTo(Integer value) {
            addCriterion("customer_info_status <>", value, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusGreaterThan(Integer value) {
            addCriterion("customer_info_status >", value, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_info_status >=", value, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusLessThan(Integer value) {
            addCriterion("customer_info_status <", value, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_info_status <=", value, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusIn(List<Integer> values) {
            addCriterion("customer_info_status in", values, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusNotIn(List<Integer> values) {
            addCriterion("customer_info_status not in", values, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_info_status between", value1, value2, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_info_status not between", value1, value2, "customerInfoStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdIsNull() {
            addCriterion("customer_info_edit_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdIsNotNull() {
            addCriterion("customer_info_edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdEqualTo(String value) {
            addCriterion("customer_info_edit_id =", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdNotEqualTo(String value) {
            addCriterion("customer_info_edit_id <>", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdGreaterThan(String value) {
            addCriterion("customer_info_edit_id >", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_edit_id >=", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdLessThan(String value) {
            addCriterion("customer_info_edit_id <", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdLessThanOrEqualTo(String value) {
            addCriterion("customer_info_edit_id <=", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdLike(String value) {
            addCriterion("customer_info_edit_id like", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdNotLike(String value) {
            addCriterion("customer_info_edit_id not like", value, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdIn(List<String> values) {
            addCriterion("customer_info_edit_id in", values, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdNotIn(List<String> values) {
            addCriterion("customer_info_edit_id not in", values, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdBetween(String value1, String value2) {
            addCriterion("customer_info_edit_id between", value1, value2, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditIdNotBetween(String value1, String value2) {
            addCriterion("customer_info_edit_id not between", value1, value2, "customerInfoEditId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeIsNull() {
            addCriterion("customer_info_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeIsNotNull() {
            addCriterion("customer_info_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeEqualTo(Date value) {
            addCriterion("customer_info_create_time =", value, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_info_create_time <>", value, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeGreaterThan(Date value) {
            addCriterion("customer_info_create_time >", value, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_info_create_time >=", value, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeLessThan(Date value) {
            addCriterion("customer_info_create_time <", value, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_info_create_time <=", value, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeIn(List<Date> values) {
            addCriterion("customer_info_create_time in", values, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_info_create_time not in", values, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_info_create_time between", value1, value2, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_info_create_time not between", value1, value2, "customerInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeIsNull() {
            addCriterion("customer_info_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeIsNotNull() {
            addCriterion("customer_info_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeEqualTo(Date value) {
            addCriterion("customer_info_edit_time =", value, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeNotEqualTo(Date value) {
            addCriterion("customer_info_edit_time <>", value, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeGreaterThan(Date value) {
            addCriterion("customer_info_edit_time >", value, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_info_edit_time >=", value, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeLessThan(Date value) {
            addCriterion("customer_info_edit_time <", value, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_info_edit_time <=", value, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeIn(List<Date> values) {
            addCriterion("customer_info_edit_time in", values, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeNotIn(List<Date> values) {
            addCriterion("customer_info_edit_time not in", values, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_info_edit_time between", value1, value2, "customerInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_info_edit_time not between", value1, value2, "customerInfoEditTime");
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