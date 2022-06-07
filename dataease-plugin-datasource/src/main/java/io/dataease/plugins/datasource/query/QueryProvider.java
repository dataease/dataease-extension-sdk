package io.dataease.plugins.datasource.query;

import com.google.gson.Gson;
import io.dataease.plugins.common.base.domain.ChartViewWithBLOBs;
import io.dataease.plugins.common.base.domain.DatasetTableField;
import io.dataease.plugins.common.base.domain.Datasource;
import io.dataease.plugins.common.constants.PgConstants;
import io.dataease.plugins.common.dto.chart.ChartFieldCustomFilterDTO;
import io.dataease.plugins.common.dto.chart.ChartViewFieldDTO;
import io.dataease.plugins.common.dto.datasource.DeSortField;
import io.dataease.plugins.common.dto.sqlObj.SQLObj;
import io.dataease.plugins.common.request.chart.ChartExtFilterRequest;
import io.dataease.plugins.datasource.entity.JdbcConfiguration;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Author gin
 * @Date 2021/5/17 2:42 下午
 */
public abstract class QueryProvider {

    public abstract Integer transFieldType(String field);

    public abstract String createSQLPreview(String sql, String orderBy);

    public abstract String createQuerySQL(String table, List<DatasetTableField> fields, boolean isGroup, Datasource ds, List<ChartFieldCustomFilterDTO> fieldCustomFilter);

    public abstract String createQuerySQLAsTmp(String sql, List<DatasetTableField> fields, boolean isGroup, List<ChartFieldCustomFilterDTO> fieldCustomFilter);

    public abstract String createQuerySQL(String table, List<DatasetTableField> fields, boolean isGroup, Datasource ds, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<DeSortField> sortFields);

    public abstract String createQuerySQLAsTmp(String sql, List<DatasetTableField> fields, boolean isGroup, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<DeSortField> sortFields);

    public abstract String createQueryTableWithPage(String table, List<DatasetTableField> fields, Integer page, Integer pageSize, Integer realSize, boolean isGroup, Datasource ds, List<ChartFieldCustomFilterDTO> fieldCustomFilter);

    public abstract String createQuerySQLWithPage(String sql, List<DatasetTableField> fields, Integer page, Integer pageSize, Integer realSize, boolean isGroup, List<ChartFieldCustomFilterDTO> fieldCustomFilter);

    public abstract String createQueryTableWithLimit(String table, List<DatasetTableField> fields, Integer limit, boolean isGroup, Datasource ds, List<ChartFieldCustomFilterDTO> fieldCustomFilter);

    public abstract String createQuerySqlWithLimit(String sql, List<DatasetTableField> fields, Integer limit, boolean isGroup, List<ChartFieldCustomFilterDTO> fieldCustomFilter);

    public abstract String getSQL(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, Datasource ds, ChartViewWithBLOBs view);

    public abstract String getSQLAsTmp(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, ChartViewWithBLOBs view);

    public abstract String getSQLTableInfo(String table, List<ChartViewFieldDTO> xAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, Datasource ds, ChartViewWithBLOBs view);

    public abstract String getSQLAsTmpTableInfo(String sql, List<ChartViewFieldDTO> xAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, Datasource ds, ChartViewWithBLOBs view);

    public abstract String getSQLStack(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, List<ChartViewFieldDTO> extStack, Datasource ds, ChartViewWithBLOBs view);

    public abstract String getSQLAsTmpStack(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, List<ChartViewFieldDTO> extStack, ChartViewWithBLOBs view);

    public abstract String getSQLScatter(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, List<ChartViewFieldDTO> extBubble, Datasource ds, ChartViewWithBLOBs view);

    public abstract String getSQLAsTmpScatter(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, List<ChartViewFieldDTO> extBubble, ChartViewWithBLOBs view);

    public abstract String searchTable(String table);

    public abstract String getSQLSummary(String table, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, ChartViewWithBLOBs view, Datasource ds);

    public Integer transFieldSize(String type) {
        return 50;
    }

    public abstract String getSQLSummaryAsTmp(String sql, List<ChartViewFieldDTO> yAxis, List<ChartFieldCustomFilterDTO> fieldCustomFilter, List<ChartExtFilterRequest> extFilterRequestList, ChartViewWithBLOBs view);

    public abstract String wrapSql(String sql);

    public abstract String createRawQuerySQL(String table, List<DatasetTableField> fields, Datasource ds);

    public abstract String createRawQuerySQLAsTmp(String sql, List<DatasetTableField> fields);

    public void setSchema(SQLObj tableObj, Datasource ds) {
        if (ds != null && !tableObj.getTableName().startsWith("(") && !tableObj.getTableName().endsWith(")")) {
            JdbcConfiguration configuration = new Gson().fromJson(ds.getConfiguration(), JdbcConfiguration.class);
            String schema;
            if (ObjectUtils.isNotEmpty(configuration) && StringUtils.isNotBlank((schema = configuration.getSchema()))) {
                schema = String.format(PgConstants.KEYWORD_TABLE, schema);
                tableObj.setTableName(schema + "." + tableObj.getTableName());
            }
        }
    }

    public String convertTableToSql(String tableName, Datasource ds) {
        return "select * from  TABLE_NAME".replace("TABLE_NAME", tableName);
    }

    public String getLogic(String logic) {
        if (logic != null) {
            switch (logic) {
                case "and":
                    return "AND";
                case "or":
                    return "OR";
            }
        }
        return "AND";
    }
}
