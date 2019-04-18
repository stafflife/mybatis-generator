package com.hupo.ft.onepunch.twond.market.repository.mybatis;

import com.hupo.ft.onepunch.twond.market.model.entity.AppProductMapping;
import com.hupo.ft.onepunch.twond.market.model.entity.AppProductMappingExample;
import com.hupo.ft.onepunch.twond.market.model.entity.AppProductMappingExample.Criteria;
import com.hupo.ft.onepunch.twond.market.model.entity.AppProductMappingExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class AppProductMappingSqlProvider {

    public String countByExample(AppProductMappingExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("app_product_mapping");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AppProductMappingExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("app_product_mapping");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AppProductMapping record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("app_product_mapping");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=VARCHAR}");
        }

        if (record.getProductCode() != null) {
            sql.VALUES("product_code", "#{productCode,jdbcType=VARCHAR}");
        }

        if (record.getAppId() != null) {
            sql.VALUES("app_id", "#{appId,jdbcType=VARCHAR}");
        }

        if (record.getChannelMappingUrl() != null) {
            sql.VALUES("channel_mapping_url", "#{channelMappingUrl,jdbcType=VARCHAR}");
        }

        if (record.getChannelAppId() != null) {
            sql.VALUES("channel_app_id", "#{channelAppId,jdbcType=VARCHAR}");
        }

        if (record.getShowType() != null) {
            sql.VALUES("show_type", "#{showType,jdbcType=VARCHAR}");
        }

        if (record.getRecommend() != null) {
            sql.VALUES("recommend", "#{recommend,jdbcType=BIT}");
        }

        if (record.getDefaultSort() != null) {
            sql.VALUES("default_sort", "#{defaultSort,jdbcType=INTEGER}");
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

        if (record.getRecommendRemark() != null) {
            sql.VALUES("recommend_remark", "#{recommendRemark,jdbcType=VARCHAR}");
        }

        if (record.getClientNum() != null) {
            sql.VALUES("client_num", "#{clientNum,jdbcType=VARCHAR}");
        }

        if (record.getExtraJson() != null) {
            sql.VALUES("extra_json", "#{extraJson,jdbcType=LONGVARCHAR}");
        }

        return sql.toString();
    }

    public String selectByExampleWithBLOBs(AppProductMappingExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel");
        sql.SELECT("product_code");
        sql.SELECT("app_id");
        sql.SELECT("channel_mapping_url");
        sql.SELECT("channel_app_id");
        sql.SELECT("show_type");
        sql.SELECT("recommend");
        sql.SELECT("default_sort");
        sql.SELECT("is_deleted");
        sql.SELECT("create_at");
        sql.SELECT("create_by");
        sql.SELECT("update_at");
        sql.SELECT("update_by");
        sql.SELECT("recommend_remark");
        sql.SELECT("client_num");
        sql.SELECT("extra_json");
        sql.FROM("app_product_mapping");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    public String selectByExample(AppProductMappingExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel");
        sql.SELECT("product_code");
        sql.SELECT("app_id");
        sql.SELECT("channel_mapping_url");
        sql.SELECT("channel_app_id");
        sql.SELECT("show_type");
        sql.SELECT("recommend");
        sql.SELECT("default_sort");
        sql.SELECT("is_deleted");
        sql.SELECT("create_at");
        sql.SELECT("create_by");
        sql.SELECT("update_at");
        sql.SELECT("update_by");
        sql.SELECT("recommend_remark");
        sql.SELECT("client_num");
        sql.FROM("app_product_mapping");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AppProductMapping record = (AppProductMapping) parameter.get("record");
        AppProductMappingExample example = (AppProductMappingExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("app_product_mapping");

        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }

        if (record.getChannel() != null) {
            sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        }

        if (record.getProductCode() != null) {
            sql.SET("product_code = #{record.productCode,jdbcType=VARCHAR}");
        }

        if (record.getAppId() != null) {
            sql.SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        }

        if (record.getChannelMappingUrl() != null) {
            sql.SET("channel_mapping_url = #{record.channelMappingUrl,jdbcType=VARCHAR}");
        }

        if (record.getChannelAppId() != null) {
            sql.SET("channel_app_id = #{record.channelAppId,jdbcType=VARCHAR}");
        }

        if (record.getShowType() != null) {
            sql.SET("show_type = #{record.showType,jdbcType=VARCHAR}");
        }

        if (record.getRecommend() != null) {
            sql.SET("recommend = #{record.recommend,jdbcType=BIT}");
        }

        if (record.getDefaultSort() != null) {
            sql.SET("default_sort = #{record.defaultSort,jdbcType=INTEGER}");
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

        if (record.getRecommendRemark() != null) {
            sql.SET("recommend_remark = #{record.recommendRemark,jdbcType=VARCHAR}");
        }

        if (record.getClientNum() != null) {
            sql.SET("client_num = #{record.clientNum,jdbcType=VARCHAR}");
        }

        if (record.getExtraJson() != null) {
            sql.SET("extra_json = #{record.extraJson,jdbcType=LONGVARCHAR}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("app_product_mapping");

        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        sql.SET("product_code = #{record.productCode,jdbcType=VARCHAR}");
        sql.SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        sql.SET("channel_mapping_url = #{record.channelMappingUrl,jdbcType=VARCHAR}");
        sql.SET("channel_app_id = #{record.channelAppId,jdbcType=VARCHAR}");
        sql.SET("show_type = #{record.showType,jdbcType=VARCHAR}");
        sql.SET("recommend = #{record.recommend,jdbcType=BIT}");
        sql.SET("default_sort = #{record.defaultSort,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        sql.SET("update_by = #{record.updateBy,jdbcType=VARCHAR}");
        sql.SET("recommend_remark = #{record.recommendRemark,jdbcType=VARCHAR}");
        sql.SET("client_num = #{record.clientNum,jdbcType=VARCHAR}");
        sql.SET("extra_json = #{record.extraJson,jdbcType=LONGVARCHAR}");

        AppProductMappingExample example = (AppProductMappingExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("app_product_mapping");

        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        sql.SET("product_code = #{record.productCode,jdbcType=VARCHAR}");
        sql.SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        sql.SET("channel_mapping_url = #{record.channelMappingUrl,jdbcType=VARCHAR}");
        sql.SET("channel_app_id = #{record.channelAppId,jdbcType=VARCHAR}");
        sql.SET("show_type = #{record.showType,jdbcType=VARCHAR}");
        sql.SET("recommend = #{record.recommend,jdbcType=BIT}");
        sql.SET("default_sort = #{record.defaultSort,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("create_by = #{record.createBy,jdbcType=VARCHAR}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        sql.SET("update_by = #{record.updateBy,jdbcType=VARCHAR}");
        sql.SET("recommend_remark = #{record.recommendRemark,jdbcType=VARCHAR}");
        sql.SET("client_num = #{record.clientNum,jdbcType=VARCHAR}");

        AppProductMappingExample example = (AppProductMappingExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AppProductMapping record) {
        SQL sql = new SQL();
        sql.UPDATE("app_product_mapping");

        if (record.getChannel() != null) {
            sql.SET("channel = #{channel,jdbcType=VARCHAR}");
        }

        if (record.getProductCode() != null) {
            sql.SET("product_code = #{productCode,jdbcType=VARCHAR}");
        }

        if (record.getAppId() != null) {
            sql.SET("app_id = #{appId,jdbcType=VARCHAR}");
        }

        if (record.getChannelMappingUrl() != null) {
            sql.SET("channel_mapping_url = #{channelMappingUrl,jdbcType=VARCHAR}");
        }

        if (record.getChannelAppId() != null) {
            sql.SET("channel_app_id = #{channelAppId,jdbcType=VARCHAR}");
        }

        if (record.getShowType() != null) {
            sql.SET("show_type = #{showType,jdbcType=VARCHAR}");
        }

        if (record.getRecommend() != null) {
            sql.SET("recommend = #{recommend,jdbcType=BIT}");
        }

        if (record.getDefaultSort() != null) {
            sql.SET("default_sort = #{defaultSort,jdbcType=INTEGER}");
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

        if (record.getRecommendRemark() != null) {
            sql.SET("recommend_remark = #{recommendRemark,jdbcType=VARCHAR}");
        }

        if (record.getClientNum() != null) {
            sql.SET("client_num = #{clientNum,jdbcType=VARCHAR}");
        }

        if (record.getExtraJson() != null) {
            sql.SET("extra_json = #{extraJson,jdbcType=LONGVARCHAR}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }

    protected void applyWhere(SQL sql, AppProductMappingExample example, boolean includeExamplePhrase) {
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