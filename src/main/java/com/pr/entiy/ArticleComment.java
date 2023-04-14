package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("article_comment")
public class ArticleComment {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private Integer matherId; //数学家id
    private String content; //评论内容
    private Integer parentCommentId; //父评论父用户
    private Long userId; //用户id
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime; //创建时间
}
