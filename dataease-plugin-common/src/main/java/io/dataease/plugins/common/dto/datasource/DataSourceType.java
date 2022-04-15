package io.dataease.plugins.common.dto.datasource;

import lombok.Data;

@Data
public class DataSourceType {
    private String type;
    private String name;
    private String driver;
    private boolean isPlugin = true;
    private String keywordPrefix;
    private String keywordSuffix;
    private String aliasPrefix;
    private String aliasSuffix;
    private String extraParams;
}
