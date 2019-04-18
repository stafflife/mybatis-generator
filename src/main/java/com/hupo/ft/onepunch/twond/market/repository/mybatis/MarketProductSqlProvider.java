package com.hupo.ft.onepunch.twond.market.repository.mybatis;

import com.hupo.ft.onepunch.twond.market.model.entity.MarketProduct;
import com.hupo.ft.onepunch.twond.market.model.entity.MarketProductExample.Criteria;
import com.hupo.ft.onepunch.twond.market.model.entity.MarketProductExample.Criterion;
import com.hupo.ft.onepunch.twond.market.model.entity.MarketProductExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MarketProductSqlProvider {

    public String countByExample(MarketProductExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("market_product");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MarketProductExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("market_product");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MarketProduct record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("market_product");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=VARCHAR}");
        }
        
        if (record.getProductCode() != null) {
            sql.VALUES("product_code", "#{productCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.VALUES("category", "#{category,jdbcType=VARCHAR}");
        }
        
        if (record.getProductName() != null) {
            sql.VALUES("product_name", "#{productName,jdbcType=VARCHAR}");
        }
        
        if (record.getProductType() != null) {
            sql.VALUES("product_type", "#{productType,jdbcType=VARCHAR}");
        }
        
        if (record.getProductUrl() != null) {
            sql.VALUES("product_url", "#{productUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProductLogoUrl() != null) {
            sql.VALUES("product_logo_url", "#{productLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCrawlUrl() != null) {
            sql.VALUES("crawl_url", "#{crawlUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getRateStart() != null) {
            sql.VALUES("rate_start", "#{rateStart,jdbcType=DECIMAL}");
        }
        
        if (record.getRateEnd() != null) {
            sql.VALUES("rate_end", "#{rateEnd,jdbcType=DECIMAL}");
        }
        
        if (record.getRateType() != null) {
            sql.VALUES("rate_type", "#{rateType,jdbcType=VARCHAR}");
        }
        
        if (record.getAmountStart() != null) {
            sql.VALUES("amount_start", "#{amountStart,jdbcType=DECIMAL}");
        }
        
        if (record.getAmountEnd() != null) {
            sql.VALUES("amount_end", "#{amountEnd,jdbcType=DECIMAL}");
        }
        
        if (record.getTimeLimit() != null) {
            sql.VALUES("time_limit", "#{timeLimit,jdbcType=VARCHAR}");
        }
        
        if (record.getNetWorth() != null) {
            sql.VALUES("net_worth", "#{netWorth,jdbcType=DECIMAL}");
        }
        
        if (record.getFeeAmount() != null) {
            sql.VALUES("fee_amount", "#{feeAmount,jdbcType=VARCHAR}");
        }
        
        if (record.getParentCode() != null) {
            sql.VALUES("parent_code", "#{parentCode,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommend() != null) {
            sql.VALUES("recommend", "#{recommend,jdbcType=BIT}");
        }
        
        if (record.getHasChildren() != null) {
            sql.VALUES("has_children", "#{hasChildren,jdbcType=BIT}");
        }
        
        if (record.getCalculateDate() != null) {
            sql.VALUES("calculate_date", "#{calculateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrgId() != null) {
            sql.VALUES("org_id", "#{orgId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.VALUES("org_name", "#{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgLogoUrl() != null) {
            sql.VALUES("org_logo_Url", "#{orgLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            sql.VALUES("priority", "#{priority,jdbcType=TINYINT}");
        }
        
        if (record.getLendingTime() != null) {
            sql.VALUES("lending_time", "#{lendingTime,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        if (record.getCreateAt() != null) {
            sql.VALUES("create_at", "#{createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.VALUES("create_by", "#{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.VALUES("update_at", "#{updateAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateBy() != null) {
            sql.VALUES("update_by", "#{updateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getFluiditySort() != null) {
            sql.VALUES("fluidity_sort", "#{fluiditySort,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("`type`", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommendRemark() != null) {
            sql.VALUES("recommend_remark", "#{recommendRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getRedemptionAmount() != null) {
            sql.VALUES("redemption_amount", "#{redemptionAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getSubType() != null) {
            sql.VALUES("sub_type", "#{subType,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeLimitStart() != null) {
            sql.VALUES("time_limit_start", "#{timeLimitStart,jdbcType=INTEGER}");
        }
        
        if (record.getTimeLimitEnd() != null) {
            sql.VALUES("time_limit_end", "#{timeLimitEnd,jdbcType=INTEGER}");
        }
        
        if (record.getTimeLimitUnit() != null) {
            sql.VALUES("time_limit_unit", "#{timeLimitUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getExpirationProcessing() != null) {
            sql.VALUES("expiration_processing", "#{expirationProcessing,jdbcType=VARCHAR}");
        }
        
        if (record.getProductIssuer() != null) {
            sql.VALUES("product_issuer", "#{productIssuer,jdbcType=VARCHAR}");
        }
        
        if (record.getRequire() != null) {
            sql.VALUES("`require`", "#{require,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getApplicationInformation() != null) {
            sql.VALUES("application_information", "#{applicationInformation,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getExtraJson() != null) {
            sql.VALUES("extra_json", "#{extraJson,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(MarketProductExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel");
        sql.SELECT("product_code");
        sql.SELECT("category");
        sql.SELECT("product_name");
        sql.SELECT("product_type");
        sql.SELECT("product_url");
        sql.SELECT("product_logo_url");
        sql.SELECT("crawl_url");
        sql.SELECT("rate_start");
        sql.SELECT("rate_end");
        sql.SELECT("rate_type");
        sql.SELECT("amount_start");
        sql.SELECT("amount_end");
        sql.SELECT("time_limit");
        sql.SELECT("net_worth");
        sql.SELECT("fee_amount");
        sql.SELECT("parent_code");
        sql.SELECT("recommend");
        sql.SELECT("has_children");
        sql.SELECT("calculate_date");
        sql.SELECT("org_id");
        sql.SELECT("org_name");
        sql.SELECT("org_logo_Url");
        sql.SELECT("priority");
        sql.SELECT("lending_time");
        sql.SELECT("is_deleted");
        sql.SELECT("create_at");
        sql.SELECT("create_by");
        sql.SELECT("update_at");
        sql.SELECT("update_by");
        sql.SELECT("fluidity_sort");
        sql.SELECT("`type`");
        sql.SELECT("recommend_remark");
        sql.SELECT("redemption_amount");
        sql.SELECT("sub_type");
        sql.SELECT("time_limit_start");
        sql.SELECT("time_limit_end");
        sql.SELECT("time_limit_unit");
        sql.SELECT("expiration_processing");
        sql.SELECT("product_issuer");
        sql.SELECT("`require`");
        sql.SELECT("application_information");
        sql.SELECT("extra_json");
        sql.SELECT("remark");
        sql.FROM("market_product");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(MarketProductExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel");
        sql.SELECT("product_code");
        sql.SELECT("category");
        sql.SELECT("product_name");
        sql.SELECT("product_type");
        sql.SELECT("product_url");
        sql.SELECT("product_logo_url");
        sql.SELECT("crawl_url");
        sql.SELECT("rate_start");
        sql.SELECT("rate_end");
        sql.SELECT("rate_type");
        sql.SELECT("amount_start");
        sql.SELECT("amount_end");
        sql.SELECT("time_limit");
        sql.SELECT("net_worth");
        sql.SELECT("fee_amount");
        sql.SELECT("parent_code");
        sql.SELECT("recommend");
        sql.SELECT("has_children");
        sql.SELECT("calculate_date");
        sql.SELECT("org_id");
        sql.SELECT("org_name");
        sql.SELECT("org_logo_Url");
        sql.SELECT("priority");
        sql.SELECT("lending_time");
        sql.SELECT("is_deleted");
        sql.SELECT("create_at");
        sql.SELECT("create_by");
        sql.SELECT("update_at");
        sql.SELECT("update_by");
        sql.SELECT("fluidity_sort");
        sql.SELECT("`type`");
        sql.SELECT("recommend_remark");
        sql.SELECT("redemption_amount");
        sql.SELECT("sub_type");
        sql.SELECT("time_limit_start");
        sql.SELECT("time_limit_end");
        sql.SELECT("time_limit_unit");
        sql.SELECT("expiration_processing");
        sql.SELECT("product_issuer");
        sql.FROM("market_product");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MarketProduct record = (MarketProduct) parameter.get("record");
        MarketProductExample example = (MarketProductExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("market_product");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        }
        
        if (record.getProductCode() != null) {
            sql.SET("product_code = #{record.productCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{record.category,jdbcType=VARCHAR}");
        }
        
        if (record.getProductName() != null) {
            sql.SET("product_name = #{record.productName,jdbcType=VARCHAR}");
        }
        
        if (record.getProductType() != null) {
            sql.SET("product_type = #{record.productType,jdbcType=VARCHAR}");
        }
        
        if (record.getProductUrl() != null) {
            sql.SET("product_url = #{record.productUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProductLogoUrl() != null) {
            sql.SET("product_logo_url = #{record.productLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCrawlUrl() != null) {
            sql.SET("crawl_url = #{record.crawlUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getRateStart() != null) {
            sql.SET("rate_start = #{record.rateStart,jdbcType=DECIMAL}");
        }
        
        if (record.getRateEnd() != null) {
            sql.SET("rate_end = #{record.rateEnd,jdbcType=DECIMAL}");
        }
        
        if (record.getRateType() != null) {
            sql.SET("rate_type = #{record.rateType,jdbcType=VARCHAR}");
        }
        
        if (record.getAmountStart() != null) {
            sql.SET("amount_start = #{record.amountStart,jdbcType=DECIMAL}");
        }
        
        if (record.getAmountEnd() != null) {
            sql.SET("amount_end = #{record.amountEnd,jdbcType=DECIMAL}");
        }
        
        if (record.getTimeLimit() != null) {
            sql.SET("time_limit = #{record.timeLimit,jdbcType=VARCHAR}");
        }
        
        if (record.getNetWorth() != null) {
            sql.SET("net_worth = #{record.netWorth,jdbcType=DECIMAL}");
        }
        
        if (record.getFeeAmount() != null) {
            sql.SET("fee_amount = #{record.feeAmount,jdbcType=VARCHAR}");
        }
        
        if (record.getParentCode() != null) {
            sql.SET("parent_code = #{record.parentCode,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommend() != null) {
            sql.SET("recommend = #{record.recommend,jdbcType=BIT}");
        }
        
        if (record.getHasChildren() != null) {
            sql.SET("has_children = #{record.hasChildren,jdbcType=BIT}");
        }
        
        if (record.getCalculateDate() != null) {
            sql.SET("calculate_date = #{record.calculateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrgId() != null) {
            sql.SET("org_id = #{record.orgId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.SET("org_name = #{record.orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgLogoUrl() != null) {
            sql.SET("org_logo_Url = #{record.orgLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            sql.SET("priority = #{record.priority,jdbcType=TINYINT}");
        }
        
        if (record.getLendingTime() != null) {
            sql.SET("lending_time = #{record.lendingTime,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateBy() != null) {
            sql.SET("update_by = #{record.updateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getFluiditySort() != null) {
            sql.SET("fluidity_sort = #{record.fluiditySort,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommendRemark() != null) {
            sql.SET("recommend_remark = #{record.recommendRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getRedemptionAmount() != null) {
            sql.SET("redemption_amount = #{record.redemptionAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getSubType() != null) {
            sql.SET("sub_type = #{record.subType,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeLimitStart() != null) {
            sql.SET("time_limit_start = #{record.timeLimitStart,jdbcType=INTEGER}");
        }
        
        if (record.getTimeLimitEnd() != null) {
            sql.SET("time_limit_end = #{record.timeLimitEnd,jdbcType=INTEGER}");
        }
        
        if (record.getTimeLimitUnit() != null) {
            sql.SET("time_limit_unit = #{record.timeLimitUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getExpirationProcessing() != null) {
            sql.SET("expiration_processing = #{record.expirationProcessing,jdbcType=VARCHAR}");
        }
        
        if (record.getProductIssuer() != null) {
            sql.SET("product_issuer = #{record.productIssuer,jdbcType=VARCHAR}");
        }
        
        if (record.getRequire() != null) {
            sql.SET("`require` = #{record.require,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getApplicationInformation() != null) {
            sql.SET("application_information = #{record.applicationInformation,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getExtraJson() != null) {
            sql.SET("extra_json = #{record.extraJson,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("market_product");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        sql.SET("product_code = #{record.productCode,jdbcType=VARCHAR}");
        sql.SET("category = #{record.category,jdbcType=VARCHAR}");
        sql.SET("product_name = #{record.productName,jdbcType=VARCHAR}");
        sql.SET("product_type = #{record.productType,jdbcType=VARCHAR}");
        sql.SET("product_url = #{record.productUrl,jdbcType=VARCHAR}");
        sql.SET("product_logo_url = #{record.productLogoUrl,jdbcType=VARCHAR}");
        sql.SET("crawl_url = #{record.crawlUrl,jdbcType=VARCHAR}");
        sql.SET("rate_start = #{record.rateStart,jdbcType=DECIMAL}");
        sql.SET("rate_end = #{record.rateEnd,jdbcType=DECIMAL}");
        sql.SET("rate_type = #{record.rateType,jdbcType=VARCHAR}");
        sql.SET("amount_start = #{record.amountStart,jdbcType=DECIMAL}");
        sql.SET("amount_end = #{record.amountEnd,jdbcType=DECIMAL}");
        sql.SET("time_limit = #{record.timeLimit,jdbcType=VARCHAR}");
        sql.SET("net_worth = #{record.netWorth,jdbcType=DECIMAL}");
        sql.SET("fee_amount = #{record.feeAmount,jdbcType=VARCHAR}");
        sql.SET("parent_code = #{record.parentCode,jdbcType=VARCHAR}");
        sql.SET("recommend = #{record.recommend,jdbcType=BIT}");
        sql.SET("has_children = #{record.hasChildren,jdbcType=BIT}");
        sql.SET("calculate_date = #{record.calculateDate,jdbcType=TIMESTAMP}");
        sql.SET("org_id = #{record.orgId,jdbcType=VARCHAR}");
        sql.SET("org_name = #{record.orgName,jdbcType=VARCHAR}");
        sql.SET("org_logo_Url = #{record.orgLogoUrl,jdbcType=VARCHAR}");
        sql.SET("priority = #{record.priority,jdbcType=TINYINT}");
        sql.SET("lending_time = #{record.lendingTime,jdbcType=VARCHAR}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        sql.SET("update_by = #{record.updateBy,jdbcType=VARCHAR}");
        sql.SET("fluidity_sort = #{record.fluiditySort,jdbcType=INTEGER}");
        sql.SET("`type` = #{record.type,jdbcType=VARCHAR}");
        sql.SET("recommend_remark = #{record.recommendRemark,jdbcType=VARCHAR}");
        sql.SET("redemption_amount = #{record.redemptionAmount,jdbcType=DECIMAL}");
        sql.SET("sub_type = #{record.subType,jdbcType=VARCHAR}");
        sql.SET("time_limit_start = #{record.timeLimitStart,jdbcType=INTEGER}");
        sql.SET("time_limit_end = #{record.timeLimitEnd,jdbcType=INTEGER}");
        sql.SET("time_limit_unit = #{record.timeLimitUnit,jdbcType=VARCHAR}");
        sql.SET("expiration_processing = #{record.expirationProcessing,jdbcType=VARCHAR}");
        sql.SET("product_issuer = #{record.productIssuer,jdbcType=VARCHAR}");
        sql.SET("`require` = #{record.require,jdbcType=LONGVARCHAR}");
        sql.SET("application_information = #{record.applicationInformation,jdbcType=LONGVARCHAR}");
        sql.SET("extra_json = #{record.extraJson,jdbcType=LONGVARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        
        MarketProductExample example = (MarketProductExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("market_product");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        sql.SET("product_code = #{record.productCode,jdbcType=VARCHAR}");
        sql.SET("category = #{record.category,jdbcType=VARCHAR}");
        sql.SET("product_name = #{record.productName,jdbcType=VARCHAR}");
        sql.SET("product_type = #{record.productType,jdbcType=VARCHAR}");
        sql.SET("product_url = #{record.productUrl,jdbcType=VARCHAR}");
        sql.SET("product_logo_url = #{record.productLogoUrl,jdbcType=VARCHAR}");
        sql.SET("crawl_url = #{record.crawlUrl,jdbcType=VARCHAR}");
        sql.SET("rate_start = #{record.rateStart,jdbcType=DECIMAL}");
        sql.SET("rate_end = #{record.rateEnd,jdbcType=DECIMAL}");
        sql.SET("rate_type = #{record.rateType,jdbcType=VARCHAR}");
        sql.SET("amount_start = #{record.amountStart,jdbcType=DECIMAL}");
        sql.SET("amount_end = #{record.amountEnd,jdbcType=DECIMAL}");
        sql.SET("time_limit = #{record.timeLimit,jdbcType=VARCHAR}");
        sql.SET("net_worth = #{record.netWorth,jdbcType=DECIMAL}");
        sql.SET("fee_amount = #{record.feeAmount,jdbcType=VARCHAR}");
        sql.SET("parent_code = #{record.parentCode,jdbcType=VARCHAR}");
        sql.SET("recommend = #{record.recommend,jdbcType=BIT}");
        sql.SET("has_children = #{record.hasChildren,jdbcType=BIT}");
        sql.SET("calculate_date = #{record.calculateDate,jdbcType=TIMESTAMP}");
        sql.SET("org_id = #{record.orgId,jdbcType=VARCHAR}");
        sql.SET("org_name = #{record.orgName,jdbcType=VARCHAR}");
        sql.SET("org_logo_Url = #{record.orgLogoUrl,jdbcType=VARCHAR}");
        sql.SET("priority = #{record.priority,jdbcType=TINYINT}");
        sql.SET("lending_time = #{record.lendingTime,jdbcType=VARCHAR}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        sql.SET("update_by = #{record.updateBy,jdbcType=VARCHAR}");
        sql.SET("fluidity_sort = #{record.fluiditySort,jdbcType=INTEGER}");
        sql.SET("`type` = #{record.type,jdbcType=VARCHAR}");
        sql.SET("recommend_remark = #{record.recommendRemark,jdbcType=VARCHAR}");
        sql.SET("redemption_amount = #{record.redemptionAmount,jdbcType=DECIMAL}");
        sql.SET("sub_type = #{record.subType,jdbcType=VARCHAR}");
        sql.SET("time_limit_start = #{record.timeLimitStart,jdbcType=INTEGER}");
        sql.SET("time_limit_end = #{record.timeLimitEnd,jdbcType=INTEGER}");
        sql.SET("time_limit_unit = #{record.timeLimitUnit,jdbcType=VARCHAR}");
        sql.SET("expiration_processing = #{record.expirationProcessing,jdbcType=VARCHAR}");
        sql.SET("product_issuer = #{record.productIssuer,jdbcType=VARCHAR}");
        
        MarketProductExample example = (MarketProductExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MarketProduct record) {
        SQL sql = new SQL();
        sql.UPDATE("market_product");
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{channel,jdbcType=VARCHAR}");
        }
        
        if (record.getProductCode() != null) {
            sql.SET("product_code = #{productCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{category,jdbcType=VARCHAR}");
        }
        
        if (record.getProductName() != null) {
            sql.SET("product_name = #{productName,jdbcType=VARCHAR}");
        }
        
        if (record.getProductType() != null) {
            sql.SET("product_type = #{productType,jdbcType=VARCHAR}");
        }
        
        if (record.getProductUrl() != null) {
            sql.SET("product_url = #{productUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getProductLogoUrl() != null) {
            sql.SET("product_logo_url = #{productLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCrawlUrl() != null) {
            sql.SET("crawl_url = #{crawlUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getRateStart() != null) {
            sql.SET("rate_start = #{rateStart,jdbcType=DECIMAL}");
        }
        
        if (record.getRateEnd() != null) {
            sql.SET("rate_end = #{rateEnd,jdbcType=DECIMAL}");
        }
        
        if (record.getRateType() != null) {
            sql.SET("rate_type = #{rateType,jdbcType=VARCHAR}");
        }
        
        if (record.getAmountStart() != null) {
            sql.SET("amount_start = #{amountStart,jdbcType=DECIMAL}");
        }
        
        if (record.getAmountEnd() != null) {
            sql.SET("amount_end = #{amountEnd,jdbcType=DECIMAL}");
        }
        
        if (record.getTimeLimit() != null) {
            sql.SET("time_limit = #{timeLimit,jdbcType=VARCHAR}");
        }
        
        if (record.getNetWorth() != null) {
            sql.SET("net_worth = #{netWorth,jdbcType=DECIMAL}");
        }
        
        if (record.getFeeAmount() != null) {
            sql.SET("fee_amount = #{feeAmount,jdbcType=VARCHAR}");
        }
        
        if (record.getParentCode() != null) {
            sql.SET("parent_code = #{parentCode,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommend() != null) {
            sql.SET("recommend = #{recommend,jdbcType=BIT}");
        }
        
        if (record.getHasChildren() != null) {
            sql.SET("has_children = #{hasChildren,jdbcType=BIT}");
        }
        
        if (record.getCalculateDate() != null) {
            sql.SET("calculate_date = #{calculateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrgId() != null) {
            sql.SET("org_id = #{orgId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.SET("org_name = #{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgLogoUrl() != null) {
            sql.SET("org_logo_Url = #{orgLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            sql.SET("priority = #{priority,jdbcType=TINYINT}");
        }
        
        if (record.getLendingTime() != null) {
            sql.SET("lending_time = #{lendingTime,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("create_by = #{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{updateAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateBy() != null) {
            sql.SET("update_by = #{updateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getFluiditySort() != null) {
            sql.SET("fluidity_sort = #{fluiditySort,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommendRemark() != null) {
            sql.SET("recommend_remark = #{recommendRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getRedemptionAmount() != null) {
            sql.SET("redemption_amount = #{redemptionAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getSubType() != null) {
            sql.SET("sub_type = #{subType,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeLimitStart() != null) {
            sql.SET("time_limit_start = #{timeLimitStart,jdbcType=INTEGER}");
        }
        
        if (record.getTimeLimitEnd() != null) {
            sql.SET("time_limit_end = #{timeLimitEnd,jdbcType=INTEGER}");
        }
        
        if (record.getTimeLimitUnit() != null) {
            sql.SET("time_limit_unit = #{timeLimitUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getExpirationProcessing() != null) {
            sql.SET("expiration_processing = #{expirationProcessing,jdbcType=VARCHAR}");
        }
        
        if (record.getProductIssuer() != null) {
            sql.SET("product_issuer = #{productIssuer,jdbcType=VARCHAR}");
        }
        
        if (record.getRequire() != null) {
            sql.SET("`require` = #{require,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getApplicationInformation() != null) {
            sql.SET("application_information = #{applicationInformation,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getExtraJson() != null) {
            sql.SET("extra_json = #{extraJson,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MarketProductExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}