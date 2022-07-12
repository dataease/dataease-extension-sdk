package io.dataease.plugins.xpack.role.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleUserRequest implements Serializable {

    private Long roleId;
    private String keyWord;
}
