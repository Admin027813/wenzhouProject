package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ArticleCommentVO {
    @TableId(type = IdType.AUTO)
    private int id;
    private int matherId; //数学家id
    private String content; //评论内容
    private int parentCommentId; //父评论父用户
    private long userId; //用户id
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createTime; //创建时间
}
