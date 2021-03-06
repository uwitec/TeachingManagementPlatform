package com.ruicai.examination.po.evaluation;

import java.util.ArrayList;
import java.util.List;

public class EvaluationDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("ITEM_ID like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("ITEM_ID not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNull() {
            addCriterion("EVALUATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNotNull() {
            addCriterion("EVALUATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdEqualTo(String value) {
            addCriterion("EVALUATION_ID =", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotEqualTo(String value) {
            addCriterion("EVALUATION_ID <>", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThan(String value) {
            addCriterion("EVALUATION_ID >", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION_ID >=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThan(String value) {
            addCriterion("EVALUATION_ID <", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION_ID <=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLike(String value) {
            addCriterion("EVALUATION_ID like", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotLike(String value) {
            addCriterion("EVALUATION_ID not like", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIn(List<String> values) {
            addCriterion("EVALUATION_ID in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotIn(List<String> values) {
            addCriterion("EVALUATION_ID not in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdBetween(String value1, String value2) {
            addCriterion("EVALUATION_ID between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotBetween(String value1, String value2) {
            addCriterion("EVALUATION_ID not between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreIsNull() {
            addCriterion("EVALUATION_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreIsNotNull() {
            addCriterion("EVALUATION_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreEqualTo(Short value) {
            addCriterion("EVALUATION_SCORE =", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreNotEqualTo(Short value) {
            addCriterion("EVALUATION_SCORE <>", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreGreaterThan(Short value) {
            addCriterion("EVALUATION_SCORE >", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("EVALUATION_SCORE >=", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreLessThan(Short value) {
            addCriterion("EVALUATION_SCORE <", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreLessThanOrEqualTo(Short value) {
            addCriterion("EVALUATION_SCORE <=", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreIn(List<Short> values) {
            addCriterion("EVALUATION_SCORE in", values, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreNotIn(List<Short> values) {
            addCriterion("EVALUATION_SCORE not in", values, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreBetween(Short value1, Short value2) {
            addCriterion("EVALUATION_SCORE between", value1, value2, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreNotBetween(Short value1, Short value2) {
            addCriterion("EVALUATION_SCORE not between", value1, value2, "evaluationScore");
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
    }
}