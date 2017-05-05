package br.order.user.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictRelationshipExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictRelationshipExample() {
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

        public Criteria andDictRelationNameIsNull() {
            addCriterion("dict_relation_name is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameIsNotNull() {
            addCriterion("dict_relation_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameEqualTo(String value) {
            addCriterion("dict_relation_name =", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameNotEqualTo(String value) {
            addCriterion("dict_relation_name <>", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameGreaterThan(String value) {
            addCriterion("dict_relation_name >", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_relation_name >=", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameLessThan(String value) {
            addCriterion("dict_relation_name <", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameLessThanOrEqualTo(String value) {
            addCriterion("dict_relation_name <=", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameLike(String value) {
            addCriterion("dict_relation_name like", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameNotLike(String value) {
            addCriterion("dict_relation_name not like", value, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameIn(List<String> values) {
            addCriterion("dict_relation_name in", values, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameNotIn(List<String> values) {
            addCriterion("dict_relation_name not in", values, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameBetween(String value1, String value2) {
            addCriterion("dict_relation_name between", value1, value2, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationNameNotBetween(String value1, String value2) {
            addCriterion("dict_relation_name not between", value1, value2, "dictRelationName");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeIsNull() {
            addCriterion("dict_relation_code is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeIsNotNull() {
            addCriterion("dict_relation_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeEqualTo(String value) {
            addCriterion("dict_relation_code =", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeNotEqualTo(String value) {
            addCriterion("dict_relation_code <>", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeGreaterThan(String value) {
            addCriterion("dict_relation_code >", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_relation_code >=", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeLessThan(String value) {
            addCriterion("dict_relation_code <", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_relation_code <=", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeLike(String value) {
            addCriterion("dict_relation_code like", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeNotLike(String value) {
            addCriterion("dict_relation_code not like", value, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeIn(List<String> values) {
            addCriterion("dict_relation_code in", values, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeNotIn(List<String> values) {
            addCriterion("dict_relation_code not in", values, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeBetween(String value1, String value2) {
            addCriterion("dict_relation_code between", value1, value2, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodeNotBetween(String value1, String value2) {
            addCriterion("dict_relation_code not between", value1, value2, "dictRelationCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeIsNull() {
            addCriterion("dict_relation_input_code is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeIsNotNull() {
            addCriterion("dict_relation_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeEqualTo(String value) {
            addCriterion("dict_relation_input_code =", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeNotEqualTo(String value) {
            addCriterion("dict_relation_input_code <>", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeGreaterThan(String value) {
            addCriterion("dict_relation_input_code >", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_relation_input_code >=", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeLessThan(String value) {
            addCriterion("dict_relation_input_code <", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_relation_input_code <=", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeLike(String value) {
            addCriterion("dict_relation_input_code like", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeNotLike(String value) {
            addCriterion("dict_relation_input_code not like", value, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeIn(List<String> values) {
            addCriterion("dict_relation_input_code in", values, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeNotIn(List<String> values) {
            addCriterion("dict_relation_input_code not in", values, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeBetween(String value1, String value2) {
            addCriterion("dict_relation_input_code between", value1, value2, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationInputCodeNotBetween(String value1, String value2) {
            addCriterion("dict_relation_input_code not between", value1, value2, "dictRelationInputCode");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteIsNull() {
            addCriterion("dict_relation_note is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteIsNotNull() {
            addCriterion("dict_relation_note is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteEqualTo(String value) {
            addCriterion("dict_relation_note =", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteNotEqualTo(String value) {
            addCriterion("dict_relation_note <>", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteGreaterThan(String value) {
            addCriterion("dict_relation_note >", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteGreaterThanOrEqualTo(String value) {
            addCriterion("dict_relation_note >=", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteLessThan(String value) {
            addCriterion("dict_relation_note <", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteLessThanOrEqualTo(String value) {
            addCriterion("dict_relation_note <=", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteLike(String value) {
            addCriterion("dict_relation_note like", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteNotLike(String value) {
            addCriterion("dict_relation_note not like", value, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteIn(List<String> values) {
            addCriterion("dict_relation_note in", values, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteNotIn(List<String> values) {
            addCriterion("dict_relation_note not in", values, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteBetween(String value1, String value2) {
            addCriterion("dict_relation_note between", value1, value2, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationNoteNotBetween(String value1, String value2) {
            addCriterion("dict_relation_note not between", value1, value2, "dictRelationNote");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexIsNull() {
            addCriterion("dict_relation_codex is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexIsNotNull() {
            addCriterion("dict_relation_codex is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexEqualTo(String value) {
            addCriterion("dict_relation_codex =", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexNotEqualTo(String value) {
            addCriterion("dict_relation_codex <>", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexGreaterThan(String value) {
            addCriterion("dict_relation_codex >", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexGreaterThanOrEqualTo(String value) {
            addCriterion("dict_relation_codex >=", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexLessThan(String value) {
            addCriterion("dict_relation_codex <", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexLessThanOrEqualTo(String value) {
            addCriterion("dict_relation_codex <=", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexLike(String value) {
            addCriterion("dict_relation_codex like", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexNotLike(String value) {
            addCriterion("dict_relation_codex not like", value, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexIn(List<String> values) {
            addCriterion("dict_relation_codex in", values, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexNotIn(List<String> values) {
            addCriterion("dict_relation_codex not in", values, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexBetween(String value1, String value2) {
            addCriterion("dict_relation_codex between", value1, value2, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCodexNotBetween(String value1, String value2) {
            addCriterion("dict_relation_codex not between", value1, value2, "dictRelationCodex");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeIsNull() {
            addCriterion("dict_relation_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeIsNotNull() {
            addCriterion("dict_relation_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeEqualTo(Date value) {
            addCriterion("dict_relation_create_time =", value, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeNotEqualTo(Date value) {
            addCriterion("dict_relation_create_time <>", value, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeGreaterThan(Date value) {
            addCriterion("dict_relation_create_time >", value, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dict_relation_create_time >=", value, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeLessThan(Date value) {
            addCriterion("dict_relation_create_time <", value, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dict_relation_create_time <=", value, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeIn(List<Date> values) {
            addCriterion("dict_relation_create_time in", values, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeNotIn(List<Date> values) {
            addCriterion("dict_relation_create_time not in", values, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dict_relation_create_time between", value1, value2, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dict_relation_create_time not between", value1, value2, "dictRelationCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeIsNull() {
            addCriterion("dict_relation_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeIsNotNull() {
            addCriterion("dict_relation_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeEqualTo(Date value) {
            addCriterion("dict_relation_edit_time =", value, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeNotEqualTo(Date value) {
            addCriterion("dict_relation_edit_time <>", value, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeGreaterThan(Date value) {
            addCriterion("dict_relation_edit_time >", value, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dict_relation_edit_time >=", value, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeLessThan(Date value) {
            addCriterion("dict_relation_edit_time <", value, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("dict_relation_edit_time <=", value, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeIn(List<Date> values) {
            addCriterion("dict_relation_edit_time in", values, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeNotIn(List<Date> values) {
            addCriterion("dict_relation_edit_time not in", values, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeBetween(Date value1, Date value2) {
            addCriterion("dict_relation_edit_time between", value1, value2, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("dict_relation_edit_time not between", value1, value2, "dictRelationEditTime");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusIsNull() {
            addCriterion("dict_relation_status is null");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusIsNotNull() {
            addCriterion("dict_relation_status is not null");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusEqualTo(Integer value) {
            addCriterion("dict_relation_status =", value, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusNotEqualTo(Integer value) {
            addCriterion("dict_relation_status <>", value, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusGreaterThan(Integer value) {
            addCriterion("dict_relation_status >", value, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_relation_status >=", value, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusLessThan(Integer value) {
            addCriterion("dict_relation_status <", value, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dict_relation_status <=", value, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusIn(List<Integer> values) {
            addCriterion("dict_relation_status in", values, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusNotIn(List<Integer> values) {
            addCriterion("dict_relation_status not in", values, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusBetween(Integer value1, Integer value2) {
            addCriterion("dict_relation_status between", value1, value2, "dictRelationStatus");
            return (Criteria) this;
        }

        public Criteria andDictRelationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_relation_status not between", value1, value2, "dictRelationStatus");
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