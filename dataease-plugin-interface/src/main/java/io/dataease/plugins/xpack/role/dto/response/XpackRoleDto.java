package io.dataease.plugins.xpack.role.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class XpackRoleDto implements Serializable {

    private Long roleId;

    private String name;

    private String description;

    private String createBy;

    private String updateBy;

    private Long createTime;

    private Long updateTime;

    private List<String> users;

    private static final long serialVersionUID = 1L;
}
