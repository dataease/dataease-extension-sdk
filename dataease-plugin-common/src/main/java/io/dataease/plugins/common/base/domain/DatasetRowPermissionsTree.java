package io.dataease.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class DatasetRowPermissionsTree implements Serializable {
    private String id;

    private Boolean enable;

    private String authTargetType;

    private Long authTargetId;

    private String datasetId;

    private Long updateTime;

    private static final long serialVersionUID = 1L;
}
