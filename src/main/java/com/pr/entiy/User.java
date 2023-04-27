package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id; //id
    private String userName;
    private String account; //用户
    private String password; //密码
    private String phone; //手机号
    private String email;//邮箱
    @TableField(fill = FieldFill.INSERT)
    private Date birthDate; //生日
    private int role; //权限
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime; //创建时间
}
