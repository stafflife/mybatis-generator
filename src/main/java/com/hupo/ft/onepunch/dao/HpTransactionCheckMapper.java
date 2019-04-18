package com.hupo.ft.onepunch.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface HpTransactionCheckMapper {
    @SelectProvider(type = HpTransactionCheckSqlProvider.class, method = "countByExample")
    long countByExample(HpTransactionCheckExample example);

    @DeleteProvider(type = HpTransactionCheckSqlProvider.class, method = "deleteByExample")
    int deleteByExample(HpTransactionCheckExample example);

    @Delete({
            "delete from hp_transaction_check",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into hp_transaction_check (id, snapshot_id, ",
            "app_id, hupo_app_id, ",
            "user_id, user_name, ",
            "hp_wallet_id, txn_category, ",
            "trans_no, txn_id, ",
            "txn_time, txn_type, ",
            "txn_amount, fee_amount, ",
            "pay_type_code, txn_status, ",
            "order_no, order_type, ",
            "sub_order_no, sub_order_type, ",
            "source_wallet_no, source_wallet_name, ",
            "target_wallet_no, target_wallet_name, ",
            "match_status, file_id, ",
            "data_source, create_at, ",
            "update_at, non_matched_reason)",
            "values (#{id,jdbcType=VARCHAR}, #{snapshotId,jdbcType=VARCHAR}, ",
            "#{appId,jdbcType=VARCHAR}, #{hupoAppId,jdbcType=VARCHAR}, ",
            "#{userId,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
            "#{hpWalletId,jdbcType=VARCHAR}, #{txnCategory,jdbcType=VARCHAR}, ",
            "#{transNo,jdbcType=VARCHAR}, #{txnId,jdbcType=VARCHAR}, ",
            "#{txnTime,jdbcType=TIMESTAMP}, #{txnType,jdbcType=VARCHAR}, ",
            "#{txnAmount,jdbcType=DECIMAL}, #{feeAmount,jdbcType=DECIMAL}, ",
            "#{payTypeCode,jdbcType=VARCHAR}, #{txnStatus,jdbcType=VARCHAR}, ",
            "#{orderNo,jdbcType=VARCHAR}, #{orderType,jdbcType=VARCHAR}, ",
            "#{subOrderNo,jdbcType=VARCHAR}, #{subOrderType,jdbcType=VARCHAR}, ",
            "#{sourceWalletNo,jdbcType=VARCHAR}, #{sourceWalletName,jdbcType=VARCHAR}, ",
            "#{targetWalletNo,jdbcType=VARCHAR}, #{targetWalletName,jdbcType=VARCHAR}, ",
            "#{matchStatus,jdbcType=INTEGER}, #{fileId,jdbcType=VARCHAR}, ",
            "#{dataSource,jdbcType=VARCHAR}, #{createAt,jdbcType=TIMESTAMP}, ",
            "#{updateAt,jdbcType=TIMESTAMP}, #{nonMatchedReason,jdbcType=LONGVARCHAR})"
    })
    int insert(HpTransactionCheck record);

    @InsertProvider(type = HpTransactionCheckSqlProvider.class, method = "insertSelective")
    int insertSelective(HpTransactionCheck record);

    @SelectProvider(type = HpTransactionCheckSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "snapshot_id", property = "snapshotId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "app_id", property = "appId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hupo_app_id", property = "hupoAppId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hp_wallet_id", property = "hpWalletId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_category", property = "txnCategory", jdbcType = JdbcType.VARCHAR),
            @Result(column = "trans_no", property = "transNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_id", property = "txnId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_time", property = "txnTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "txn_type", property = "txnType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_amount", property = "txnAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fee_amount", property = "feeAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_type_code", property = "payTypeCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_status", property = "txnStatus", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_no", property = "orderNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sub_order_no", property = "subOrderNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sub_order_type", property = "subOrderType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source_wallet_no", property = "sourceWalletNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source_wallet_name", property = "sourceWalletName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target_wallet_no", property = "targetWalletNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target_wallet_name", property = "targetWalletName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "match_status", property = "matchStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "file_id", property = "fileId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "data_source", property = "dataSource", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_at", property = "createAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_at", property = "updateAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "non_matched_reason", property = "nonMatchedReason", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<HpTransactionCheck> selectByExampleWithBLOBs(HpTransactionCheckExample example);

    @SelectProvider(type = HpTransactionCheckSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "snapshot_id", property = "snapshotId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "app_id", property = "appId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hupo_app_id", property = "hupoAppId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hp_wallet_id", property = "hpWalletId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_category", property = "txnCategory", jdbcType = JdbcType.VARCHAR),
            @Result(column = "trans_no", property = "transNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_id", property = "txnId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_time", property = "txnTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "txn_type", property = "txnType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_amount", property = "txnAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fee_amount", property = "feeAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_type_code", property = "payTypeCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_status", property = "txnStatus", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_no", property = "orderNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sub_order_no", property = "subOrderNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sub_order_type", property = "subOrderType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source_wallet_no", property = "sourceWalletNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source_wallet_name", property = "sourceWalletName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target_wallet_no", property = "targetWalletNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target_wallet_name", property = "targetWalletName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "match_status", property = "matchStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "file_id", property = "fileId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "data_source", property = "dataSource", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_at", property = "createAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_at", property = "updateAt", jdbcType = JdbcType.TIMESTAMP)
    })
    List<HpTransactionCheck> selectByExample(HpTransactionCheckExample example);

    @Select({
            "select",
            "id, snapshot_id, app_id, hupo_app_id, user_id, user_name, hp_wallet_id, txn_category, ",
            "trans_no, txn_id, txn_time, txn_type, txn_amount, fee_amount, pay_type_code, ",
            "txn_status, order_no, order_type, sub_order_no, sub_order_type, source_wallet_no, ",
            "source_wallet_name, target_wallet_no, target_wallet_name, match_status, file_id, ",
            "data_source, create_at, update_at, non_matched_reason",
            "from hp_transaction_check",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "snapshot_id", property = "snapshotId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "app_id", property = "appId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hupo_app_id", property = "hupoAppId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hp_wallet_id", property = "hpWalletId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_category", property = "txnCategory", jdbcType = JdbcType.VARCHAR),
            @Result(column = "trans_no", property = "transNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_id", property = "txnId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_time", property = "txnTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "txn_type", property = "txnType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_amount", property = "txnAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fee_amount", property = "feeAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_type_code", property = "payTypeCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "txn_status", property = "txnStatus", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_no", property = "orderNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sub_order_no", property = "subOrderNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sub_order_type", property = "subOrderType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source_wallet_no", property = "sourceWalletNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source_wallet_name", property = "sourceWalletName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target_wallet_no", property = "targetWalletNo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target_wallet_name", property = "targetWalletName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "match_status", property = "matchStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "file_id", property = "fileId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "data_source", property = "dataSource", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_at", property = "createAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_at", property = "updateAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "non_matched_reason", property = "nonMatchedReason", jdbcType = JdbcType.LONGVARCHAR)
    })
    HpTransactionCheck selectByPrimaryKey(String id);

    @UpdateProvider(type = HpTransactionCheckSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") HpTransactionCheck record, @Param("example") HpTransactionCheckExample example);

    @UpdateProvider(type = HpTransactionCheckSqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") HpTransactionCheck record, @Param("example") HpTransactionCheckExample example);

    @UpdateProvider(type = HpTransactionCheckSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") HpTransactionCheck record, @Param("example") HpTransactionCheckExample example);

    @UpdateProvider(type = HpTransactionCheckSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HpTransactionCheck record);

    @Update({
            "update hp_transaction_check",
            "set snapshot_id = #{snapshotId,jdbcType=VARCHAR},",
            "app_id = #{appId,jdbcType=VARCHAR},",
            "hupo_app_id = #{hupoAppId,jdbcType=VARCHAR},",
            "user_id = #{userId,jdbcType=VARCHAR},",
            "user_name = #{userName,jdbcType=VARCHAR},",
            "hp_wallet_id = #{hpWalletId,jdbcType=VARCHAR},",
            "txn_category = #{txnCategory,jdbcType=VARCHAR},",
            "trans_no = #{transNo,jdbcType=VARCHAR},",
            "txn_id = #{txnId,jdbcType=VARCHAR},",
            "txn_time = #{txnTime,jdbcType=TIMESTAMP},",
            "txn_type = #{txnType,jdbcType=VARCHAR},",
            "txn_amount = #{txnAmount,jdbcType=DECIMAL},",
            "fee_amount = #{feeAmount,jdbcType=DECIMAL},",
            "pay_type_code = #{payTypeCode,jdbcType=VARCHAR},",
            "txn_status = #{txnStatus,jdbcType=VARCHAR},",
            "order_no = #{orderNo,jdbcType=VARCHAR},",
            "order_type = #{orderType,jdbcType=VARCHAR},",
            "sub_order_no = #{subOrderNo,jdbcType=VARCHAR},",
            "sub_order_type = #{subOrderType,jdbcType=VARCHAR},",
            "source_wallet_no = #{sourceWalletNo,jdbcType=VARCHAR},",
            "source_wallet_name = #{sourceWalletName,jdbcType=VARCHAR},",
            "target_wallet_no = #{targetWalletNo,jdbcType=VARCHAR},",
            "target_wallet_name = #{targetWalletName,jdbcType=VARCHAR},",
            "match_status = #{matchStatus,jdbcType=INTEGER},",
            "file_id = #{fileId,jdbcType=VARCHAR},",
            "data_source = #{dataSource,jdbcType=VARCHAR},",
            "create_at = #{createAt,jdbcType=TIMESTAMP},",
            "update_at = #{updateAt,jdbcType=TIMESTAMP},",
            "non_matched_reason = #{nonMatchedReason,jdbcType=LONGVARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(HpTransactionCheck record);

    @Update({
            "update hp_transaction_check",
            "set snapshot_id = #{snapshotId,jdbcType=VARCHAR},",
            "app_id = #{appId,jdbcType=VARCHAR},",
            "hupo_app_id = #{hupoAppId,jdbcType=VARCHAR},",
            "user_id = #{userId,jdbcType=VARCHAR},",
            "user_name = #{userName,jdbcType=VARCHAR},",
            "hp_wallet_id = #{hpWalletId,jdbcType=VARCHAR},",
            "txn_category = #{txnCategory,jdbcType=VARCHAR},",
            "trans_no = #{transNo,jdbcType=VARCHAR},",
            "txn_id = #{txnId,jdbcType=VARCHAR},",
            "txn_time = #{txnTime,jdbcType=TIMESTAMP},",
            "txn_type = #{txnType,jdbcType=VARCHAR},",
            "txn_amount = #{txnAmount,jdbcType=DECIMAL},",
            "fee_amount = #{feeAmount,jdbcType=DECIMAL},",
            "pay_type_code = #{payTypeCode,jdbcType=VARCHAR},",
            "txn_status = #{txnStatus,jdbcType=VARCHAR},",
            "order_no = #{orderNo,jdbcType=VARCHAR},",
            "order_type = #{orderType,jdbcType=VARCHAR},",
            "sub_order_no = #{subOrderNo,jdbcType=VARCHAR},",
            "sub_order_type = #{subOrderType,jdbcType=VARCHAR},",
            "source_wallet_no = #{sourceWalletNo,jdbcType=VARCHAR},",
            "source_wallet_name = #{sourceWalletName,jdbcType=VARCHAR},",
            "target_wallet_no = #{targetWalletNo,jdbcType=VARCHAR},",
            "target_wallet_name = #{targetWalletName,jdbcType=VARCHAR},",
            "match_status = #{matchStatus,jdbcType=INTEGER},",
            "file_id = #{fileId,jdbcType=VARCHAR},",
            "data_source = #{dataSource,jdbcType=VARCHAR},",
            "create_at = #{createAt,jdbcType=TIMESTAMP},",
            "update_at = #{updateAt,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(HpTransactionCheck record);
}