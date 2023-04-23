package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.ArticleCommentVO;
import com.pr.entiy.VO.CommentVO;
import com.pr.entiy.VO.UserVO;
import com.pr.service.ArticleCommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("comment")
@Api(tags = "评论模块")
public class ArticleCommentcontroller extends BaseController{
    @Resource
    private ArticleCommentService articleCommentService;

    @GetMapping("getComment")
    @ApiOperation("获取评论")
    public R<List<ArticleCommentVO>> getCommentData(@RequestParam(value = "id",required=false) Integer id){
        List<ArticleCommentVO> commentVO = articleCommentService.getComment(id);
        return successHandler(commentVO);
    }

    @PostMapping("creatComment")
    @ApiOperation("新增评论")
    public R<Boolean> creatUserData(@RequestBody ArticleCommentVO articleCommentVO){
        return successHandler(articleCommentService.creatComment(articleCommentVO));
    }

    @DeleteMapping("deleteComment")
    @ApiOperation("删除评论")
    public R<Boolean> deleteUserData(@RequestParam Integer id){
        return successHandler(articleCommentService.deleteComment(id));
    }
}
