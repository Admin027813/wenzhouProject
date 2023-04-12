package com.pr.entiy;

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
public class ArticleComment {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private Integer matherId; //数学家id
    private String content; //评论内容
    private Integer likeNum; //点赞数
    private Long userId; //用户id
    private Timestamp createTime; //创建时间
}
