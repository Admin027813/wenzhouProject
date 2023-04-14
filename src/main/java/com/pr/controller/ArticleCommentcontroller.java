package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.ArticleCommentVO;
import com.pr.entiy.VO.UserVO;
import com.pr.service.ArticleCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("comment")
public class ArticleCommentcontroller extends BaseController{
    @Resource
    private ArticleCommentService articleCommentService;

//    @GetMapping("getUser")
//    public R<UserVO> getUserData(){
//        UserVO user = articleCommentService();
//        return successHandler(user);
//    }

    @PutMapping("updataUser")
    public R<Boolean> updataUserData(@RequestBody ArticleCommentVO articleCommentVO){
        return successHandler(articleCommentService.updateComment(articleCommentVO));
    }

    @PostMapping("creatUser")
    public R<Boolean> creatUserData(@RequestBody ArticleCommentVO articleCommentVO){
        return successHandler(articleCommentService.creatComment(articleCommentVO));
    }

    @DeleteMapping("deleteUser")
    public R<Boolean> deleteUserData(@RequestParam Integer id){
        return successHandler(articleCommentService.deleteComment(id));
    }
}
