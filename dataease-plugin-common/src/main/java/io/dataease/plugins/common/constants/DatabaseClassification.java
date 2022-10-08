package io.dataease.plugins.common.constants;

public enum DatabaseClassification {
    RDBMS("RDBMS"),
    NORDBMS("NORDBMS"),
    OTHER("OTHER");

    private String  type;
    DatabaseClassification(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
