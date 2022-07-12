package io.dataease.plugins.xpack.role.dto.request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoleUserMappingDelRequest implements Serializable {

    private Long roleId;

    List<Long> userIds;
}
