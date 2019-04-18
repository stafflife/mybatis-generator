package com.hupo.ft.onepunch.twond.market.repository.mybatis;

import com.hupo.ft.onepunch.twond.market.model.entity.AppProductMapping;
import com.hupo.ft.onepunch.twond.market.model.entity.AppProductMappingExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface AppProductMappingMapper {
    @SelectProvider(type = AppProductMappingSqlProvider.class, method = "countByExample")
    long countByExample(AppProductMappingExample example);

    @DeleteProvider(type = AppProductMappingSqlProvider.class, method = "deleteByExample")
    int deleteByExample(AppProductMappingExample example);

    @Delete({
            "delete from app_product_mapping",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into app_product_mapping (id, channel, ",
            "product_code, app_id, ",
            "channel_mapping_url, channel_app_id, ",
            "show_type, recommend, ",
            "default_sort, is_deleted, ",
            "create_at, create_by, ",
            "update_at, update_by, ",
            "recommend_remark, client_num, ",
            "extra_json)",
            "values (#{id,jdbcType=VARCHAR}, #{channel,jdbcType=VARCHAR}, ",
            "#{productCode,jdbcType=VARCHAR}, #{appId,jdbcType=VARCHAR}, ",
            "#{channelMappingUrl,jdbcType=VARCHAR}, #{channelAppId,jdbcType=VARCHAR}, ",
            "#{showType,jdbcType=VARCHAR}, #{recommend,jdbcType=BIT}, ",
            "#{defaultSort,jdbcType=INTEGER}, #{isDeleted,jdbcType=BIT}, ",
            "#{createAt,jdbcType=TIMESTAMP}, #{createBy,jdbcType=VARCHAR}, ",
            "#{updateAt,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{recommendRemark,jdbcType=VARCHAR}, #{clientNum,jdbcType=VARCHAR}, ",
            "#{extraJson,jdbcType=LONGVARCHAR})"
    })
    int insert(AppProductMapping record);

    @InsertProvider(type = AppProductMappingSqlProvider.class, method = "insertSelective")
    int insertSelective(AppProductMapping record);

    @SelectProvider(type = AppProductMappingSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "channel", property = "channel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_code", property = "productCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "app_id", property = "appId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel_mapping_url", property = "channelMappingUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel_app_id", property = "channelAppId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "show_type", property = "showType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend", property = "recommend", jdbcType = JdbcType.BIT),
            @Result(column = "default_sort", property = "defaultSort", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_deleted", property = "isDeleted", jdbcType = JdbcType.BIT),
            @Result(column = "create_at", property = "createAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_at", property = "updateAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend_remark", property = "recommendRemark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "client_num", property = "clientNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "extra_json", property = "extraJson", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<AppProductMapping> selectByExampleWithBLOBs(AppProductMappingExample example);

    @SelectProvider(type = AppProductMappingSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "channel", property = "channel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_code", property = "productCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "app_id", property = "appId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel_mapping_url", property = "channelMappingUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel_app_id", property = "channelAppId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "show_type", property = "showType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend", property = "recommend", jdbcType = JdbcType.BIT),
            @Result(column = "default_sort", property = "defaultSort", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_deleted", property = "isDeleted", jdbcType = JdbcType.BIT),
            @Result(column = "create_at", property = "createAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_at", property = "updateAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend_remark", property = "recommendRemark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "client_num", property = "clientNum", jdbcType = JdbcType.VARCHAR)
    })
    List<AppProductMapping> selectByExample(AppProductMappingExample example);

    @Select({
            "select",
            "id, channel, product_code, app_id, channel_mapping_url, channel_app_id, show_type, ",
            "recommend, default_sort, is_deleted, create_at, create_by, update_at, update_by, ",
            "recommend_remark, client_num, extra_json",
            "from app_product_mapping",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "channel", property = "channel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_code", property = "productCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "app_id", property = "appId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel_mapping_url", property = "channelMappingUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel_app_id", property = "channelAppId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "show_type", property = "showType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend", property = "recommend", jdbcType = JdbcType.BIT),
            @Result(column = "default_sort", property = "defaultSort", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_deleted", property = "isDeleted", jdbcType = JdbcType.BIT),
            @Result(column = "create_at", property = "createAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_at", property = "updateAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend_remark", property = "recommendRemark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "client_num", property = "clientNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "extra_json", property = "extraJson", jdbcType = JdbcType.LONGVARCHAR)
    })
    AppProductMapping selectByPrimaryKey(String id);

    @UpdateProvider(type = AppProductMappingSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AppProductMapping record, @Param("example") AppProductMappingExample example);

    @UpdateProvider(type = AppProductMappingSqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") AppProductMapping record, @Param("example") AppProductMappingExample example);

    @UpdateProvider(type = AppProductMappingSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") AppProductMapping record, @Param("example") AppProductMappingExample example);

    @UpdateProvider(type = AppProductMappingSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AppProductMapping record);

    @Update({
            "update app_product_mapping",
            "set channel = #{channel,jdbcType=VARCHAR},",
            "product_code = #{productCode,jdbcType=VARCHAR},",
            "app_id = #{appId,jdbcType=VARCHAR},",
            "channel_mapping_url = #{channelMappingUrl,jdbcType=VARCHAR},",
            "channel_app_id = #{channelAppId,jdbcType=VARCHAR},",
            "show_type = #{showType,jdbcType=VARCHAR},",
            "recommend = #{recommend,jdbcType=BIT},",
            "default_sort = #{defaultSort,jdbcType=INTEGER},",
            "is_deleted = #{isDeleted,jdbcType=BIT},",
            "create_at = #{createAt,jdbcType=TIMESTAMP},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "update_at = #{updateAt,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "recommend_remark = #{recommendRemark,jdbcType=VARCHAR},",
            "client_num = #{clientNum,jdbcType=VARCHAR},",
            "extra_json = #{extraJson,jdbcType=LONGVARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(AppProductMapping record);

    @Update({
            "update app_product_mapping",
            "set channel = #{channel,jdbcType=VARCHAR},",
            "product_code = #{productCode,jdbcType=VARCHAR},",
            "app_id = #{appId,jdbcType=VARCHAR},",
            "channel_mapping_url = #{channelMappingUrl,jdbcType=VARCHAR},",
            "channel_app_id = #{channelAppId,jdbcType=VARCHAR},",
            "show_type = #{showType,jdbcType=VARCHAR},",
            "recommend = #{recommend,jdbcType=BIT},",
            "default_sort = #{defaultSort,jdbcType=INTEGER},",
            "is_deleted = #{isDeleted,jdbcType=BIT},",
            "create_at = #{createAt,jdbcType=TIMESTAMP},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "update_at = #{updateAt,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "recommend_remark = #{recommendRemark,jdbcType=VARCHAR},",
            "client_num = #{clientNum,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AppProductMapping record);
}