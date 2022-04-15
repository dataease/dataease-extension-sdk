package io.dataease.plugins.common.constants;

public enum DatasourceTypes {
    //jdbc
    mysql("mysql", "MySQL", "com.mysql.jdbc.Driver", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true"),
    TiDB("TiDB", "TiDB", "com.mysql.jdbc.Driver", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true"),
    hive("hive", "Apache Hive", "org.apache.hive.jdbc.HiveDriver", "`", "`", "'", "'", ""),
    impala("impala", "Apache Impala", "org.apache.hive.jdbc.HiveDriver", "`", "`", "'", "'", "AuthMech=0"),
    mariadb("mariadb", "MariaDB", "com.mysql.jdbc.Driver", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true"),
    StarRocks("StarRocks", "StarRocks", "com.mysql.jdbc.Driver", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true"),
    ds_doris("ds_doris", "Doris", "com.mysql.jdbc.Driver", "`", "`", "'", "'", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true"),
    pg("pg", "PostgreSQL", "org.postgresql.Driver", "\"", "\"", "\"", "\"", ""),
    sqlServer("sqlServer", "SQL Server", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "\"", "\"", "\"", "\"", ""),
    oracle("oracle", "Oracle", "oracle.jdbc.driver.OracleDriver", "\"", "\"", "\"", "\"", ""),
    mongo("mongo", "MongoDB", "com.mongodb.jdbc.MongoDriver", "`", "`", "\"", "\"", "rebuildschema=true&authSource=admin"),
    ck("ch", "ClickHouse", "ru.yandex.clickhouse.ClickHouseDriver", "`", "`", "'", "'", ""),
    db2("db2", "Db2", "com.ibm.db2.jcc.DB2Driver", "\"", "\"", "\"", "\"", ""),
    redshift("redshift", "AWS Redshift", "org.postgresql.Driver", "\"", "\"", "\"", "\"", ""),

    es("es", "Elasticsearch", "", "\"", "\"", "\"", "\"", ""),
    api("api", "API", "", "\"", "\"", "\"", "\"", "rebuildschema=true&authSource=admin"),

    excel("excel", "Excel", "", "", "", "", "", ""),

    //engine
    engine_doris("engine_doris", "engine_doris", "com.mysql.jdbc.Driver", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true"),
    engine_mysql("engine_mysql", "engine_mysql", "com.mysql.jdbc.Driver", "`", "`", "", "", "characterEncoding=UTF-8&connectTimeout=5000&useSSL=false&allowPublicKeyRetrieval=true")
            ;


    private String type;
    private String name;
    private String driver;
    private String keywordPrefix;
    private String keywordSuffix;
    private String aliasPrefix;
    private String aliasSuffix;
    private String extraParams;

    DatasourceTypes(String type, String name, String driver, String keywordPrefix, String keywordSuffix, String aliasPrefix, String aliasSuffix, String extraParams) {
        this.type = type;
        this.name = name;
        this.driver = driver;
        this.keywordPrefix = keywordPrefix;
        this.keywordSuffix = keywordSuffix;
        this.aliasPrefix = aliasPrefix;
        this.aliasSuffix = aliasSuffix;
        this.extraParams = extraParams;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDriver() {
        return driver;
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
}

