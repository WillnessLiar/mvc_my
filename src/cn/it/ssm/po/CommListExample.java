package cn.it.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommListExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommNameIsNull() {
            addCriterion("comm_name is null");
            return (Criteria) this;
        }

        public Criteria andCommNameIsNotNull() {
            addCriterion("comm_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommNameEqualTo(String value) {
            addCriterion("comm_name =", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameNotEqualTo(String value) {
            addCriterion("comm_name <>", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameGreaterThan(String value) {
            addCriterion("comm_name >", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameGreaterThanOrEqualTo(String value) {
            addCriterion("comm_name >=", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameLessThan(String value) {
            addCriterion("comm_name <", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameLessThanOrEqualTo(String value) {
            addCriterion("comm_name <=", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameLike(String value) {
            addCriterion("comm_name like", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameNotLike(String value) {
            addCriterion("comm_name not like", value, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameIn(List<String> values) {
            addCriterion("comm_name in", values, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameNotIn(List<String> values) {
            addCriterion("comm_name not in", values, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameBetween(String value1, String value2) {
            addCriterion("comm_name between", value1, value2, "commName");
            return (Criteria) this;
        }

        public Criteria andCommNameNotBetween(String value1, String value2) {
            addCriterion("comm_name not between", value1, value2, "commName");
            return (Criteria) this;
        }

        public Criteria andCommPriceIsNull() {
            addCriterion("comm_price is null");
            return (Criteria) this;
        }

        public Criteria andCommPriceIsNotNull() {
            addCriterion("comm_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommPriceEqualTo(Double value) {
            addCriterion("comm_price =", value, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceNotEqualTo(Double value) {
            addCriterion("comm_price <>", value, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceGreaterThan(Double value) {
            addCriterion("comm_price >", value, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("comm_price >=", value, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceLessThan(Double value) {
            addCriterion("comm_price <", value, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceLessThanOrEqualTo(Double value) {
            addCriterion("comm_price <=", value, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceIn(List<Double> values) {
            addCriterion("comm_price in", values, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceNotIn(List<Double> values) {
            addCriterion("comm_price not in", values, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceBetween(Double value1, Double value2) {
            addCriterion("comm_price between", value1, value2, "commPrice");
            return (Criteria) this;
        }

        public Criteria andCommPriceNotBetween(Double value1, Double value2) {
            addCriterion("comm_price not between", value1, value2, "commPrice");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
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