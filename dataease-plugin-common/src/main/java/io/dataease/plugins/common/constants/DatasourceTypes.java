package io.dataease.plugins.common.constants;

public enum DatasourceTypes {
    //jdbc
    mysql("mysql", "MySQL", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    TiDB("TiDB", "TiDB", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    hive("hive", "Apache Hive", "`", "`", "'", "'", "", true, DatasourceCalculationMode.DIRECT),
    impala("impala", "Apache Impala", "`", "`", "'", "'", "AuthMech=0", true, DatasourceCalculationMode.DIRECT),
    mariadb("mariadb", "MariaDB", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    StarRocks("StarRocks", "StarRocks", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    ds_doris("ds_doris", "Doris", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    pg("pg", "PostgreSQL", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    sqlServer("sqlServer", "SQL Server", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    oracle("oracle", "Oracle", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    mongo("mongo", "MongoDB", "`", "`", "\"", "\"", "rebuildschema=true&authSource=admin", true, DatasourceCalculationMode.DIRECT),
    ck("ck", "ClickHouse", "`", "`", "'", "'", "", true, DatasourceCalculationMode.DIRECT),
    db2("db2", "Db2", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT_AND_SYNC),
    redshift("redshift", "AWS Redshift", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT),

    es("es", "Elasticsearch", "\"", "\"", "\"", "\"", "", true, DatasourceCalculationMode.DIRECT),
    api("api", "API", "\"", "\"", "\"", "\"", "rebuildschema=true&authSource=admin", true, DatasourceCalculationMode.SYNC),

    excel("excel", "Excel", "", "", "", "", "", false, DatasourceCalculationMode.SYNC),

    //engine
    engine_doris("engine_doris", "engine_doris", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", false, null),
    engine_mysql("engine_mysql", "engine_mysql", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true", false, null);


    private String type;
    private String name;
    private String keywordPrefix;
    private String keywordSuffix;
    private String aliasPrefix;
    private String aliasSuffix;
    private String extraParams;
    private boolean isDatasource;
    private DatasourceCalculationMode calculationMode;


    DatasourceTypes(String type, String name, String keywordPrefix, String keywordSuffix, String aliasPrefix, String aliasSuffix, String extraParams, boolean isDatasource, DatasourceCalculationMode calculationMode) {
        this.type = type;
        this.name = name;
        this.keywordPrefix = keywordPrefix;
        this.keywordSuffix = keywordSuffix;
        this.aliasPrefix = aliasPrefix;
        this.aliasSuffix = aliasSuffix;
        this.extraParams = extraParams;
        this.isDatasource = isDatasource;
        this.calculationMode = calculationMode;
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
    public DatasourceCalculationMode getCalculationMode() {
        return calculationMode;
    }

    public boolean isDatasource() {
        return isDatasource;
    }

}

