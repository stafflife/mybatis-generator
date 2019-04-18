package com.hupo.ft.onepunch.twond.market.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MarketProduct {
    private String id;

    private String channel;

    private String productCode;

    private String category;

    private String productName;

    private String productType;

    private String productUrl;

    private String productLogoUrl;

    private String crawlUrl;

    private BigDecimal rateStart;

    private BigDecimal rateEnd;

    private String rateType;

    private BigDecimal amountStart;

    private BigDecimal amountEnd;

    private String timeLimit;

    private BigDecimal netWorth;

    private String feeAmount;

    private String parentCode;

    private Boolean recommend;

    private Boolean hasChildren;

    private Date calculateDate;

    private String orgId;

    private String orgName;

    private String orgLogoUrl;

    private Byte priority;

    private String lendingTime;

    private Boolean isDeleted;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    private Integer fluiditySort;

    private String type;

    private String recommendRemark;

    private BigDecimal redemptionAmount;

    private String subType;

    private Integer timeLimitStart;

    private Integer timeLimitEnd;

    private String timeLimitUnit;

    private String expirationProcessing;

    private String productIssuer;

    private String require;

    private String applicationInformation;

    private String extraJson;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    public String getProductLogoUrl() {
        return productLogoUrl;
    }

    public void setProductLogoUrl(String productLogoUrl) {
        this.productLogoUrl = productLogoUrl == null ? null : productLogoUrl.trim();
    }

    public String getCrawlUrl() {
        return crawlUrl;
    }

    public void setCrawlUrl(String crawlUrl) {
        this.crawlUrl = crawlUrl == null ? null : crawlUrl.trim();
    }

    public BigDecimal getRateStart() {
        return rateStart;
    }

    public void setRateStart(BigDecimal rateStart) {
        this.rateStart = rateStart;
    }

    public BigDecimal getRateEnd() {
        return rateEnd;
    }

    public void setRateEnd(BigDecimal rateEnd) {
        this.rateEnd = rateEnd;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType == null ? null : rateType.trim();
    }

    public BigDecimal getAmountStart() {
        return amountStart;
    }

    public void setAmountStart(BigDecimal amountStart) {
        this.amountStart = amountStart;
    }

    public BigDecimal getAmountEnd() {
        return amountEnd;
    }

    public void setAmountEnd(BigDecimal amountEnd) {
        this.amountEnd = amountEnd;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public BigDecimal getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount == null ? null : feeAmount.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public Date getCalculateDate() {
        return calculateDate;
    }

    public void setCalculateDate(Date calculateDate) {
        this.calculateDate = calculateDate;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgLogoUrl() {
        return orgLogoUrl;
    }

    public void setOrgLogoUrl(String orgLogoUrl) {
        this.orgLogoUrl = orgLogoUrl == null ? null : orgLogoUrl.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getLendingTime() {
        return lendingTime;
    }

    public void setLendingTime(String lendingTime) {
        this.lendingTime = lendingTime == null ? null : lendingTime.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Integer getFluiditySort() {
        return fluiditySort;
    }

    public void setFluiditySort(Integer fluiditySort) {
        this.fluiditySort = fluiditySort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRecommendRemark() {
        return recommendRemark;
    }

    public void setRecommendRemark(String recommendRemark) {
        this.recommendRemark = recommendRemark == null ? null : recommendRemark.trim();
    }

    public BigDecimal getRedemptionAmount() {
        return redemptionAmount;
    }

    public void setRedemptionAmount(BigDecimal redemptionAmount) {
        this.redemptionAmount = redemptionAmount;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public Integer getTimeLimitStart() {
        return timeLimitStart;
    }

    public void setTimeLimitStart(Integer timeLimitStart) {
        this.timeLimitStart = timeLimitStart;
    }

    public Integer getTimeLimitEnd() {
        return timeLimitEnd;
    }

    public void setTimeLimitEnd(Integer timeLimitEnd) {
        this.timeLimitEnd = timeLimitEnd;
    }

    public String getTimeLimitUnit() {
        return timeLimitUnit;
    }

    public void setTimeLimitUnit(String timeLimitUnit) {
        this.timeLimitUnit = timeLimitUnit == null ? null : timeLimitUnit.trim();
    }

    public String getExpirationProcessing() {
        return expirationProcessing;
    }

    public void setExpirationProcessing(String expirationProcessing) {
        this.expirationProcessing = expirationProcessing == null ? null : expirationProcessing.trim();
    }

    public String getProductIssuer() {
        return productIssuer;
    }

    public void setProductIssuer(String productIssuer) {
        this.productIssuer = productIssuer == null ? null : productIssuer.trim();
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require == null ? null : require.trim();
    }

    public String getApplicationInformation() {
        return applicationInformation;
    }

    public void setApplicationInformation(String applicationInformation) {
        this.applicationInformation = applicationInformation == null ? null : applicationInformation.trim();
    }

    public String getExtraJson() {
        return extraJson;
    }

    public void setExtraJson(String extraJson) {
        this.extraJson = extraJson == null ? null : extraJson.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}