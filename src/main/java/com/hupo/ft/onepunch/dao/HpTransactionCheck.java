package com.hupo.ft.onepunch.dao;

import java.math.BigDecimal;
import java.util.Date;

public class HpTransactionCheck {
    private String id;

    private String snapshotId;

    private String appId;

    private String hupoAppId;

    private String userId;

    private String userName;

    private String hpWalletId;

    private String txnCategory;

    private String transNo;

    private String txnId;

    private Date txnTime;

    private String txnType;

    private BigDecimal txnAmount;

    private BigDecimal feeAmount;

    private String payTypeCode;

    private String txnStatus;

    private String orderNo;

    private String orderType;

    private String subOrderNo;

    private String subOrderType;

    private String sourceWalletNo;

    private String sourceWalletName;

    private String targetWalletNo;

    private String targetWalletName;

    private Integer matchStatus;

    private String fileId;

    private String dataSource;

    private Date createAt;

    private Date updateAt;

    private String nonMatchedReason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId == null ? null : snapshotId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getHupoAppId() {
        return hupoAppId;
    }

    public void setHupoAppId(String hupoAppId) {
        this.hupoAppId = hupoAppId == null ? null : hupoAppId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getHpWalletId() {
        return hpWalletId;
    }

    public void setHpWalletId(String hpWalletId) {
        this.hpWalletId = hpWalletId == null ? null : hpWalletId.trim();
    }

    public String getTxnCategory() {
        return txnCategory;
    }

    public void setTxnCategory(String txnCategory) {
        this.txnCategory = txnCategory == null ? null : txnCategory.trim();
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId == null ? null : txnId.trim();
    }

    public Date getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(Date txnTime) {
        this.txnTime = txnTime;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType == null ? null : txnType.trim();
    }

    public BigDecimal getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(BigDecimal txnAmount) {
        this.txnAmount = txnAmount;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode == null ? null : payTypeCode.trim();
    }

    public String getTxnStatus() {
        return txnStatus;
    }

    public void setTxnStatus(String txnStatus) {
        this.txnStatus = txnStatus == null ? null : txnStatus.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo == null ? null : subOrderNo.trim();
    }

    public String getSubOrderType() {
        return subOrderType;
    }

    public void setSubOrderType(String subOrderType) {
        this.subOrderType = subOrderType == null ? null : subOrderType.trim();
    }

    public String getSourceWalletNo() {
        return sourceWalletNo;
    }

    public void setSourceWalletNo(String sourceWalletNo) {
        this.sourceWalletNo = sourceWalletNo == null ? null : sourceWalletNo.trim();
    }

    public String getSourceWalletName() {
        return sourceWalletName;
    }

    public void setSourceWalletName(String sourceWalletName) {
        this.sourceWalletName = sourceWalletName == null ? null : sourceWalletName.trim();
    }

    public String getTargetWalletNo() {
        return targetWalletNo;
    }

    public void setTargetWalletNo(String targetWalletNo) {
        this.targetWalletNo = targetWalletNo == null ? null : targetWalletNo.trim();
    }

    public String getTargetWalletName() {
        return targetWalletName;
    }

    public void setTargetWalletName(String targetWalletName) {
        this.targetWalletName = targetWalletName == null ? null : targetWalletName.trim();
    }

    public Integer getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getNonMatchedReason() {
        return nonMatchedReason;
    }

    public void setNonMatchedReason(String nonMatchedReason) {
        this.nonMatchedReason = nonMatchedReason == null ? null : nonMatchedReason.trim();
    }
}