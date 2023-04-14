package com.pr.entiy.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserVO {
    private Integer id; //id
    private String account; //用户
    private String password; //密码
    private String description; //说明
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birthDate; //生日
    private int role; //权限
}
