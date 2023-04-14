package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.UserVO;
import com.pr.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource
    private UserService userService;

    @GetMapping("getUser")
    public R<UserVO> getUserData(){
        UserVO user = userService.getInfo();
        return successHandler(user);
    }

    @PutMapping("updataUser")
    public R<Boolean> updataUserData(@RequestBody UserVO userVO){
       return successHandler(userService.updataUserData(userVO));
    }

    @PostMapping("creatUser")
    public R<Boolean> creatUserData(@RequestBody UserVO userVO){
        return successHandler(userService.creatUserData(userVO));
    }

    @DeleteMapping("deleteUser")
    public R<Boolean> deleteUserData(@RequestParam Integer id){
        return successHandler(userService.deleteUserData(id));
    }
}
