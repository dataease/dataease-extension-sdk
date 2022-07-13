package io.dataease.plugins.xpack.dept.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class XpackDeptBindRequest implements Serializable {

    private Long deptId;

    private Long userId;
}
