package com.pr.entiy.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@ApiModel("用户模型")
public class UserVO {
    @ApiModelProperty("id")
    @JsonProperty(value = "id")
    private Integer id; //id
    @ApiModelProperty("用户")
    @JsonProperty(value = "account")
    private String account; //用户
    @ApiModelProperty("密码")
    @JsonProperty(value = "password")
    private String password; //密码
    @ApiModelProperty("说明")
    @JsonProperty(value = "description")
    private String description; //说明
    @ApiModelProperty("生日")
    @JsonProperty(value = "birthdate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birthDate; //生日
    @ApiModelProperty("权限")
    @JsonProperty(value = "role")
    private int role; //权限
}
