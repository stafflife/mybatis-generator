package com.hupo.ft.onepunch.dao;

import com.hupo.ft.onepunch.dao.HpTransactionCheckExample.Criteria;
import com.hupo.ft.onepunch.dao.HpTransactionCheckExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class HpTransactionCheckSqlProvider {

    public String countByExample(HpTransactionCheckExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("hp_transaction_check");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(HpTransactionCheckExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("hp_transaction_check");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(HpTransactionCheck record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hp_transaction_check");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getSnapshotId() != null) {
            sql.VALUES("snapshot_id", "#{snapshotId,jdbcType=VARCHAR}");
        }

        if (record.getAppId() != null) {
            sql.VALUES("app_id", "#{appId,jdbcType=VARCHAR}");
        }

        if (record.getHupoAppId() != null) {
            sql.VALUES("hupo_app_id", "#{hupoAppId,jdbcType=VARCHAR}");
        }

        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }

        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }

        if (record.getHpWalletId() != null) {
            sql.VALUES("hp_wallet_id", "#{hpWalletId,jdbcType=VARCHAR}");
        }

        if (record.getTxnCategory() != null) {
            sql.VALUES("txn_category", "#{txnCategory,jdbcType=VARCHAR}");
        }

        if (record.getTransNo() != null) {
            sql.VALUES("trans_no", "#{transNo,jdbcType=VARCHAR}");
        }

        if (record.getTxnId() != null) {
            sql.VALUES("txn_id", "#{txnId,jdbcType=VARCHAR}");
        }

        if (record.getTxnTime() != null) {
            sql.VALUES("txn_time", "#{txnTime,jdbcType=TIMESTAMP}");
        }

        if (record.getTxnType() != null) {
            sql.VALUES("txn_type", "#{txnType,jdbcType=VARCHAR}");
        }

        if (record.getTxnAmount() != null) {
            sql.VALUES("txn_amount", "#{txnAmount,jdbcType=DECIMAL}");
        }

        if (record.getFeeAmount() != null) {
            sql.VALUES("fee_amount", "#{feeAmount,jdbcType=DECIMAL}");
        }

        if (record.getPayTypeCode() != null) {
            sql.VALUES("pay_type_code", "#{payTypeCode,jdbcType=VARCHAR}");
        }

        if (record.getTxnStatus() != null) {
            sql.VALUES("txn_status", "#{txnStatus,jdbcType=VARCHAR}");
        }

        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }

        if (record.getOrderType() != null) {
            sql.VALUES("order_type", "#{orderType,jdbcType=VARCHAR}");
        }

        if (record.getSubOrderNo() != null) {
            sql.VALUES("sub_order_no", "#{subOrderNo,jdbcType=VARCHAR}");
        }

        if (record.getSubOrderType() != null) {
            sql.VALUES("sub_order_type", "#{subOrderType,jdbcType=VARCHAR}");
        }

        if (record.getSourceWalletNo() != null) {
            sql.VALUES("source_wallet_no", "#{sourceWalletNo,jdbcType=VARCHAR}");
        }

        if (record.getSourceWalletName() != null) {
            sql.VALUES("source_wallet_name", "#{sourceWalletName,jdbcType=VARCHAR}");
        }

        if (record.getTargetWalletNo() != null) {
            sql.VALUES("target_wallet_no", "#{targetWalletNo,jdbcType=VARCHAR}");
        }

        if (record.getTargetWalletName() != null) {
            sql.VALUES("target_wallet_name", "#{targetWalletName,jdbcType=VARCHAR}");
        }

        if (record.getMatchStatus() != null) {
            sql.VALUES("match_status", "#{matchStatus,jdbcType=INTEGER}");
        }

        if (record.getFileId() != null) {
            sql.VALUES("file_id", "#{fileId,jdbcType=VARCHAR}");
        }

        if (record.getDataSource() != null) {
            sql.VALUES("data_source", "#{dataSource,jdbcType=VARCHAR}");
        }

        if (record.getCreateAt() != null) {
            sql.VALUES("create_at", "#{createAt,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateAt() != null) {
            sql.VALUES("update_at", "#{updateAt,jdbcType=TIMESTAMP}");
        }

        if (record.getNonMatchedReason() != null) {
            sql.VALUES("non_matched_reason", "#{nonMatchedReason,jdbcType=LONGVARCHAR}");
        }

        return sql.toString();
    }

    public String selectByExampleWithBLOBs(HpTransactionCheckExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("snapshot_id");
        sql.SELECT("app_id");
        sql.SELECT("hupo_app_id");
        sql.SELECT("user_id");
        sql.SELECT("user_name");
        sql.SELECT("hp_wallet_id");
        sql.SELECT("txn_category");
        sql.SELECT("trans_no");
        sql.SELECT("txn_id");
        sql.SELECT("txn_time");
        sql.SELECT("txn_type");
        sql.SELECT("txn_amount");
        sql.SELECT("fee_amount");
        sql.SELECT("pay_type_code");
        sql.SELECT("txn_status");
        sql.SELECT("order_no");
        sql.SELECT("order_type");
        sql.SELECT("sub_order_no");
        sql.SELECT("sub_order_type");
        sql.SELECT("source_wallet_no");
        sql.SELECT("source_wallet_name");
        sql.SELECT("target_wallet_no");
        sql.SELECT("target_wallet_name");
        sql.SELECT("match_status");
        sql.SELECT("file_id");
        sql.SELECT("data_source");
        sql.SELECT("create_at");
        sql.SELECT("update_at");
        sql.SELECT("non_matched_reason");
        sql.FROM("hp_transaction_check");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    public String selectByExample(HpTransactionCheckExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("snapshot_id");
        sql.SELECT("app_id");
        sql.SELECT("hupo_app_id");
        sql.SELECT("user_id");
        sql.SELECT("user_name");
        sql.SELECT("hp_wallet_id");
        sql.SELECT("txn_category");
        sql.SELECT("trans_no");
        sql.SELECT("txn_id");
        sql.SELECT("txn_time");
        sql.SELECT("txn_type");
        sql.SELECT("txn_amount");
        sql.SELECT("fee_amount");
        sql.SELECT("pay_type_code");
        sql.SELECT("txn_status");
        sql.SELECT("order_no");
        sql.SELECT("order_type");
        sql.SELECT("sub_order_no");
        sql.SELECT("sub_order_type");
        sql.SELECT("source_wallet_no");
        sql.SELECT("source_wallet_name");
        sql.SELECT("target_wallet_no");
        sql.SELECT("target_wallet_name");
        sql.SELECT("match_status");
        sql.SELECT("file_id");
        sql.SELECT("data_source");
        sql.SELECT("create_at");
        sql.SELECT("update_at");
        sql.FROM("hp_transaction_check");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        HpTransactionCheck record = (HpTransactionCheck) parameter.get("record");
        HpTransactionCheckExample example = (HpTransactionCheckExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("hp_transaction_check");

        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }

        if (record.getSnapshotId() != null) {
            sql.SET("snapshot_id = #{record.snapshotId,jdbcType=VARCHAR}");
        }

        if (record.getAppId() != null) {
            sql.SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        }

        if (record.getHupoAppId() != null) {
            sql.SET("hupo_app_id = #{record.hupoAppId,jdbcType=VARCHAR}");
        }

        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }

        if (record.getUserName() != null) {
            sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }

        if (record.getHpWalletId() != null) {
            sql.SET("hp_wallet_id = #{record.hpWalletId,jdbcType=VARCHAR}");
        }

        if (record.getTxnCategory() != null) {
            sql.SET("txn_category = #{record.txnCategory,jdbcType=VARCHAR}");
        }

        if (record.getTransNo() != null) {
            sql.SET("trans_no = #{record.transNo,jdbcType=VARCHAR}");
        }

        if (record.getTxnId() != null) {
            sql.SET("txn_id = #{record.txnId,jdbcType=VARCHAR}");
        }

        if (record.getTxnTime() != null) {
            sql.SET("txn_time = #{record.txnTime,jdbcType=TIMESTAMP}");
        }

        if (record.getTxnType() != null) {
            sql.SET("txn_type = #{record.txnType,jdbcType=VARCHAR}");
        }

        if (record.getTxnAmount() != null) {
            sql.SET("txn_amount = #{record.txnAmount,jdbcType=DECIMAL}");
        }

        if (record.getFeeAmount() != null) {
            sql.SET("fee_amount = #{record.feeAmount,jdbcType=DECIMAL}");
        }

        if (record.getPayTypeCode() != null) {
            sql.SET("pay_type_code = #{record.payTypeCode,jdbcType=VARCHAR}");
        }

        if (record.getTxnStatus() != null) {
            sql.SET("txn_status = #{record.txnStatus,jdbcType=VARCHAR}");
        }

        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }

        if (record.getOrderType() != null) {
            sql.SET("order_type = #{record.orderType,jdbcType=VARCHAR}");
        }

        if (record.getSubOrderNo() != null) {
            sql.SET("sub_order_no = #{record.subOrderNo,jdbcType=VARCHAR}");
        }

        if (record.getSubOrderType() != null) {
            sql.SET("sub_order_type = #{record.subOrderType,jdbcType=VARCHAR}");
        }

        if (record.getSourceWalletNo() != null) {
            sql.SET("source_wallet_no = #{record.sourceWalletNo,jdbcType=VARCHAR}");
        }

        if (record.getSourceWalletName() != null) {
            sql.SET("source_wallet_name = #{record.sourceWalletName,jdbcType=VARCHAR}");
        }

        if (record.getTargetWalletNo() != null) {
            sql.SET("target_wallet_no = #{record.targetWalletNo,jdbcType=VARCHAR}");
        }

        if (record.getTargetWalletName() != null) {
            sql.SET("target_wallet_name = #{record.targetWalletName,jdbcType=VARCHAR}");
        }

        if (record.getMatchStatus() != null) {
            sql.SET("match_status = #{record.matchStatus,jdbcType=INTEGER}");
        }

        if (record.getFileId() != null) {
            sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        }

        if (record.getDataSource() != null) {
            sql.SET("data_source = #{record.dataSource,jdbcType=VARCHAR}");
        }

        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        }

        if (record.getNonMatchedReason() != null) {
            sql.SET("non_matched_reason = #{record.nonMatchedReason,jdbcType=LONGVARCHAR}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("hp_transaction_check");

        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("snapshot_id = #{record.snapshotId,jdbcType=VARCHAR}");
        sql.SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        sql.SET("hupo_app_id = #{record.hupoAppId,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("hp_wallet_id = #{record.hpWalletId,jdbcType=VARCHAR}");
        sql.SET("txn_category = #{record.txnCategory,jdbcType=VARCHAR}");
        sql.SET("trans_no = #{record.transNo,jdbcType=VARCHAR}");
        sql.SET("txn_id = #{record.txnId,jdbcType=VARCHAR}");
        sql.SET("txn_time = #{record.txnTime,jdbcType=TIMESTAMP}");
        sql.SET("txn_type = #{record.txnType,jdbcType=VARCHAR}");
        sql.SET("txn_amount = #{record.txnAmount,jdbcType=DECIMAL}");
        sql.SET("fee_amount = #{record.feeAmount,jdbcType=DECIMAL}");
        sql.SET("pay_type_code = #{record.payTypeCode,jdbcType=VARCHAR}");
        sql.SET("txn_status = #{record.txnStatus,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("order_type = #{record.orderType,jdbcType=VARCHAR}");
        sql.SET("sub_order_no = #{record.subOrderNo,jdbcType=VARCHAR}");
        sql.SET("sub_order_type = #{record.subOrderType,jdbcType=VARCHAR}");
        sql.SET("source_wallet_no = #{record.sourceWalletNo,jdbcType=VARCHAR}");
        sql.SET("source_wallet_name = #{record.sourceWalletName,jdbcType=VARCHAR}");
        sql.SET("target_wallet_no = #{record.targetWalletNo,jdbcType=VARCHAR}");
        sql.SET("target_wallet_name = #{record.targetWalletName,jdbcType=VARCHAR}");
        sql.SET("match_status = #{record.matchStatus,jdbcType=INTEGER}");
        sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        sql.SET("data_source = #{record.dataSource,jdbcType=VARCHAR}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        sql.SET("non_matched_reason = #{record.nonMatchedReason,jdbcType=LONGVARCHAR}");

        HpTransactionCheckExample example = (HpTransactionCheckExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("hp_transaction_check");

        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("snapshot_id = #{record.snapshotId,jdbcType=VARCHAR}");
        sql.SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        sql.SET("hupo_app_id = #{record.hupoAppId,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("hp_wallet_id = #{record.hpWalletId,jdbcType=VARCHAR}");
        sql.SET("txn_category = #{record.txnCategory,jdbcType=VARCHAR}");
        sql.SET("trans_no = #{record.transNo,jdbcType=VARCHAR}");
        sql.SET("txn_id = #{record.txnId,jdbcType=VARCHAR}");
        sql.SET("txn_time = #{record.txnTime,jdbcType=TIMESTAMP}");
        sql.SET("txn_type = #{record.txnType,jdbcType=VARCHAR}");
        sql.SET("txn_amount = #{record.txnAmount,jdbcType=DECIMAL}");
        sql.SET("fee_amount = #{record.feeAmount,jdbcType=DECIMAL}");
        sql.SET("pay_type_code = #{record.payTypeCode,jdbcType=VARCHAR}");
        sql.SET("txn_status = #{record.txnStatus,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("order_type = #{record.orderType,jdbcType=VARCHAR}");
        sql.SET("sub_order_no = #{record.subOrderNo,jdbcType=VARCHAR}");
        sql.SET("sub_order_type = #{record.subOrderType,jdbcType=VARCHAR}");
        sql.SET("source_wallet_no = #{record.sourceWalletNo,jdbcType=VARCHAR}");
        sql.SET("source_wallet_name = #{record.sourceWalletName,jdbcType=VARCHAR}");
        sql.SET("target_wallet_no = #{record.targetWalletNo,jdbcType=VARCHAR}");
        sql.SET("target_wallet_name = #{record.targetWalletName,jdbcType=VARCHAR}");
        sql.SET("match_status = #{record.matchStatus,jdbcType=INTEGER}");
        sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        sql.SET("data_source = #{record.dataSource,jdbcType=VARCHAR}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");

        HpTransactionCheckExample example = (HpTransactionCheckExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HpTransactionCheck record) {
        SQL sql = new SQL();
        sql.UPDATE("hp_transaction_check");

        if (record.getSnapshotId() != null) {
            sql.SET("snapshot_id = #{snapshotId,jdbcType=VARCHAR}");
        }

        if (record.getAppId() != null) {
            sql.SET("app_id = #{appId,jdbcType=VARCHAR}");
        }

        if (record.getHupoAppId() != null) {
            sql.SET("hupo_app_id = #{hupoAppId,jdbcType=VARCHAR}");
        }

        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=VARCHAR}");
        }

        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }

        if (record.getHpWalletId() != null) {
            sql.SET("hp_wallet_id = #{hpWalletId,jdbcType=VARCHAR}");
        }

        if (record.getTxnCategory() != null) {
            sql.SET("txn_category = #{txnCategory,jdbcType=VARCHAR}");
        }

        if (record.getTransNo() != null) {
            sql.SET("trans_no = #{transNo,jdbcType=VARCHAR}");
        }

        if (record.getTxnId() != null) {
            sql.SET("txn_id = #{txnId,jdbcType=VARCHAR}");
        }

        if (record.getTxnTime() != null) {
            sql.SET("txn_time = #{txnTime,jdbcType=TIMESTAMP}");
        }

        if (record.getTxnType() != null) {
            sql.SET("txn_type = #{txnType,jdbcType=VARCHAR}");
        }

        if (record.getTxnAmount() != null) {
            sql.SET("txn_amount = #{txnAmount,jdbcType=DECIMAL}");
        }

        if (record.getFeeAmount() != null) {
            sql.SET("fee_amount = #{feeAmount,jdbcType=DECIMAL}");
        }

        if (record.getPayTypeCode() != null) {
            sql.SET("pay_type_code = #{payTypeCode,jdbcType=VARCHAR}");
        }

        if (record.getTxnStatus() != null) {
            sql.SET("txn_status = #{txnStatus,jdbcType=VARCHAR}");
        }

        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }

        if (record.getOrderType() != null) {
            sql.SET("order_type = #{orderType,jdbcType=VARCHAR}");
        }

        if (record.getSubOrderNo() != null) {
            sql.SET("sub_order_no = #{subOrderNo,jdbcType=VARCHAR}");
        }

        if (record.getSubOrderType() != null) {
            sql.SET("sub_order_type = #{subOrderType,jdbcType=VARCHAR}");
        }

        if (record.getSourceWalletNo() != null) {
            sql.SET("source_wallet_no = #{sourceWalletNo,jdbcType=VARCHAR}");
        }

        if (record.getSourceWalletName() != null) {
            sql.SET("source_wallet_name = #{sourceWalletName,jdbcType=VARCHAR}");
        }

        if (record.getTargetWalletNo() != null) {
            sql.SET("target_wallet_no = #{targetWalletNo,jdbcType=VARCHAR}");
        }

        if (record.getTargetWalletName() != null) {
            sql.SET("target_wallet_name = #{targetWalletName,jdbcType=VARCHAR}");
        }

        if (record.getMatchStatus() != null) {
            sql.SET("match_status = #{matchStatus,jdbcType=INTEGER}");
        }

        if (record.getFileId() != null) {
            sql.SET("file_id = #{fileId,jdbcType=VARCHAR}");
        }

        if (record.getDataSource() != null) {
            sql.SET("data_source = #{dataSource,jdbcType=VARCHAR}");
        }

        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{createAt,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{updateAt,jdbcType=TIMESTAMP}");
        }

        if (record.getNonMatchedReason() != null) {
            sql.SET("non_matched_reason = #{nonMatchedReason,jdbcType=LONGVARCHAR}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }

    protected void applyWhere(SQL sql, HpTransactionCheckExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
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