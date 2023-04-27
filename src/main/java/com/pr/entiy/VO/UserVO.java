package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@ApiModel("用户模型")
public class UserVO {
    @ApiModelProperty("id")
    private Integer id; //id
    @ApiModelProperty("用户名")
    private String userName;//用户
    @ApiModelProperty("账号")
    private String account; //用户
    @ApiModelProperty("密码")
    private String password; //密码
    @ApiModelProperty("手机号")
    private String phone; //手机号
    private String email;//邮箱
    @ApiModelProperty("生日")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate; //生日
    @ApiModelProperty("权限")
    private int role; //权限
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createTime;
}
