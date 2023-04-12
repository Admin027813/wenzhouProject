package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @program: springboot
 * @description:评论
 * @author: 何兰兰
 * @create: 2023-04-11 13:49
 **/
@Data
@TableName("article_comment")
public class ArticleCommentVO {
    @TableId(type = IdType.AUTO)
    private int id;
    private int matherId; //数学家id
    private String content; //评论内容
    private int likeNum; //点赞数
    private long userId; //用户id
    private Timestamp createTime; //创建时间
}
