package io.dataease.plugins.common.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class GlobalTaskEntity implements Serializable{
    
    private Long taskId;

    private String taskName;

    private String taskType;

    private Long startTime;

    private Long endTime;

    private Integer rateType;

    private String rateVal;

    private String creator;

    private Long createTime;
}
