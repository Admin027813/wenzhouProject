package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @program: springboot
 * @description:用户
 * @author: 何兰兰
 * @create: 2023-04-11 11:58
 **/
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id; //id
    private String account; //用户
    private String password; //密码
    private String description; //说明
    private Timestamp birthDate; //生日
    private int role; //权限
}
