package com.pr.entiy.VO;

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
public class LoginUserVO {
    private String account; //用户
    private String password; //密码
}