package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SupportVO {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private Integer type; //点赞类型
    private Integer userId; //点赞用户
    private Integer targetId; //点赞目标
}
