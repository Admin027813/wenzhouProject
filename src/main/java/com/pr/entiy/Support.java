package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("support")
public class Support {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private Integer type; //点赞类型
    private Integer userId; //点赞用户
    private Integer targetId; //点赞目标
}
