package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id; //id
    private String account; //用户
    private String password; //密码
    private String phone; //手机号
    private String email;//邮箱
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birthDate; //生日
    private int role; //权限
    private LocalDateTime createTime; //创建时间
}
