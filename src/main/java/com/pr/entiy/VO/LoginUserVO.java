package com.pr.entiy.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("登陆模型")
public class LoginUserVO {
    @ApiModelProperty("用户账号")
    private String account; //用户
    @ApiModelProperty("密码")
    private String password; //密码
}
