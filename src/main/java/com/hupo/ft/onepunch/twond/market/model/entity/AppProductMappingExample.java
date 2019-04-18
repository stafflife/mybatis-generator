package com.hupo.ft.onepunch.twond.market.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppProductMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppProductMappingExample() {
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

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
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

        public Criteria andChannelMappingUrlIsNull() {
            addCriterion("channel_mapping_url is null");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlIsNotNull() {
            addCriterion("channel_mapping_url is not null");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlEqualTo(String value) {
            addCriterion("channel_mapping_url =", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlNotEqualTo(String value) {
            addCriterion("channel_mapping_url <>", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlGreaterThan(String value) {
            addCriterion("channel_mapping_url >", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlGreaterThanOrEqualTo(String value) {
            addCriterion("channel_mapping_url >=", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlLessThan(String value) {
            addCriterion("channel_mapping_url <", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlLessThanOrEqualTo(String value) {
            addCriterion("channel_mapping_url <=", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlLike(String value) {
            addCriterion("channel_mapping_url like", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlNotLike(String value) {
            addCriterion("channel_mapping_url not like", value, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlIn(List<String> values) {
            addCriterion("channel_mapping_url in", values, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlNotIn(List<String> values) {
            addCriterion("channel_mapping_url not in", values, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlBetween(String value1, String value2) {
            addCriterion("channel_mapping_url between", value1, value2, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelMappingUrlNotBetween(String value1, String value2) {
            addCriterion("channel_mapping_url not between", value1, value2, "channelMappingUrl");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdIsNull() {
            addCriterion("channel_app_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdIsNotNull() {
            addCriterion("channel_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdEqualTo(String value) {
            addCriterion("channel_app_id =", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdNotEqualTo(String value) {
            addCriterion("channel_app_id <>", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdGreaterThan(String value) {
            addCriterion("channel_app_id >", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_app_id >=", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdLessThan(String value) {
            addCriterion("channel_app_id <", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdLessThanOrEqualTo(String value) {
            addCriterion("channel_app_id <=", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdLike(String value) {
            addCriterion("channel_app_id like", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdNotLike(String value) {
            addCriterion("channel_app_id not like", value, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdIn(List<String> values) {
            addCriterion("channel_app_id in", values, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdNotIn(List<String> values) {
            addCriterion("channel_app_id not in", values, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdBetween(String value1, String value2) {
            addCriterion("channel_app_id between", value1, value2, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andChannelAppIdNotBetween(String value1, String value2) {
            addCriterion("channel_app_id not between", value1, value2, "channelAppId");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNull() {
            addCriterion("show_type is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("show_type is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(String value) {
            addCriterion("show_type =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(String value) {
            addCriterion("show_type <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(String value) {
            addCriterion("show_type >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("show_type >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(String value) {
            addCriterion("show_type <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(String value) {
            addCriterion("show_type <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLike(String value) {
            addCriterion("show_type like", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotLike(String value) {
            addCriterion("show_type not like", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<String> values) {
            addCriterion("show_type in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<String> values) {
            addCriterion("show_type not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(String value1, String value2) {
            addCriterion("show_type between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(String value1, String value2) {
            addCriterion("show_type not between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Boolean value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Boolean value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Boolean value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Boolean value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Boolean> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Boolean> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andDefaultSortIsNull() {
            addCriterion("default_sort is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSortIsNotNull() {
            addCriterion("default_sort is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSortEqualTo(Integer value) {
            addCriterion("default_sort =", value, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortNotEqualTo(Integer value) {
            addCriterion("default_sort <>", value, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortGreaterThan(Integer value) {
            addCriterion("default_sort >", value, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_sort >=", value, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortLessThan(Integer value) {
            addCriterion("default_sort <", value, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortLessThanOrEqualTo(Integer value) {
            addCriterion("default_sort <=", value, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortIn(List<Integer> values) {
            addCriterion("default_sort in", values, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortNotIn(List<Integer> values) {
            addCriterion("default_sort not in", values, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortBetween(Integer value1, Integer value2) {
            addCriterion("default_sort between", value1, value2, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andDefaultSortNotBetween(Integer value1, Integer value2) {
            addCriterion("default_sort not between", value1, value2, "defaultSort");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkIsNull() {
            addCriterion("recommend_remark is null");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkIsNotNull() {
            addCriterion("recommend_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkEqualTo(String value) {
            addCriterion("recommend_remark =", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkNotEqualTo(String value) {
            addCriterion("recommend_remark <>", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkGreaterThan(String value) {
            addCriterion("recommend_remark >", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_remark >=", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkLessThan(String value) {
            addCriterion("recommend_remark <", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkLessThanOrEqualTo(String value) {
            addCriterion("recommend_remark <=", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkLike(String value) {
            addCriterion("recommend_remark like", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkNotLike(String value) {
            addCriterion("recommend_remark not like", value, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkIn(List<String> values) {
            addCriterion("recommend_remark in", values, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkNotIn(List<String> values) {
            addCriterion("recommend_remark not in", values, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkBetween(String value1, String value2) {
            addCriterion("recommend_remark between", value1, value2, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andRecommendRemarkNotBetween(String value1, String value2) {
            addCriterion("recommend_remark not between", value1, value2, "recommendRemark");
            return (Criteria) this;
        }

        public Criteria andClientNumIsNull() {
            addCriterion("client_num is null");
            return (Criteria) this;
        }

        public Criteria andClientNumIsNotNull() {
            addCriterion("client_num is not null");
            return (Criteria) this;
        }

        public Criteria andClientNumEqualTo(String value) {
            addCriterion("client_num =", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumNotEqualTo(String value) {
            addCriterion("client_num <>", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumGreaterThan(String value) {
            addCriterion("client_num >", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumGreaterThanOrEqualTo(String value) {
            addCriterion("client_num >=", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumLessThan(String value) {
            addCriterion("client_num <", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumLessThanOrEqualTo(String value) {
            addCriterion("client_num <=", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumLike(String value) {
            addCriterion("client_num like", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumNotLike(String value) {
            addCriterion("client_num not like", value, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumIn(List<String> values) {
            addCriterion("client_num in", values, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumNotIn(List<String> values) {
            addCriterion("client_num not in", values, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumBetween(String value1, String value2) {
            addCriterion("client_num between", value1, value2, "clientNum");
            return (Criteria) this;
        }

        public Criteria andClientNumNotBetween(String value1, String value2) {
            addCriterion("client_num not between", value1, value2, "clientNum");
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