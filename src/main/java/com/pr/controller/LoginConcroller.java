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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.baomidou.mybatisplus.extension.api.R;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
@Api(tags = "登录模块")
public class LoginConcroller extends BaseController{
    @Resource
    private UserService userService;

    @PostMapping("login")
    @ResponseBody
    @ApiOperation("登录")
    public R<String> login(LoginUserVO login) {
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
    @ApiOperation("退出")
    public R<String> logout() {
        StpUtil.logout();
        return successHandler(SysConstants.LOGIN_OUT_SUCCESS);
    }
}
