package io.dataease.plugins.common.constants;

public enum DatasetType {

    DB("db"),
    SQL("sql"),
    CUSTOM("custom"),
    EXCEL("excel"),
    API("api"),
    UNION("union");

    private String  type;

    DatasetType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
