package com.pr.controller;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-11 16:30
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    public R<String> GetUserData(){
        SaSession saSession = StpUtil.getSession();
    }
}
