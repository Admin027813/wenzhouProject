package com.pr.controller;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.pr.entiy.VO.LoginUserVO;
import com.pr.entiy.VO.UserVO;
import com.pr.enums.StatusType;
import com.pr.enums.SysConstants;
import com.pr.service.UserService;
import org.springframework.web.bind.annotation.*;

import com.baomidou.mybatisplus.extension.api.R;

import javax.annotation.Resource;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-11 14:32
 **/
@RestController
@RequestMapping("/login")
public class LoginConcroller extends BaseController{
    @Resource
    private UserService userService;

    @PostMapping("login")
    public R<String> login(@ModelAttribute LoginUserVO login) {
        //判断用户登录是否符合条件
        UserVO user = userService.getUserInfoByUserAccount(login.getAccount());
        //检查账户是否存在
        if (ObjectUtils.isEmpty(user.getAccount())) {
            return failHandler(StatusType.LOGIN_ERROR.getDesc());
        }
        //检验密码
        if (!login.getPassword().equals(user.getPassword())) {
            return failHandler(StatusType.LOGIN_ERROR.getDesc());
        }
        //用户登录
        StpUtil.login(user.getId());
        // 获取token
        SaTokenInfo saTokenInfo = StpUtil.getTokenInfo();
        //获取session
        SaSession saSession = StpUtil.getSession();
        user.setPassword(null);
        saSession.set(SysConstants.SESSION_USER_KEY, user);
        return successHandler(saTokenInfo.getTokenValue());
    }

    @PostMapping("logout")
    public R<String> logout() {
        StpUtil.logout();
        return successHandler(SysConstants.LOGIN_OUT_SUCCESS);
    }
}
