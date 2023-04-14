package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@ApiModel("评论模型")
public class ArticleCommentVO {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id")
    private int id;
    @ApiModelProperty("数学家id")
    private int matherId; //数学家id
    @ApiModelProperty("评论内容")
    private String content; //评论内容
    @ApiModelProperty("父评论父用户")
    private int parentCommentId; //父评论父用户
    @ApiModelProperty("用户id")
    private long userId; //用户id
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime; //创建时间
}
