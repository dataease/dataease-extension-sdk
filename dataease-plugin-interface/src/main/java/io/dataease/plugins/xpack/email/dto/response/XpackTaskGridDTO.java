package io.dataease.plugins.xpack.email.dto.response;

import java.io.Serializable;

import io.dataease.plugins.common.annotation.PluginResultMap;
import lombok.Data;

@PluginResultMap
@Data
public class XpackTaskGridDTO implements Serializable{

    private Long taskId;

    private String taskName;

    private Long lastSendTime;

    private Integer lastSendStatus;

    private Long creator;

    private Long createTime;
    
}
