package com.hupo.ft.onepunch.twond.market.repository.mybatis;

import com.hupo.ft.onepunch.twond.market.model.entity.MarketProduct;
import com.hupo.ft.onepunch.twond.market.model.entity.MarketProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MarketProductMapper {
    @SelectProvider(type=MarketProductSqlProvider.class, method="countByExample")
    long countByExample(MarketProductExample example);

    @DeleteProvider(type=MarketProductSqlProvider.class, method="deleteByExample")
    int deleteByExample(MarketProductExample example);

    @Delete({
        "delete from market_product",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into market_product (id, channel, ",
        "product_code, category, ",
        "product_name, product_type, ",
        "product_url, product_logo_url, ",
        "crawl_url, rate_start, ",
        "rate_end, rate_type, ",
        "amount_start, amount_end, ",
        "time_limit, net_worth, ",
        "fee_amount, parent_code, ",
        "recommend, has_children, ",
        "calculate_date, org_id, ",
        "org_name, org_logo_Url, ",
        "priority, lending_time, ",
        "is_deleted, create_at, ",
        "create_by, update_at, ",
        "update_by, fluidity_sort, ",
        "`type`, recommend_remark, ",
        "redemption_amount, sub_type, ",
        "time_limit_start, time_limit_end, ",
        "time_limit_unit, expiration_processing, ",
        "product_issuer, `require`, ",
        "application_information, extra_json, ",
        "remark)",
        "values (#{id,jdbcType=VARCHAR}, #{channel,jdbcType=VARCHAR}, ",
        "#{productCode,jdbcType=VARCHAR}, #{category,jdbcType=VARCHAR}, ",
        "#{productName,jdbcType=VARCHAR}, #{productType,jdbcType=VARCHAR}, ",
        "#{productUrl,jdbcType=VARCHAR}, #{productLogoUrl,jdbcType=VARCHAR}, ",
        "#{crawlUrl,jdbcType=VARCHAR}, #{rateStart,jdbcType=DECIMAL}, ",
        "#{rateEnd,jdbcType=DECIMAL}, #{rateType,jdbcType=VARCHAR}, ",
        "#{amountStart,jdbcType=DECIMAL}, #{amountEnd,jdbcType=DECIMAL}, ",
        "#{timeLimit,jdbcType=VARCHAR}, #{netWorth,jdbcType=DECIMAL}, ",
        "#{feeAmount,jdbcType=VARCHAR}, #{parentCode,jdbcType=VARCHAR}, ",
        "#{recommend,jdbcType=BIT}, #{hasChildren,jdbcType=BIT}, ",
        "#{calculateDate,jdbcType=TIMESTAMP}, #{orgId,jdbcType=VARCHAR}, ",
        "#{orgName,jdbcType=VARCHAR}, #{orgLogoUrl,jdbcType=VARCHAR}, ",
        "#{priority,jdbcType=TINYINT}, #{lendingTime,jdbcType=VARCHAR}, ",
        "#{isDeleted,jdbcType=BIT}, #{createAt,jdbcType=TIMESTAMP}, ",
        "#{createBy,jdbcType=VARCHAR}, #{updateAt,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{fluiditySort,jdbcType=INTEGER}, ",
        "#{type,jdbcType=VARCHAR}, #{recommendRemark,jdbcType=VARCHAR}, ",
        "#{redemptionAmount,jdbcType=DECIMAL}, #{subType,jdbcType=VARCHAR}, ",
        "#{timeLimitStart,jdbcType=INTEGER}, #{timeLimitEnd,jdbcType=INTEGER}, ",
        "#{timeLimitUnit,jdbcType=VARCHAR}, #{expirationProcessing,jdbcType=VARCHAR}, ",
        "#{productIssuer,jdbcType=VARCHAR}, #{require,jdbcType=LONGVARCHAR}, ",
        "#{applicationInformation,jdbcType=LONGVARCHAR}, #{extraJson,jdbcType=LONGVARCHAR}, ",
        "#{remark,jdbcType=LONGVARCHAR})"
    })
    int insert(MarketProduct record);

    @InsertProvider(type=MarketProductSqlProvider.class, method="insertSelective")
    int insertSelective(MarketProduct record);

    @SelectProvider(type=MarketProductSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_code", property="productCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_type", property="productType", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_url", property="productUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_logo_url", property="productLogoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="crawl_url", property="crawlUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="rate_start", property="rateStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate_end", property="rateEnd", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate_type", property="rateType", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount_start", property="amountStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="amount_end", property="amountEnd", jdbcType=JdbcType.DECIMAL),
        @Result(column="time_limit", property="timeLimit", jdbcType=JdbcType.VARCHAR),
        @Result(column="net_worth", property="netWorth", jdbcType=JdbcType.DECIMAL),
        @Result(column="fee_amount", property="feeAmount", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_code", property="parentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend", property="recommend", jdbcType=JdbcType.BIT),
        @Result(column="has_children", property="hasChildren", jdbcType=JdbcType.BIT),
        @Result(column="calculate_date", property="calculateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="org_id", property="orgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_name", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_logo_Url", property="orgLogoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="priority", property="priority", jdbcType=JdbcType.TINYINT),
        @Result(column="lending_time", property="lendingTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="fluidity_sort", property="fluiditySort", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_remark", property="recommendRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="redemption_amount", property="redemptionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="sub_type", property="subType", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_limit_start", property="timeLimitStart", jdbcType=JdbcType.INTEGER),
        @Result(column="time_limit_end", property="timeLimitEnd", jdbcType=JdbcType.INTEGER),
        @Result(column="time_limit_unit", property="timeLimitUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="expiration_processing", property="expirationProcessing", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_issuer", property="productIssuer", jdbcType=JdbcType.VARCHAR),
        @Result(column="require", property="require", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="application_information", property="applicationInformation", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="extra_json", property="extraJson", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<MarketProduct> selectByExampleWithBLOBs(MarketProductExample example);

    @SelectProvider(type=MarketProductSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_code", property="productCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_type", property="productType", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_url", property="productUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_logo_url", property="productLogoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="crawl_url", property="crawlUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="rate_start", property="rateStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate_end", property="rateEnd", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate_type", property="rateType", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount_start", property="amountStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="amount_end", property="amountEnd", jdbcType=JdbcType.DECIMAL),
        @Result(column="time_limit", property="timeLimit", jdbcType=JdbcType.VARCHAR),
        @Result(column="net_worth", property="netWorth", jdbcType=JdbcType.DECIMAL),
        @Result(column="fee_amount", property="feeAmount", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_code", property="parentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend", property="recommend", jdbcType=JdbcType.BIT),
        @Result(column="has_children", property="hasChildren", jdbcType=JdbcType.BIT),
        @Result(column="calculate_date", property="calculateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="org_id", property="orgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_name", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_logo_Url", property="orgLogoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="priority", property="priority", jdbcType=JdbcType.TINYINT),
        @Result(column="lending_time", property="lendingTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="fluidity_sort", property="fluiditySort", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_remark", property="recommendRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="redemption_amount", property="redemptionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="sub_type", property="subType", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_limit_start", property="timeLimitStart", jdbcType=JdbcType.INTEGER),
        @Result(column="time_limit_end", property="timeLimitEnd", jdbcType=JdbcType.INTEGER),
        @Result(column="time_limit_unit", property="timeLimitUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="expiration_processing", property="expirationProcessing", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_issuer", property="productIssuer", jdbcType=JdbcType.VARCHAR)
    })
    List<MarketProduct> selectByExample(MarketProductExample example);

    @Select({
        "select",
        "id, channel, product_code, category, product_name, product_type, product_url, ",
        "product_logo_url, crawl_url, rate_start, rate_end, rate_type, amount_start, ",
        "amount_end, time_limit, net_worth, fee_amount, parent_code, recommend, has_children, ",
        "calculate_date, org_id, org_name, org_logo_Url, priority, lending_time, is_deleted, ",
        "create_at, create_by, update_at, update_by, fluidity_sort, `type`, recommend_remark, ",
        "redemption_amount, sub_type, time_limit_start, time_limit_end, time_limit_unit, ",
        "expiration_processing, product_issuer, `require`, application_information, extra_json, ",
        "remark",
        "from market_product",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_code", property="productCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_type", property="productType", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_url", property="productUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_logo_url", property="productLogoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="crawl_url", property="crawlUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="rate_start", property="rateStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate_end", property="rateEnd", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate_type", property="rateType", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount_start", property="amountStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="amount_end", property="amountEnd", jdbcType=JdbcType.DECIMAL),
        @Result(column="time_limit", property="timeLimit", jdbcType=JdbcType.VARCHAR),
        @Result(column="net_worth", property="netWorth", jdbcType=JdbcType.DECIMAL),
        @Result(column="fee_amount", property="feeAmount", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_code", property="parentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend", property="recommend", jdbcType=JdbcType.BIT),
        @Result(column="has_children", property="hasChildren", jdbcType=JdbcType.BIT),
        @Result(column="calculate_date", property="calculateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="org_id", property="orgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_name", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_logo_Url", property="orgLogoUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="priority", property="priority", jdbcType=JdbcType.TINYINT),
        @Result(column="lending_time", property="lendingTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="fluidity_sort", property="fluiditySort", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_remark", property="recommendRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="redemption_amount", property="redemptionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="sub_type", property="subType", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_limit_start", property="timeLimitStart", jdbcType=JdbcType.INTEGER),
        @Result(column="time_limit_end", property="timeLimitEnd", jdbcType=JdbcType.INTEGER),
        @Result(column="time_limit_unit", property="timeLimitUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="expiration_processing", property="expirationProcessing", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_issuer", property="productIssuer", jdbcType=JdbcType.VARCHAR),
        @Result(column="require", property="require", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="application_information", property="applicationInformation", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="extra_json", property="extraJson", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    MarketProduct selectByPrimaryKey(String id);

    @UpdateProvider(type=MarketProductSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MarketProduct record, @Param("example") MarketProductExample example);

    @UpdateProvider(type=MarketProductSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") MarketProduct record, @Param("example") MarketProductExample example);

    @UpdateProvider(type=MarketProductSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MarketProduct record, @Param("example") MarketProductExample example);

    @UpdateProvider(type=MarketProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MarketProduct record);

    @Update({
        "update market_product",
        "set channel = #{channel,jdbcType=VARCHAR},",
          "product_code = #{productCode,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=VARCHAR},",
          "product_name = #{productName,jdbcType=VARCHAR},",
          "product_type = #{productType,jdbcType=VARCHAR},",
          "product_url = #{productUrl,jdbcType=VARCHAR},",
          "product_logo_url = #{productLogoUrl,jdbcType=VARCHAR},",
          "crawl_url = #{crawlUrl,jdbcType=VARCHAR},",
          "rate_start = #{rateStart,jdbcType=DECIMAL},",
          "rate_end = #{rateEnd,jdbcType=DECIMAL},",
          "rate_type = #{rateType,jdbcType=VARCHAR},",
          "amount_start = #{amountStart,jdbcType=DECIMAL},",
          "amount_end = #{amountEnd,jdbcType=DECIMAL},",
          "time_limit = #{timeLimit,jdbcType=VARCHAR},",
          "net_worth = #{netWorth,jdbcType=DECIMAL},",
          "fee_amount = #{feeAmount,jdbcType=VARCHAR},",
          "parent_code = #{parentCode,jdbcType=VARCHAR},",
          "recommend = #{recommend,jdbcType=BIT},",
          "has_children = #{hasChildren,jdbcType=BIT},",
          "calculate_date = #{calculateDate,jdbcType=TIMESTAMP},",
          "org_id = #{orgId,jdbcType=VARCHAR},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "org_logo_Url = #{orgLogoUrl,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=TINYINT},",
          "lending_time = #{lendingTime,jdbcType=VARCHAR},",
          "is_deleted = #{isDeleted,jdbcType=BIT},",
          "create_at = #{createAt,jdbcType=TIMESTAMP},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "update_at = #{updateAt,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "fluidity_sort = #{fluiditySort,jdbcType=INTEGER},",
          "`type` = #{type,jdbcType=VARCHAR},",
          "recommend_remark = #{recommendRemark,jdbcType=VARCHAR},",
          "redemption_amount = #{redemptionAmount,jdbcType=DECIMAL},",
          "sub_type = #{subType,jdbcType=VARCHAR},",
          "time_limit_start = #{timeLimitStart,jdbcType=INTEGER},",
          "time_limit_end = #{timeLimitEnd,jdbcType=INTEGER},",
          "time_limit_unit = #{timeLimitUnit,jdbcType=VARCHAR},",
          "expiration_processing = #{expirationProcessing,jdbcType=VARCHAR},",
          "product_issuer = #{productIssuer,jdbcType=VARCHAR},",
          "`require` = #{require,jdbcType=LONGVARCHAR},",
          "application_information = #{applicationInformation,jdbcType=LONGVARCHAR},",
          "extra_json = #{extraJson,jdbcType=LONGVARCHAR},",
          "remark = #{remark,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(MarketProduct record);

    @Update({
        "update market_product",
        "set channel = #{channel,jdbcType=VARCHAR},",
          "product_code = #{productCode,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=VARCHAR},",
          "product_name = #{productName,jdbcType=VARCHAR},",
          "product_type = #{productType,jdbcType=VARCHAR},",
          "product_url = #{productUrl,jdbcType=VARCHAR},",
          "product_logo_url = #{productLogoUrl,jdbcType=VARCHAR},",
          "crawl_url = #{crawlUrl,jdbcType=VARCHAR},",
          "rate_start = #{rateStart,jdbcType=DECIMAL},",
          "rate_end = #{rateEnd,jdbcType=DECIMAL},",
          "rate_type = #{rateType,jdbcType=VARCHAR},",
          "amount_start = #{amountStart,jdbcType=DECIMAL},",
          "amount_end = #{amountEnd,jdbcType=DECIMAL},",
          "time_limit = #{timeLimit,jdbcType=VARCHAR},",
          "net_worth = #{netWorth,jdbcType=DECIMAL},",
          "fee_amount = #{feeAmount,jdbcType=VARCHAR},",
          "parent_code = #{parentCode,jdbcType=VARCHAR},",
          "recommend = #{recommend,jdbcType=BIT},",
          "has_children = #{hasChildren,jdbcType=BIT},",
          "calculate_date = #{calculateDate,jdbcType=TIMESTAMP},",
          "org_id = #{orgId,jdbcType=VARCHAR},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "org_logo_Url = #{orgLogoUrl,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=TINYINT},",
          "lending_time = #{lendingTime,jdbcType=VARCHAR},",
          "is_deleted = #{isDeleted,jdbcType=BIT},",
          "create_at = #{createAt,jdbcType=TIMESTAMP},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "update_at = #{updateAt,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "fluidity_sort = #{fluiditySort,jdbcType=INTEGER},",
          "`type` = #{type,jdbcType=VARCHAR},",
          "recommend_remark = #{recommendRemark,jdbcType=VARCHAR},",
          "redemption_amount = #{redemptionAmount,jdbcType=DECIMAL},",
          "sub_type = #{subType,jdbcType=VARCHAR},",
          "time_limit_start = #{timeLimitStart,jdbcType=INTEGER},",
          "time_limit_end = #{timeLimitEnd,jdbcType=INTEGER},",
          "time_limit_unit = #{timeLimitUnit,jdbcType=VARCHAR},",
          "expiration_processing = #{expirationProcessing,jdbcType=VARCHAR},",
          "product_issuer = #{productIssuer,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MarketProduct record);
}