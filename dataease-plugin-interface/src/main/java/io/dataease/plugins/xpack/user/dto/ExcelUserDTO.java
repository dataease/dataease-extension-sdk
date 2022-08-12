package io.dataease.plugins.xpack.user.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExcelUserDTO implements Serializable{

    @ApiModelProperty("账号")
    private String username;
    @ApiModelProperty("姓名")
    private String nickName;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("组织名称")
    private String deptName;
    @ApiModelProperty("角色名称集合")
    private String roleNames;
    @ApiModelProperty("状态")
    private String enable;


    
}
