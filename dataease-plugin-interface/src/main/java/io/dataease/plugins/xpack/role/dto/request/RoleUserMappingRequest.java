package io.dataease.plugins.xpack.role.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleUserMappingRequest implements Serializable {

    private Long roleId;

    private Long userId;
}
