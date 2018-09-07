package com.etransfar.transBank.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAccountDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAccountDetailExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("serial_no like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("serial_no not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andTradeChannelIsNull() {
            addCriterion("trade_channel is null");
            return (Criteria) this;
        }

        public Criteria andTradeChannelIsNotNull() {
            addCriterion("trade_channel is not null");
            return (Criteria) this;
        }

        public Criteria andTradeChannelEqualTo(Byte value) {
            addCriterion("trade_channel =", value, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelNotEqualTo(Byte value) {
            addCriterion("trade_channel <>", value, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelGreaterThan(Byte value) {
            addCriterion("trade_channel >", value, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("trade_channel >=", value, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelLessThan(Byte value) {
            addCriterion("trade_channel <", value, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelLessThanOrEqualTo(Byte value) {
            addCriterion("trade_channel <=", value, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelIn(List<Byte> values) {
            addCriterion("trade_channel in", values, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelNotIn(List<Byte> values) {
            addCriterion("trade_channel not in", values, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelBetween(Byte value1, Byte value2) {
            addCriterion("trade_channel between", value1, value2, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("trade_channel not between", value1, value2, "tradeChannel");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Byte value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Byte value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Byte value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Byte value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Byte> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Byte> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Byte value1, Byte value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bank_no =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bank_no >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("bank_no <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("bank_no like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("bank_no not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bank_no in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoIsNull() {
            addCriterion("opp_account_no is null");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoIsNotNull() {
            addCriterion("opp_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoEqualTo(String value) {
            addCriterion("opp_account_no =", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoNotEqualTo(String value) {
            addCriterion("opp_account_no <>", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoGreaterThan(String value) {
            addCriterion("opp_account_no >", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("opp_account_no >=", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoLessThan(String value) {
            addCriterion("opp_account_no <", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoLessThanOrEqualTo(String value) {
            addCriterion("opp_account_no <=", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoLike(String value) {
            addCriterion("opp_account_no like", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoNotLike(String value) {
            addCriterion("opp_account_no not like", value, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoIn(List<String> values) {
            addCriterion("opp_account_no in", values, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoNotIn(List<String> values) {
            addCriterion("opp_account_no not in", values, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoBetween(String value1, String value2) {
            addCriterion("opp_account_no between", value1, value2, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNoNotBetween(String value1, String value2) {
            addCriterion("opp_account_no not between", value1, value2, "oppAccountNo");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameIsNull() {
            addCriterion("opp_account_name is null");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameIsNotNull() {
            addCriterion("opp_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameEqualTo(String value) {
            addCriterion("opp_account_name =", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameNotEqualTo(String value) {
            addCriterion("opp_account_name <>", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameGreaterThan(String value) {
            addCriterion("opp_account_name >", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("opp_account_name >=", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameLessThan(String value) {
            addCriterion("opp_account_name <", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameLessThanOrEqualTo(String value) {
            addCriterion("opp_account_name <=", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameLike(String value) {
            addCriterion("opp_account_name like", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameNotLike(String value) {
            addCriterion("opp_account_name not like", value, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameIn(List<String> values) {
            addCriterion("opp_account_name in", values, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameNotIn(List<String> values) {
            addCriterion("opp_account_name not in", values, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameBetween(String value1, String value2) {
            addCriterion("opp_account_name between", value1, value2, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppAccountNameNotBetween(String value1, String value2) {
            addCriterion("opp_account_name not between", value1, value2, "oppAccountName");
            return (Criteria) this;
        }

        public Criteria andOppBankNoIsNull() {
            addCriterion("opp_bank_no is null");
            return (Criteria) this;
        }

        public Criteria andOppBankNoIsNotNull() {
            addCriterion("opp_bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andOppBankNoEqualTo(String value) {
            addCriterion("opp_bank_no =", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoNotEqualTo(String value) {
            addCriterion("opp_bank_no <>", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoGreaterThan(String value) {
            addCriterion("opp_bank_no >", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("opp_bank_no >=", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoLessThan(String value) {
            addCriterion("opp_bank_no <", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoLessThanOrEqualTo(String value) {
            addCriterion("opp_bank_no <=", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoLike(String value) {
            addCriterion("opp_bank_no like", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoNotLike(String value) {
            addCriterion("opp_bank_no not like", value, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoIn(List<String> values) {
            addCriterion("opp_bank_no in", values, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoNotIn(List<String> values) {
            addCriterion("opp_bank_no not in", values, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoBetween(String value1, String value2) {
            addCriterion("opp_bank_no between", value1, value2, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNoNotBetween(String value1, String value2) {
            addCriterion("opp_bank_no not between", value1, value2, "oppBankNo");
            return (Criteria) this;
        }

        public Criteria andOppBankNameIsNull() {
            addCriterion("opp_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andOppBankNameIsNotNull() {
            addCriterion("opp_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andOppBankNameEqualTo(String value) {
            addCriterion("opp_bank_name =", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameNotEqualTo(String value) {
            addCriterion("opp_bank_name <>", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameGreaterThan(String value) {
            addCriterion("opp_bank_name >", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("opp_bank_name >=", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameLessThan(String value) {
            addCriterion("opp_bank_name <", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameLessThanOrEqualTo(String value) {
            addCriterion("opp_bank_name <=", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameLike(String value) {
            addCriterion("opp_bank_name like", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameNotLike(String value) {
            addCriterion("opp_bank_name not like", value, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameIn(List<String> values) {
            addCriterion("opp_bank_name in", values, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameNotIn(List<String> values) {
            addCriterion("opp_bank_name not in", values, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameBetween(String value1, String value2) {
            addCriterion("opp_bank_name between", value1, value2, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andOppBankNameNotBetween(String value1, String value2) {
            addCriterion("opp_bank_name not between", value1, value2, "oppBankName");
            return (Criteria) this;
        }

        public Criteria andCurCodeIsNull() {
            addCriterion("cur_code is null");
            return (Criteria) this;
        }

        public Criteria andCurCodeIsNotNull() {
            addCriterion("cur_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurCodeEqualTo(Byte value) {
            addCriterion("cur_code =", value, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeNotEqualTo(Byte value) {
            addCriterion("cur_code <>", value, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeGreaterThan(Byte value) {
            addCriterion("cur_code >", value, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cur_code >=", value, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeLessThan(Byte value) {
            addCriterion("cur_code <", value, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeLessThanOrEqualTo(Byte value) {
            addCriterion("cur_code <=", value, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeIn(List<Byte> values) {
            addCriterion("cur_code in", values, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeNotIn(List<Byte> values) {
            addCriterion("cur_code not in", values, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeBetween(Byte value1, Byte value2) {
            addCriterion("cur_code between", value1, value2, "curCode");
            return (Criteria) this;
        }

        public Criteria andCurCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("cur_code not between", value1, value2, "curCode");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(BigDecimal value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(BigDecimal value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(BigDecimal value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(BigDecimal value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<BigDecimal> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<BigDecimal> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(String value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(String value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(String value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(String value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(String value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(String value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLike(String value) {
            addCriterion("trade_date like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotLike(String value) {
            addCriterion("trade_date not like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<String> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<String> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(String value1, String value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(String value1, String value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(String value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(String value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(String value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(String value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(String value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLike(String value) {
            addCriterion("trade_time like", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotLike(String value) {
            addCriterion("trade_time not like", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<String> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<String> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(String value1, String value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(String value1, String value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIsNull() {
            addCriterion("print_times is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIsNotNull() {
            addCriterion("print_times is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimesEqualTo(Integer value) {
            addCriterion("print_times =", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotEqualTo(Integer value) {
            addCriterion("print_times <>", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesGreaterThan(Integer value) {
            addCriterion("print_times >", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("print_times >=", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesLessThan(Integer value) {
            addCriterion("print_times <", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesLessThanOrEqualTo(Integer value) {
            addCriterion("print_times <=", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIn(List<Integer> values) {
            addCriterion("print_times in", values, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotIn(List<Integer> values) {
            addCriterion("print_times not in", values, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesBetween(Integer value1, Integer value2) {
            addCriterion("print_times between", value1, value2, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("print_times not between", value1, value2, "printTimes");
            return (Criteria) this;
        }

        public Criteria andSumCodeIsNull() {
            addCriterion("sum_code is null");
            return (Criteria) this;
        }

        public Criteria andSumCodeIsNotNull() {
            addCriterion("sum_code is not null");
            return (Criteria) this;
        }

        public Criteria andSumCodeEqualTo(String value) {
            addCriterion("sum_code =", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeNotEqualTo(String value) {
            addCriterion("sum_code <>", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeGreaterThan(String value) {
            addCriterion("sum_code >", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sum_code >=", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeLessThan(String value) {
            addCriterion("sum_code <", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeLessThanOrEqualTo(String value) {
            addCriterion("sum_code <=", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeLike(String value) {
            addCriterion("sum_code like", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeNotLike(String value) {
            addCriterion("sum_code not like", value, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeIn(List<String> values) {
            addCriterion("sum_code in", values, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeNotIn(List<String> values) {
            addCriterion("sum_code not in", values, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeBetween(String value1, String value2) {
            addCriterion("sum_code between", value1, value2, "sumCode");
            return (Criteria) this;
        }

        public Criteria andSumCodeNotBetween(String value1, String value2) {
            addCriterion("sum_code not between", value1, value2, "sumCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeIsNull() {
            addCriterion("protect_code is null");
            return (Criteria) this;
        }

        public Criteria andProtectCodeIsNotNull() {
            addCriterion("protect_code is not null");
            return (Criteria) this;
        }

        public Criteria andProtectCodeEqualTo(String value) {
            addCriterion("protect_code =", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeNotEqualTo(String value) {
            addCriterion("protect_code <>", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeGreaterThan(String value) {
            addCriterion("protect_code >", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("protect_code >=", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeLessThan(String value) {
            addCriterion("protect_code <", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeLessThanOrEqualTo(String value) {
            addCriterion("protect_code <=", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeLike(String value) {
            addCriterion("protect_code like", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeNotLike(String value) {
            addCriterion("protect_code not like", value, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeIn(List<String> values) {
            addCriterion("protect_code in", values, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeNotIn(List<String> values) {
            addCriterion("protect_code not in", values, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeBetween(String value1, String value2) {
            addCriterion("protect_code between", value1, value2, "protectCode");
            return (Criteria) this;
        }

        public Criteria andProtectCodeNotBetween(String value1, String value2) {
            addCriterion("protect_code not between", value1, value2, "protectCode");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPostScriptIsNull() {
            addCriterion("post_script is null");
            return (Criteria) this;
        }

        public Criteria andPostScriptIsNotNull() {
            addCriterion("post_script is not null");
            return (Criteria) this;
        }

        public Criteria andPostScriptEqualTo(String value) {
            addCriterion("post_script =", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptNotEqualTo(String value) {
            addCriterion("post_script <>", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptGreaterThan(String value) {
            addCriterion("post_script >", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptGreaterThanOrEqualTo(String value) {
            addCriterion("post_script >=", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptLessThan(String value) {
            addCriterion("post_script <", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptLessThanOrEqualTo(String value) {
            addCriterion("post_script <=", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptLike(String value) {
            addCriterion("post_script like", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptNotLike(String value) {
            addCriterion("post_script not like", value, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptIn(List<String> values) {
            addCriterion("post_script in", values, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptNotIn(List<String> values) {
            addCriterion("post_script not in", values, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptBetween(String value1, String value2) {
            addCriterion("post_script between", value1, value2, "postScript");
            return (Criteria) this;
        }

        public Criteria andPostScriptNotBetween(String value1, String value2) {
            addCriterion("post_script not between", value1, value2, "postScript");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andReserveIsNull() {
            addCriterion("reserve is null");
            return (Criteria) this;
        }

        public Criteria andReserveIsNotNull() {
            addCriterion("reserve is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEqualTo(String value) {
            addCriterion("reserve =", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotEqualTo(String value) {
            addCriterion("reserve <>", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThan(String value) {
            addCriterion("reserve >", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThanOrEqualTo(String value) {
            addCriterion("reserve >=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThan(String value) {
            addCriterion("reserve <", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThanOrEqualTo(String value) {
            addCriterion("reserve <=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLike(String value) {
            addCriterion("reserve like", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotLike(String value) {
            addCriterion("reserve not like", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveIn(List<String> values) {
            addCriterion("reserve in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotIn(List<String> values) {
            addCriterion("reserve not in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveBetween(String value1, String value2) {
            addCriterion("reserve between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotBetween(String value1, String value2) {
            addCriterion("reserve not between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNull() {
            addCriterion("receipt is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNotNull() {
            addCriterion("receipt is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEqualTo(String value) {
            addCriterion("receipt =", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotEqualTo(String value) {
            addCriterion("receipt <>", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThan(String value) {
            addCriterion("receipt >", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("receipt >=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThan(String value) {
            addCriterion("receipt <", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThanOrEqualTo(String value) {
            addCriterion("receipt <=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLike(String value) {
            addCriterion("receipt like", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotLike(String value) {
            addCriterion("receipt not like", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptIn(List<String> values) {
            addCriterion("receipt in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotIn(List<String> values) {
            addCriterion("receipt not in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptBetween(String value1, String value2) {
            addCriterion("receipt between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotBetween(String value1, String value2) {
            addCriterion("receipt not between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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