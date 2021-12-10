package io.dataease.plugins.xpack.auth.service;

import io.dataease.plugins.xpack.auth.dto.request.DataSetRowPermissionsDTO;
import io.dataease.plugins.xpack.auth.dto.request.DatasetRowPermissions;
import io.dataease.plugins.xpack.auth.dto.response.XpackSysAuthDetailDTO;

import java.util.List;

public abstract class RowPermissionService  {
    public abstract List<DataSetRowPermissionsDTO> searchRowPermissions(XpackSysAuthDetailDTO request);
    public abstract void save(DatasetRowPermissions datasetRowPermissions);
    public abstract void delete(String id);
    public abstract List<DatasetRowPermissions> listDatasetRowPermissions(String datasetId, List<Long>authTargetIds, String authTargetType);
}
