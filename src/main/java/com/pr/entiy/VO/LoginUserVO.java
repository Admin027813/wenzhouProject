package com.pr.entiy.VO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class LoginUserVO {
    private String account; //用户
    private String password; //密码
}
