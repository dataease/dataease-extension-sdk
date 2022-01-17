package io.dataease.plugins.xpack.auth.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class DataSetColumnPermissionsDTO extends DatasetColumnPermissions{
    private String datasetName;
    private String authTargetName;
    private List<Long> authTargetIds;
}
