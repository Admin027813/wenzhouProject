package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: springboot
 * @description:评论
 * @author: 何兰兰
 * @create: 2023-04-11 13:49
 **/
@Data
@TableName("article_comment")
public class Support {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private Integer type; //点赞类型
    private Integer userId; //点赞用户
    private Integer targetId; //点赞目标
}
