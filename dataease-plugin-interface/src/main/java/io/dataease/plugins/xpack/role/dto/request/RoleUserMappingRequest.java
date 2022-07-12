package io.dataease.plugins.xpack.role.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class RoleUserMappingRequest implements Serializable {

    @ApiModelProperty("角色ID")
    private Long roleId;
    @ApiModelProperty("用户ID")
    private Long userId;
}
