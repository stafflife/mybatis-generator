package com.hupo.ft.onepunch.twond.market.model.entity;

import java.util.Date;

public class AppProductMapping {
    private String id;

    private String channel;

    private String productCode;

    private String appId;

    private String channelMappingUrl;

    private String channelAppId;

    private String showType;

    private Boolean recommend;

    private Integer defaultSort;

    private Boolean isDeleted;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    private String recommendRemark;

    private String clientNum;

    private String extraJson;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getChannelMappingUrl() {
        return channelMappingUrl;
    }

    public void setChannelMappingUrl(String channelMappingUrl) {
        this.channelMappingUrl = channelMappingUrl == null ? null : channelMappingUrl.trim();
    }

    public String getChannelAppId() {
        return channelAppId;
    }

    public void setChannelAppId(String channelAppId) {
        this.channelAppId = channelAppId == null ? null : channelAppId.trim();
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType == null ? null : showType.trim();
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getDefaultSort() {
        return defaultSort;
    }

    public void setDefaultSort(Integer defaultSort) {
        this.defaultSort = defaultSort;
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

    public String getRecommendRemark() {
        return recommendRemark;
    }

    public void setRecommendRemark(String recommendRemark) {
        this.recommendRemark = recommendRemark == null ? null : recommendRemark.trim();
    }

    public String getClientNum() {
        return clientNum;
    }

    public void setClientNum(String clientNum) {
        this.clientNum = clientNum == null ? null : clientNum.trim();
    }

    public String getExtraJson() {
        return extraJson;
    }

    public void setExtraJson(String extraJson) {
        this.extraJson = extraJson == null ? null : extraJson.trim();
    }
}