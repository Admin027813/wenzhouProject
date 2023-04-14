package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.UserVO;
import com.pr.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(tags = "用户模块")
public class UserController extends BaseController {
    @Resource
    private UserService userService;

    @GetMapping("getUser")
    @ApiOperation("获取用户信息")
    public R<UserVO> getUserData(){
        UserVO user = userService.getInfo();
        return successHandler(user);
    }

    @PutMapping("updateUser")
    @ApiOperation("修改用户信息")
    public R<Boolean> updataUserData( UserVO userVO){
       return successHandler(userService.updataUserData(userVO));
    }

    @PostMapping("creatUser")
    @ApiOperation("注册用户")
    public R<Boolean> creatUserData(@RequestBody UserVO userVO){
        return successHandler(userService.creatUserData(userVO));
    }

    @DeleteMapping("deleteUser")
    @ApiOperation("删除用户")
    public R<Boolean> deleteUserData(@RequestParam(value = "id") Integer id){
        return successHandler(userService.deleteUserData(id));
    }
}
