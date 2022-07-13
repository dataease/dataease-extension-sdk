package io.dataease.plugins.xpack.dept.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class XpackDeptUnBindRequest implements Serializable {

    @ApiModelProperty("组织ID")
    private Long deptId;
    @ApiModelProperty("用户ID集合")
    List<Long> userIds;
}
