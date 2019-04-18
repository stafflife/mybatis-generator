package com.hupo.ft.onepunch.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HpTransactionCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HpTransactionCheckExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdIsNull() {
            addCriterion("snapshot_id is null");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdIsNotNull() {
            addCriterion("snapshot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdEqualTo(String value) {
            addCriterion("snapshot_id =", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdNotEqualTo(String value) {
            addCriterion("snapshot_id <>", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdGreaterThan(String value) {
            addCriterion("snapshot_id >", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdGreaterThanOrEqualTo(String value) {
            addCriterion("snapshot_id >=", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdLessThan(String value) {
            addCriterion("snapshot_id <", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdLessThanOrEqualTo(String value) {
            addCriterion("snapshot_id <=", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdLike(String value) {
            addCriterion("snapshot_id like", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdNotLike(String value) {
            addCriterion("snapshot_id not like", value, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdIn(List<String> values) {
            addCriterion("snapshot_id in", values, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdNotIn(List<String> values) {
            addCriterion("snapshot_id not in", values, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdBetween(String value1, String value2) {
            addCriterion("snapshot_id between", value1, value2, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andSnapshotIdNotBetween(String value1, String value2) {
            addCriterion("snapshot_id not between", value1, value2, "snapshotId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdIsNull() {
            addCriterion("hupo_app_id is null");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdIsNotNull() {
            addCriterion("hupo_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdEqualTo(String value) {
            addCriterion("hupo_app_id =", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdNotEqualTo(String value) {
            addCriterion("hupo_app_id <>", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdGreaterThan(String value) {
            addCriterion("hupo_app_id >", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("hupo_app_id >=", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdLessThan(String value) {
            addCriterion("hupo_app_id <", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdLessThanOrEqualTo(String value) {
            addCriterion("hupo_app_id <=", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdLike(String value) {
            addCriterion("hupo_app_id like", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdNotLike(String value) {
            addCriterion("hupo_app_id not like", value, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdIn(List<String> values) {
            addCriterion("hupo_app_id in", values, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdNotIn(List<String> values) {
            addCriterion("hupo_app_id not in", values, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdBetween(String value1, String value2) {
            addCriterion("hupo_app_id between", value1, value2, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andHupoAppIdNotBetween(String value1, String value2) {
            addCriterion("hupo_app_id not between", value1, value2, "hupoAppId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdIsNull() {
            addCriterion("hp_wallet_id is null");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdIsNotNull() {
            addCriterion("hp_wallet_id is not null");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdEqualTo(String value) {
            addCriterion("hp_wallet_id =", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdNotEqualTo(String value) {
            addCriterion("hp_wallet_id <>", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdGreaterThan(String value) {
            addCriterion("hp_wallet_id >", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdGreaterThanOrEqualTo(String value) {
            addCriterion("hp_wallet_id >=", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdLessThan(String value) {
            addCriterion("hp_wallet_id <", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdLessThanOrEqualTo(String value) {
            addCriterion("hp_wallet_id <=", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdLike(String value) {
            addCriterion("hp_wallet_id like", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdNotLike(String value) {
            addCriterion("hp_wallet_id not like", value, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdIn(List<String> values) {
            addCriterion("hp_wallet_id in", values, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdNotIn(List<String> values) {
            addCriterion("hp_wallet_id not in", values, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdBetween(String value1, String value2) {
            addCriterion("hp_wallet_id between", value1, value2, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andHpWalletIdNotBetween(String value1, String value2) {
            addCriterion("hp_wallet_id not between", value1, value2, "hpWalletId");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryIsNull() {
            addCriterion("txn_category is null");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryIsNotNull() {
            addCriterion("txn_category is not null");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryEqualTo(String value) {
            addCriterion("txn_category =", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryNotEqualTo(String value) {
            addCriterion("txn_category <>", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryGreaterThan(String value) {
            addCriterion("txn_category >", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("txn_category >=", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryLessThan(String value) {
            addCriterion("txn_category <", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryLessThanOrEqualTo(String value) {
            addCriterion("txn_category <=", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryLike(String value) {
            addCriterion("txn_category like", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryNotLike(String value) {
            addCriterion("txn_category not like", value, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryIn(List<String> values) {
            addCriterion("txn_category in", values, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryNotIn(List<String> values) {
            addCriterion("txn_category not in", values, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryBetween(String value1, String value2) {
            addCriterion("txn_category between", value1, value2, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTxnCategoryNotBetween(String value1, String value2) {
            addCriterion("txn_category not between", value1, value2, "txnCategory");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNull() {
            addCriterion("trans_no is null");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNotNull() {
            addCriterion("trans_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransNoEqualTo(String value) {
            addCriterion("trans_no =", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotEqualTo(String value) {
            addCriterion("trans_no <>", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThan(String value) {
            addCriterion("trans_no >", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("trans_no >=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThan(String value) {
            addCriterion("trans_no <", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThanOrEqualTo(String value) {
            addCriterion("trans_no <=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLike(String value) {
            addCriterion("trans_no like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotLike(String value) {
            addCriterion("trans_no not like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoIn(List<String> values) {
            addCriterion("trans_no in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotIn(List<String> values) {
            addCriterion("trans_no not in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoBetween(String value1, String value2) {
            addCriterion("trans_no between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotBetween(String value1, String value2) {
            addCriterion("trans_no not between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andTxnIdIsNull() {
            addCriterion("txn_id is null");
            return (Criteria) this;
        }

        public Criteria andTxnIdIsNotNull() {
            addCriterion("txn_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxnIdEqualTo(String value) {
            addCriterion("txn_id =", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdNotEqualTo(String value) {
            addCriterion("txn_id <>", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdGreaterThan(String value) {
            addCriterion("txn_id >", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdGreaterThanOrEqualTo(String value) {
            addCriterion("txn_id >=", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdLessThan(String value) {
            addCriterion("txn_id <", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdLessThanOrEqualTo(String value) {
            addCriterion("txn_id <=", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdLike(String value) {
            addCriterion("txn_id like", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdNotLike(String value) {
            addCriterion("txn_id not like", value, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdIn(List<String> values) {
            addCriterion("txn_id in", values, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdNotIn(List<String> values) {
            addCriterion("txn_id not in", values, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdBetween(String value1, String value2) {
            addCriterion("txn_id between", value1, value2, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnIdNotBetween(String value1, String value2) {
            addCriterion("txn_id not between", value1, value2, "txnId");
            return (Criteria) this;
        }

        public Criteria andTxnTimeIsNull() {
            addCriterion("txn_time is null");
            return (Criteria) this;
        }

        public Criteria andTxnTimeIsNotNull() {
            addCriterion("txn_time is not null");
            return (Criteria) this;
        }

        public Criteria andTxnTimeEqualTo(Date value) {
            addCriterion("txn_time =", value, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeNotEqualTo(Date value) {
            addCriterion("txn_time <>", value, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeGreaterThan(Date value) {
            addCriterion("txn_time >", value, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("txn_time >=", value, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeLessThan(Date value) {
            addCriterion("txn_time <", value, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeLessThanOrEqualTo(Date value) {
            addCriterion("txn_time <=", value, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeIn(List<Date> values) {
            addCriterion("txn_time in", values, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeNotIn(List<Date> values) {
            addCriterion("txn_time not in", values, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeBetween(Date value1, Date value2) {
            addCriterion("txn_time between", value1, value2, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTimeNotBetween(Date value1, Date value2) {
            addCriterion("txn_time not between", value1, value2, "txnTime");
            return (Criteria) this;
        }

        public Criteria andTxnTypeIsNull() {
            addCriterion("txn_type is null");
            return (Criteria) this;
        }

        public Criteria andTxnTypeIsNotNull() {
            addCriterion("txn_type is not null");
            return (Criteria) this;
        }

        public Criteria andTxnTypeEqualTo(String value) {
            addCriterion("txn_type =", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeNotEqualTo(String value) {
            addCriterion("txn_type <>", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeGreaterThan(String value) {
            addCriterion("txn_type >", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("txn_type >=", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeLessThan(String value) {
            addCriterion("txn_type <", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeLessThanOrEqualTo(String value) {
            addCriterion("txn_type <=", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeLike(String value) {
            addCriterion("txn_type like", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeNotLike(String value) {
            addCriterion("txn_type not like", value, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeIn(List<String> values) {
            addCriterion("txn_type in", values, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeNotIn(List<String> values) {
            addCriterion("txn_type not in", values, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeBetween(String value1, String value2) {
            addCriterion("txn_type between", value1, value2, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnTypeNotBetween(String value1, String value2) {
            addCriterion("txn_type not between", value1, value2, "txnType");
            return (Criteria) this;
        }

        public Criteria andTxnAmountIsNull() {
            addCriterion("txn_amount is null");
            return (Criteria) this;
        }

        public Criteria andTxnAmountIsNotNull() {
            addCriterion("txn_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTxnAmountEqualTo(BigDecimal value) {
            addCriterion("txn_amount =", value, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountNotEqualTo(BigDecimal value) {
            addCriterion("txn_amount <>", value, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountGreaterThan(BigDecimal value) {
            addCriterion("txn_amount >", value, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("txn_amount >=", value, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountLessThan(BigDecimal value) {
            addCriterion("txn_amount <", value, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("txn_amount <=", value, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountIn(List<BigDecimal> values) {
            addCriterion("txn_amount in", values, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountNotIn(List<BigDecimal> values) {
            addCriterion("txn_amount not in", values, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txn_amount between", value1, value2, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andTxnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txn_amount not between", value1, value2, "txnAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(BigDecimal value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(BigDecimal value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<BigDecimal> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIsNull() {
            addCriterion("pay_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIsNotNull() {
            addCriterion("pay_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeEqualTo(String value) {
            addCriterion("pay_type_code =", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotEqualTo(String value) {
            addCriterion("pay_type_code <>", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeGreaterThan(String value) {
            addCriterion("pay_type_code >", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type_code >=", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLessThan(String value) {
            addCriterion("pay_type_code <", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_type_code <=", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLike(String value) {
            addCriterion("pay_type_code like", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotLike(String value) {
            addCriterion("pay_type_code not like", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIn(List<String> values) {
            addCriterion("pay_type_code in", values, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotIn(List<String> values) {
            addCriterion("pay_type_code not in", values, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeBetween(String value1, String value2) {
            addCriterion("pay_type_code between", value1, value2, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotBetween(String value1, String value2) {
            addCriterion("pay_type_code not between", value1, value2, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andTxnStatusIsNull() {
            addCriterion("txn_status is null");
            return (Criteria) this;
        }

        public Criteria andTxnStatusIsNotNull() {
            addCriterion("txn_status is not null");
            return (Criteria) this;
        }

        public Criteria andTxnStatusEqualTo(String value) {
            addCriterion("txn_status =", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusNotEqualTo(String value) {
            addCriterion("txn_status <>", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusGreaterThan(String value) {
            addCriterion("txn_status >", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("txn_status >=", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusLessThan(String value) {
            addCriterion("txn_status <", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusLessThanOrEqualTo(String value) {
            addCriterion("txn_status <=", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusLike(String value) {
            addCriterion("txn_status like", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusNotLike(String value) {
            addCriterion("txn_status not like", value, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusIn(List<String> values) {
            addCriterion("txn_status in", values, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusNotIn(List<String> values) {
            addCriterion("txn_status not in", values, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusBetween(String value1, String value2) {
            addCriterion("txn_status between", value1, value2, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andTxnStatusNotBetween(String value1, String value2) {
            addCriterion("txn_status not between", value1, value2, "txnStatus");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoIsNull() {
            addCriterion("sub_order_no is null");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoIsNotNull() {
            addCriterion("sub_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoEqualTo(String value) {
            addCriterion("sub_order_no =", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotEqualTo(String value) {
            addCriterion("sub_order_no <>", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoGreaterThan(String value) {
            addCriterion("sub_order_no >", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("sub_order_no >=", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoLessThan(String value) {
            addCriterion("sub_order_no <", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoLessThanOrEqualTo(String value) {
            addCriterion("sub_order_no <=", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoLike(String value) {
            addCriterion("sub_order_no like", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotLike(String value) {
            addCriterion("sub_order_no not like", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoIn(List<String> values) {
            addCriterion("sub_order_no in", values, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotIn(List<String> values) {
            addCriterion("sub_order_no not in", values, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoBetween(String value1, String value2) {
            addCriterion("sub_order_no between", value1, value2, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotBetween(String value1, String value2) {
            addCriterion("sub_order_no not between", value1, value2, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeIsNull() {
            addCriterion("sub_order_type is null");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeIsNotNull() {
            addCriterion("sub_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeEqualTo(String value) {
            addCriterion("sub_order_type =", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeNotEqualTo(String value) {
            addCriterion("sub_order_type <>", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeGreaterThan(String value) {
            addCriterion("sub_order_type >", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_order_type >=", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeLessThan(String value) {
            addCriterion("sub_order_type <", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("sub_order_type <=", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeLike(String value) {
            addCriterion("sub_order_type like", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeNotLike(String value) {
            addCriterion("sub_order_type not like", value, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeIn(List<String> values) {
            addCriterion("sub_order_type in", values, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeNotIn(List<String> values) {
            addCriterion("sub_order_type not in", values, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeBetween(String value1, String value2) {
            addCriterion("sub_order_type between", value1, value2, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSubOrderTypeNotBetween(String value1, String value2) {
            addCriterion("sub_order_type not between", value1, value2, "subOrderType");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoIsNull() {
            addCriterion("source_wallet_no is null");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoIsNotNull() {
            addCriterion("source_wallet_no is not null");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoEqualTo(String value) {
            addCriterion("source_wallet_no =", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoNotEqualTo(String value) {
            addCriterion("source_wallet_no <>", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoGreaterThan(String value) {
            addCriterion("source_wallet_no >", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoGreaterThanOrEqualTo(String value) {
            addCriterion("source_wallet_no >=", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoLessThan(String value) {
            addCriterion("source_wallet_no <", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoLessThanOrEqualTo(String value) {
            addCriterion("source_wallet_no <=", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoLike(String value) {
            addCriterion("source_wallet_no like", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoNotLike(String value) {
            addCriterion("source_wallet_no not like", value, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoIn(List<String> values) {
            addCriterion("source_wallet_no in", values, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoNotIn(List<String> values) {
            addCriterion("source_wallet_no not in", values, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoBetween(String value1, String value2) {
            addCriterion("source_wallet_no between", value1, value2, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNoNotBetween(String value1, String value2) {
            addCriterion("source_wallet_no not between", value1, value2, "sourceWalletNo");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameIsNull() {
            addCriterion("source_wallet_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameIsNotNull() {
            addCriterion("source_wallet_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameEqualTo(String value) {
            addCriterion("source_wallet_name =", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameNotEqualTo(String value) {
            addCriterion("source_wallet_name <>", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameGreaterThan(String value) {
            addCriterion("source_wallet_name >", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_wallet_name >=", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameLessThan(String value) {
            addCriterion("source_wallet_name <", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameLessThanOrEqualTo(String value) {
            addCriterion("source_wallet_name <=", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameLike(String value) {
            addCriterion("source_wallet_name like", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameNotLike(String value) {
            addCriterion("source_wallet_name not like", value, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameIn(List<String> values) {
            addCriterion("source_wallet_name in", values, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameNotIn(List<String> values) {
            addCriterion("source_wallet_name not in", values, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameBetween(String value1, String value2) {
            addCriterion("source_wallet_name between", value1, value2, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andSourceWalletNameNotBetween(String value1, String value2) {
            addCriterion("source_wallet_name not between", value1, value2, "sourceWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoIsNull() {
            addCriterion("target_wallet_no is null");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoIsNotNull() {
            addCriterion("target_wallet_no is not null");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoEqualTo(String value) {
            addCriterion("target_wallet_no =", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoNotEqualTo(String value) {
            addCriterion("target_wallet_no <>", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoGreaterThan(String value) {
            addCriterion("target_wallet_no >", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoGreaterThanOrEqualTo(String value) {
            addCriterion("target_wallet_no >=", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoLessThan(String value) {
            addCriterion("target_wallet_no <", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoLessThanOrEqualTo(String value) {
            addCriterion("target_wallet_no <=", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoLike(String value) {
            addCriterion("target_wallet_no like", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoNotLike(String value) {
            addCriterion("target_wallet_no not like", value, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoIn(List<String> values) {
            addCriterion("target_wallet_no in", values, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoNotIn(List<String> values) {
            addCriterion("target_wallet_no not in", values, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoBetween(String value1, String value2) {
            addCriterion("target_wallet_no between", value1, value2, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNoNotBetween(String value1, String value2) {
            addCriterion("target_wallet_no not between", value1, value2, "targetWalletNo");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameIsNull() {
            addCriterion("target_wallet_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameIsNotNull() {
            addCriterion("target_wallet_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameEqualTo(String value) {
            addCriterion("target_wallet_name =", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameNotEqualTo(String value) {
            addCriterion("target_wallet_name <>", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameGreaterThan(String value) {
            addCriterion("target_wallet_name >", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_wallet_name >=", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameLessThan(String value) {
            addCriterion("target_wallet_name <", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameLessThanOrEqualTo(String value) {
            addCriterion("target_wallet_name <=", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameLike(String value) {
            addCriterion("target_wallet_name like", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameNotLike(String value) {
            addCriterion("target_wallet_name not like", value, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameIn(List<String> values) {
            addCriterion("target_wallet_name in", values, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameNotIn(List<String> values) {
            addCriterion("target_wallet_name not in", values, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameBetween(String value1, String value2) {
            addCriterion("target_wallet_name between", value1, value2, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andTargetWalletNameNotBetween(String value1, String value2) {
            addCriterion("target_wallet_name not between", value1, value2, "targetWalletName");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIsNull() {
            addCriterion("match_status is null");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIsNotNull() {
            addCriterion("match_status is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStatusEqualTo(Integer value) {
            addCriterion("match_status =", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotEqualTo(Integer value) {
            addCriterion("match_status <>", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusGreaterThan(Integer value) {
            addCriterion("match_status >", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("match_status >=", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLessThan(Integer value) {
            addCriterion("match_status <", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLessThanOrEqualTo(Integer value) {
            addCriterion("match_status <=", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIn(List<Integer> values) {
            addCriterion("match_status in", values, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotIn(List<Integer> values) {
            addCriterion("match_status not in", values, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusBetween(Integer value1, Integer value2) {
            addCriterion("match_status between", value1, value2, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("match_status not between", value1, value2, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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