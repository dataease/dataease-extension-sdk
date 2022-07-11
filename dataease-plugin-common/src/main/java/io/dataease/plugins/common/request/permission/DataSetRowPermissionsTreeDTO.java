package io.dataease.plugins.common.request.permission;

import io.dataease.plugins.common.base.domain.DatasetRowPermissionsTreeWithBLOBs;
import io.dataease.plugins.common.base.domain.SysDept;
import io.dataease.plugins.common.base.domain.SysRole;
import io.dataease.plugins.common.base.domain.SysUser;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DataSetRowPermissionsTreeDTO extends DatasetRowPermissionsTreeWithBLOBs {
    private String datasetName;
    private String authTargetName;
    private DatasetRowPermissionsTreeObj tree;
    private List<SysUser> whiteListUsers;
    private List<SysRole> whiteListRoles;
    private List<SysDept> whiteListDepts;
    private List<Long> authTargetIds;
}
