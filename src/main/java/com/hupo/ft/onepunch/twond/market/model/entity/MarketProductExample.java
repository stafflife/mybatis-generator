package com.hupo.ft.onepunch.twond.market.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketProductExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNull() {
            addCriterion("product_url is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNotNull() {
            addCriterion("product_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlEqualTo(String value) {
            addCriterion("product_url =", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotEqualTo(String value) {
            addCriterion("product_url <>", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThan(String value) {
            addCriterion("product_url >", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThanOrEqualTo(String value) {
            addCriterion("product_url >=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThan(String value) {
            addCriterion("product_url <", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThanOrEqualTo(String value) {
            addCriterion("product_url <=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLike(String value) {
            addCriterion("product_url like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotLike(String value) {
            addCriterion("product_url not like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlIn(List<String> values) {
            addCriterion("product_url in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotIn(List<String> values) {
            addCriterion("product_url not in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlBetween(String value1, String value2) {
            addCriterion("product_url between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotBetween(String value1, String value2) {
            addCriterion("product_url not between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlIsNull() {
            addCriterion("product_logo_url is null");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlIsNotNull() {
            addCriterion("product_logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlEqualTo(String value) {
            addCriterion("product_logo_url =", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlNotEqualTo(String value) {
            addCriterion("product_logo_url <>", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlGreaterThan(String value) {
            addCriterion("product_logo_url >", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("product_logo_url >=", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlLessThan(String value) {
            addCriterion("product_logo_url <", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("product_logo_url <=", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlLike(String value) {
            addCriterion("product_logo_url like", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlNotLike(String value) {
            addCriterion("product_logo_url not like", value, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlIn(List<String> values) {
            addCriterion("product_logo_url in", values, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlNotIn(List<String> values) {
            addCriterion("product_logo_url not in", values, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlBetween(String value1, String value2) {
            addCriterion("product_logo_url between", value1, value2, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProductLogoUrlNotBetween(String value1, String value2) {
            addCriterion("product_logo_url not between", value1, value2, "productLogoUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlIsNull() {
            addCriterion("crawl_url is null");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlIsNotNull() {
            addCriterion("crawl_url is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlEqualTo(String value) {
            addCriterion("crawl_url =", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlNotEqualTo(String value) {
            addCriterion("crawl_url <>", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlGreaterThan(String value) {
            addCriterion("crawl_url >", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("crawl_url >=", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlLessThan(String value) {
            addCriterion("crawl_url <", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlLessThanOrEqualTo(String value) {
            addCriterion("crawl_url <=", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlLike(String value) {
            addCriterion("crawl_url like", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlNotLike(String value) {
            addCriterion("crawl_url not like", value, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlIn(List<String> values) {
            addCriterion("crawl_url in", values, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlNotIn(List<String> values) {
            addCriterion("crawl_url not in", values, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlBetween(String value1, String value2) {
            addCriterion("crawl_url between", value1, value2, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andCrawlUrlNotBetween(String value1, String value2) {
            addCriterion("crawl_url not between", value1, value2, "crawlUrl");
            return (Criteria) this;
        }

        public Criteria andRateStartIsNull() {
            addCriterion("rate_start is null");
            return (Criteria) this;
        }

        public Criteria andRateStartIsNotNull() {
            addCriterion("rate_start is not null");
            return (Criteria) this;
        }

        public Criteria andRateStartEqualTo(BigDecimal value) {
            addCriterion("rate_start =", value, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartNotEqualTo(BigDecimal value) {
            addCriterion("rate_start <>", value, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartGreaterThan(BigDecimal value) {
            addCriterion("rate_start >", value, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate_start >=", value, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartLessThan(BigDecimal value) {
            addCriterion("rate_start <", value, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate_start <=", value, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartIn(List<BigDecimal> values) {
            addCriterion("rate_start in", values, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartNotIn(List<BigDecimal> values) {
            addCriterion("rate_start not in", values, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate_start between", value1, value2, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate_start not between", value1, value2, "rateStart");
            return (Criteria) this;
        }

        public Criteria andRateEndIsNull() {
            addCriterion("rate_end is null");
            return (Criteria) this;
        }

        public Criteria andRateEndIsNotNull() {
            addCriterion("rate_end is not null");
            return (Criteria) this;
        }

        public Criteria andRateEndEqualTo(BigDecimal value) {
            addCriterion("rate_end =", value, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndNotEqualTo(BigDecimal value) {
            addCriterion("rate_end <>", value, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndGreaterThan(BigDecimal value) {
            addCriterion("rate_end >", value, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate_end >=", value, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndLessThan(BigDecimal value) {
            addCriterion("rate_end <", value, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate_end <=", value, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndIn(List<BigDecimal> values) {
            addCriterion("rate_end in", values, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndNotIn(List<BigDecimal> values) {
            addCriterion("rate_end not in", values, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate_end between", value1, value2, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate_end not between", value1, value2, "rateEnd");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("rate_type is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("rate_type =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("rate_type <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("rate_type >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_type >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("rate_type <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("rate_type <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("rate_type like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("rate_type not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("rate_type in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("rate_type not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("rate_type between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("rate_type not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andAmountStartIsNull() {
            addCriterion("amount_start is null");
            return (Criteria) this;
        }

        public Criteria andAmountStartIsNotNull() {
            addCriterion("amount_start is not null");
            return (Criteria) this;
        }

        public Criteria andAmountStartEqualTo(BigDecimal value) {
            addCriterion("amount_start =", value, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartNotEqualTo(BigDecimal value) {
            addCriterion("amount_start <>", value, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartGreaterThan(BigDecimal value) {
            addCriterion("amount_start >", value, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_start >=", value, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartLessThan(BigDecimal value) {
            addCriterion("amount_start <", value, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_start <=", value, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartIn(List<BigDecimal> values) {
            addCriterion("amount_start in", values, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartNotIn(List<BigDecimal> values) {
            addCriterion("amount_start not in", values, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_start between", value1, value2, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_start not between", value1, value2, "amountStart");
            return (Criteria) this;
        }

        public Criteria andAmountEndIsNull() {
            addCriterion("amount_end is null");
            return (Criteria) this;
        }

        public Criteria andAmountEndIsNotNull() {
            addCriterion("amount_end is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEndEqualTo(BigDecimal value) {
            addCriterion("amount_end =", value, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndNotEqualTo(BigDecimal value) {
            addCriterion("amount_end <>", value, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndGreaterThan(BigDecimal value) {
            addCriterion("amount_end >", value, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_end >=", value, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndLessThan(BigDecimal value) {
            addCriterion("amount_end <", value, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_end <=", value, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndIn(List<BigDecimal> values) {
            addCriterion("amount_end in", values, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndNotIn(List<BigDecimal> values) {
            addCriterion("amount_end not in", values, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_end between", value1, value2, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andAmountEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_end not between", value1, value2, "amountEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(String value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(String value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(String value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(String value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(String value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLike(String value) {
            addCriterion("time_limit like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotLike(String value) {
            addCriterion("time_limit not like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<String> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<String> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(String value1, String value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(String value1, String value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andNetWorthIsNull() {
            addCriterion("net_worth is null");
            return (Criteria) this;
        }

        public Criteria andNetWorthIsNotNull() {
            addCriterion("net_worth is not null");
            return (Criteria) this;
        }

        public Criteria andNetWorthEqualTo(BigDecimal value) {
            addCriterion("net_worth =", value, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthNotEqualTo(BigDecimal value) {
            addCriterion("net_worth <>", value, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthGreaterThan(BigDecimal value) {
            addCriterion("net_worth >", value, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_worth >=", value, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthLessThan(BigDecimal value) {
            addCriterion("net_worth <", value, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_worth <=", value, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthIn(List<BigDecimal> values) {
            addCriterion("net_worth in", values, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthNotIn(List<BigDecimal> values) {
            addCriterion("net_worth not in", values, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_worth between", value1, value2, "netWorth");
            return (Criteria) this;
        }

        public Criteria andNetWorthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_worth not between", value1, value2, "netWorth");
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

        public Criteria andFeeAmountEqualTo(String value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(String value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(String value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(String value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(String value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(String value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLike(String value) {
            addCriterion("fee_amount like", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotLike(String value) {
            addCriterion("fee_amount not like", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<String> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<String> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(String value1, String value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(String value1, String value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
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

        public Criteria andHasChildrenIsNull() {
            addCriterion("has_children is null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIsNotNull() {
            addCriterion("has_children is not null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenEqualTo(Boolean value) {
            addCriterion("has_children =", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotEqualTo(Boolean value) {
            addCriterion("has_children <>", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThan(Boolean value) {
            addCriterion("has_children >", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_children >=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThan(Boolean value) {
            addCriterion("has_children <", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThanOrEqualTo(Boolean value) {
            addCriterion("has_children <=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIn(List<Boolean> values) {
            addCriterion("has_children in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotIn(List<Boolean> values) {
            addCriterion("has_children not in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenBetween(Boolean value1, Boolean value2) {
            addCriterion("has_children between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_children not between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andCalculateDateIsNull() {
            addCriterion("calculate_date is null");
            return (Criteria) this;
        }

        public Criteria andCalculateDateIsNotNull() {
            addCriterion("calculate_date is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateDateEqualTo(Date value) {
            addCriterion("calculate_date =", value, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateNotEqualTo(Date value) {
            addCriterion("calculate_date <>", value, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateGreaterThan(Date value) {
            addCriterion("calculate_date >", value, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("calculate_date >=", value, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateLessThan(Date value) {
            addCriterion("calculate_date <", value, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateLessThanOrEqualTo(Date value) {
            addCriterion("calculate_date <=", value, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateIn(List<Date> values) {
            addCriterion("calculate_date in", values, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateNotIn(List<Date> values) {
            addCriterion("calculate_date not in", values, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateBetween(Date value1, Date value2) {
            addCriterion("calculate_date between", value1, value2, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andCalculateDateNotBetween(Date value1, Date value2) {
            addCriterion("calculate_date not between", value1, value2, "calculateDate");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlIsNull() {
            addCriterion("org_logo_Url is null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlIsNotNull() {
            addCriterion("org_logo_Url is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlEqualTo(String value) {
            addCriterion("org_logo_Url =", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotEqualTo(String value) {
            addCriterion("org_logo_Url <>", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlGreaterThan(String value) {
            addCriterion("org_logo_Url >", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("org_logo_Url >=", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlLessThan(String value) {
            addCriterion("org_logo_Url <", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("org_logo_Url <=", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlLike(String value) {
            addCriterion("org_logo_Url like", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotLike(String value) {
            addCriterion("org_logo_Url not like", value, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlIn(List<String> values) {
            addCriterion("org_logo_Url in", values, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotIn(List<String> values) {
            addCriterion("org_logo_Url not in", values, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlBetween(String value1, String value2) {
            addCriterion("org_logo_Url between", value1, value2, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLogoUrlNotBetween(String value1, String value2) {
            addCriterion("org_logo_Url not between", value1, value2, "orgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Byte value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Byte value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Byte value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Byte value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Byte value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Byte> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Byte> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Byte value1, Byte value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Byte value1, Byte value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andLendingTimeIsNull() {
            addCriterion("lending_time is null");
            return (Criteria) this;
        }

        public Criteria andLendingTimeIsNotNull() {
            addCriterion("lending_time is not null");
            return (Criteria) this;
        }

        public Criteria andLendingTimeEqualTo(String value) {
            addCriterion("lending_time =", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeNotEqualTo(String value) {
            addCriterion("lending_time <>", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeGreaterThan(String value) {
            addCriterion("lending_time >", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lending_time >=", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeLessThan(String value) {
            addCriterion("lending_time <", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeLessThanOrEqualTo(String value) {
            addCriterion("lending_time <=", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeLike(String value) {
            addCriterion("lending_time like", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeNotLike(String value) {
            addCriterion("lending_time not like", value, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeIn(List<String> values) {
            addCriterion("lending_time in", values, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeNotIn(List<String> values) {
            addCriterion("lending_time not in", values, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeBetween(String value1, String value2) {
            addCriterion("lending_time between", value1, value2, "lendingTime");
            return (Criteria) this;
        }

        public Criteria andLendingTimeNotBetween(String value1, String value2) {
            addCriterion("lending_time not between", value1, value2, "lendingTime");
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

        public Criteria andFluiditySortIsNull() {
            addCriterion("fluidity_sort is null");
            return (Criteria) this;
        }

        public Criteria andFluiditySortIsNotNull() {
            addCriterion("fluidity_sort is not null");
            return (Criteria) this;
        }

        public Criteria andFluiditySortEqualTo(Integer value) {
            addCriterion("fluidity_sort =", value, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortNotEqualTo(Integer value) {
            addCriterion("fluidity_sort <>", value, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortGreaterThan(Integer value) {
            addCriterion("fluidity_sort >", value, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortGreaterThanOrEqualTo(Integer value) {
            addCriterion("fluidity_sort >=", value, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortLessThan(Integer value) {
            addCriterion("fluidity_sort <", value, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortLessThanOrEqualTo(Integer value) {
            addCriterion("fluidity_sort <=", value, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortIn(List<Integer> values) {
            addCriterion("fluidity_sort in", values, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortNotIn(List<Integer> values) {
            addCriterion("fluidity_sort not in", values, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortBetween(Integer value1, Integer value2) {
            addCriterion("fluidity_sort between", value1, value2, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andFluiditySortNotBetween(Integer value1, Integer value2) {
            addCriterion("fluidity_sort not between", value1, value2, "fluiditySort");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
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

        public Criteria andRedemptionAmountIsNull() {
            addCriterion("redemption_amount is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountIsNotNull() {
            addCriterion("redemption_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountEqualTo(BigDecimal value) {
            addCriterion("redemption_amount =", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountNotEqualTo(BigDecimal value) {
            addCriterion("redemption_amount <>", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountGreaterThan(BigDecimal value) {
            addCriterion("redemption_amount >", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("redemption_amount >=", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountLessThan(BigDecimal value) {
            addCriterion("redemption_amount <", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("redemption_amount <=", value, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountIn(List<BigDecimal> values) {
            addCriterion("redemption_amount in", values, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountNotIn(List<BigDecimal> values) {
            addCriterion("redemption_amount not in", values, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redemption_amount between", value1, value2, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andRedemptionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redemption_amount not between", value1, value2, "redemptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNull() {
            addCriterion("sub_type is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion("sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(String value) {
            addCriterion("sub_type =", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(String value) {
            addCriterion("sub_type <>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(String value) {
            addCriterion("sub_type >", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_type >=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(String value) {
            addCriterion("sub_type <", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(String value) {
            addCriterion("sub_type <=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLike(String value) {
            addCriterion("sub_type like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotLike(String value) {
            addCriterion("sub_type not like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<String> values) {
            addCriterion("sub_type in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<String> values) {
            addCriterion("sub_type not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(String value1, String value2) {
            addCriterion("sub_type between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(String value1, String value2) {
            addCriterion("sub_type not between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartIsNull() {
            addCriterion("time_limit_start is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartIsNotNull() {
            addCriterion("time_limit_start is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartEqualTo(Integer value) {
            addCriterion("time_limit_start =", value, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartNotEqualTo(Integer value) {
            addCriterion("time_limit_start <>", value, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartGreaterThan(Integer value) {
            addCriterion("time_limit_start >", value, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit_start >=", value, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartLessThan(Integer value) {
            addCriterion("time_limit_start <", value, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit_start <=", value, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartIn(List<Integer> values) {
            addCriterion("time_limit_start in", values, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartNotIn(List<Integer> values) {
            addCriterion("time_limit_start not in", values, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartBetween(Integer value1, Integer value2) {
            addCriterion("time_limit_start between", value1, value2, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitStartNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit_start not between", value1, value2, "timeLimitStart");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndIsNull() {
            addCriterion("time_limit_end is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndIsNotNull() {
            addCriterion("time_limit_end is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndEqualTo(Integer value) {
            addCriterion("time_limit_end =", value, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndNotEqualTo(Integer value) {
            addCriterion("time_limit_end <>", value, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndGreaterThan(Integer value) {
            addCriterion("time_limit_end >", value, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit_end >=", value, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndLessThan(Integer value) {
            addCriterion("time_limit_end <", value, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit_end <=", value, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndIn(List<Integer> values) {
            addCriterion("time_limit_end in", values, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndNotIn(List<Integer> values) {
            addCriterion("time_limit_end not in", values, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndBetween(Integer value1, Integer value2) {
            addCriterion("time_limit_end between", value1, value2, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEndNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit_end not between", value1, value2, "timeLimitEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIsNull() {
            addCriterion("time_limit_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIsNotNull() {
            addCriterion("time_limit_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitEqualTo(String value) {
            addCriterion("time_limit_unit =", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotEqualTo(String value) {
            addCriterion("time_limit_unit <>", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitGreaterThan(String value) {
            addCriterion("time_limit_unit >", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit_unit >=", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLessThan(String value) {
            addCriterion("time_limit_unit <", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLessThanOrEqualTo(String value) {
            addCriterion("time_limit_unit <=", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLike(String value) {
            addCriterion("time_limit_unit like", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotLike(String value) {
            addCriterion("time_limit_unit not like", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIn(List<String> values) {
            addCriterion("time_limit_unit in", values, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotIn(List<String> values) {
            addCriterion("time_limit_unit not in", values, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitBetween(String value1, String value2) {
            addCriterion("time_limit_unit between", value1, value2, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotBetween(String value1, String value2) {
            addCriterion("time_limit_unit not between", value1, value2, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingIsNull() {
            addCriterion("expiration_processing is null");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingIsNotNull() {
            addCriterion("expiration_processing is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingEqualTo(String value) {
            addCriterion("expiration_processing =", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingNotEqualTo(String value) {
            addCriterion("expiration_processing <>", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingGreaterThan(String value) {
            addCriterion("expiration_processing >", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingGreaterThanOrEqualTo(String value) {
            addCriterion("expiration_processing >=", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingLessThan(String value) {
            addCriterion("expiration_processing <", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingLessThanOrEqualTo(String value) {
            addCriterion("expiration_processing <=", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingLike(String value) {
            addCriterion("expiration_processing like", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingNotLike(String value) {
            addCriterion("expiration_processing not like", value, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingIn(List<String> values) {
            addCriterion("expiration_processing in", values, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingNotIn(List<String> values) {
            addCriterion("expiration_processing not in", values, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingBetween(String value1, String value2) {
            addCriterion("expiration_processing between", value1, value2, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andExpirationProcessingNotBetween(String value1, String value2) {
            addCriterion("expiration_processing not between", value1, value2, "expirationProcessing");
            return (Criteria) this;
        }

        public Criteria andProductIssuerIsNull() {
            addCriterion("product_issuer is null");
            return (Criteria) this;
        }

        public Criteria andProductIssuerIsNotNull() {
            addCriterion("product_issuer is not null");
            return (Criteria) this;
        }

        public Criteria andProductIssuerEqualTo(String value) {
            addCriterion("product_issuer =", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerNotEqualTo(String value) {
            addCriterion("product_issuer <>", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerGreaterThan(String value) {
            addCriterion("product_issuer >", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("product_issuer >=", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerLessThan(String value) {
            addCriterion("product_issuer <", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerLessThanOrEqualTo(String value) {
            addCriterion("product_issuer <=", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerLike(String value) {
            addCriterion("product_issuer like", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerNotLike(String value) {
            addCriterion("product_issuer not like", value, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerIn(List<String> values) {
            addCriterion("product_issuer in", values, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerNotIn(List<String> values) {
            addCriterion("product_issuer not in", values, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerBetween(String value1, String value2) {
            addCriterion("product_issuer between", value1, value2, "productIssuer");
            return (Criteria) this;
        }

        public Criteria andProductIssuerNotBetween(String value1, String value2) {
            addCriterion("product_issuer not between", value1, value2, "productIssuer");
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