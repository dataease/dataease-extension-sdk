package io.dataease.plugins.common.request.datasource;


import io.dataease.plugins.common.base.domain.Datasource;
import lombok.Getter;
import lombok.Setter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Getter
@Setter
public class DatasourceRequest {
    private final String REG_WITH_SQL_FRAGMENT = "((?i)WITH[\\s\\S]+(?i)AS?\\s*\\([\\s\\S]+\\))\\s*(?i)SELECT";
    private  Pattern WITH_SQL_FRAGMENT = Pattern.compile(REG_WITH_SQL_FRAGMENT);

    protected String query;

    public String getQuery() {
        return rebuildSqlWithFragment(this.query);
    }

    public void setQuery(String query) {
        this.query = query;
    }

    protected String table;
    protected Datasource datasource;
    private Integer pageSize;
    private Integer page;
    private Integer realSize;
    private Integer fetchSize = 10000;
    private boolean pageable = false;
    private boolean previewData = false;

    private String rebuildSqlWithFragment(String sql) {
        if (!sql.toLowerCase().startsWith("with")) {
            Matcher matcher = WITH_SQL_FRAGMENT.matcher(sql);
            if (matcher.find()) {
                String withFragment = matcher.group();
                if (!com.alibaba.druid.util.StringUtils.isEmpty(withFragment)) {
                    if (withFragment.length() > 6) {
                        int lastSelectIndex = withFragment.length() - 6;
                        sql = sql.replace(withFragment, withFragment.substring(lastSelectIndex));
                        withFragment = withFragment.substring(0, lastSelectIndex);
                    }
                    sql = withFragment + " " + sql;
                    sql = sql.replaceAll(" " + "{2,}", " ");
                }
            }
        }
        return sql;
    }


}
