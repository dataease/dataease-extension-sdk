package io.dataease.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SysUserAssist {

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("需要改密提示")
    private Boolean needFirstNoti;
}
