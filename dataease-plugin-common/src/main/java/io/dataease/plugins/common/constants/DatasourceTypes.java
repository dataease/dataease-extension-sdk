package io.dataease.plugins.common.constants;

import java.util.Arrays;
import java.util.List;

public enum DatasourceTypes {
    //jdbc
    mysql("mysql", "MySQL", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    TiDB("TiDB", "TiDB", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    hive("hive", "Apache Hive", "`", "`", "'", "'", "", true, DatasourceCalculationMode.DIRECT, null),
    impala("impala", "Apache Impala", "`", "`", "'", "'", "AuthMech=0", true, DatasourceCalculationMode.DIRECT, null),
    mariadb("mariadb", "MariaDB", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    StarRocks("StarRocks", "StarRocks", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    ds_doris("ds_doris", "Doris", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    pg("pg", "PostgreSQL", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    sqlServer("sqlServer", "SQL Server", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    oracle("oracle", "Oracle", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC, Arrays.asList("Default", "GBK", "BIG5", "ISO-8859-1", "UTF-8", "UTF-16", "CP850", "EUC_JP", "EUC_KR")),
    mongo("mongo", "MongoDB", "`", "`", "\"", "\"", "rebuildschema=true&authSource=admin", true, DatasourceCalculationMode.DIRECT, null),
    ck("ck", "ClickHouse", "`", "`", "'", "'", "", true, DatasourceCalculationMode.DIRECT, null),
    db2("db2", "Db2", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC, null),
    redshift("redshift", "AWS Redshift", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT, null),

    es("es", "Elasticsearch", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT, null),
    api("api", "API", "\"", "\"", "\"", "\"", "rebuildschema=true&authSource=admin", true, DatasourceCalculationMode.SYNC, null),

    excel("excel", "Excel", "", "", "", "", "", false, DatasourceCalculationMode.SYNC, null),

    //engine
    engine_doris("engine_doris", "engine_doris", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", false, null, null),
    engine_mysql("engine_mysql", "engine_mysql", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", false, null, null);


    private String type;
    private String name;
    private String keywordPrefix;
    private String keywordSuffix;
    private String aliasPrefix;
    private String aliasSuffix;
    private String extraParams;
    private boolean isDatasource;
    private DatasourceCalculationMode calculationMode;
    private List<String> charset;

    DatasourceTypes(String type, String name, String keywordPrefix, String keywordSuffix, String aliasPrefix, String aliasSuffix, String extraParams, boolean isDatasource, DatasourceCalculationMode calculationMode, List<String> charset) {
        this.type = type;
        this.name = name;
        this.keywordPrefix = keywordPrefix;
        this.keywordSuffix = keywordSuffix;
        this.aliasPrefix = aliasPrefix;
        this.aliasSuffix = aliasSuffix;
        this.extraParams = extraParams;
        this.isDatasource = isDatasource;
        this.calculationMode = calculationMode;
        this.charset = charset;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getKeywordPrefix() {
        return keywordPrefix;
    }

    public String getKeywordSuffix() {
        return keywordSuffix;
    }

    public String getAliasPrefix() {
        return aliasPrefix;
    }

    public String getAliasSuffix() {
        return aliasSuffix;
    }

    public String getExtraParams() {
        return extraParams;
    }

    public List<String> getCharset() {
        return charset;
    }
    public DatasourceCalculationMode getCalculationMode() {
        return calculationMode;
    }

    public boolean isDatasource() {
        return isDatasource;
    }

}

