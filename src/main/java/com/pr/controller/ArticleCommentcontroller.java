package com.pr.controller;

import com.pr.service.ArticleCommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-13 16:16
 **/
@RestController
@RequestMapping("comment")
public class ArticleComment {
    @Resource
    private ArticleCommentService articleCommentService;
}
