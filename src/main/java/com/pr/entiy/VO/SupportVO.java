package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiModel("点赞模型")
public class SupportVO {
    @ApiModelProperty("点赞类型")
    private Integer type;
    @ApiModelProperty("点赞用户")
    private Integer userId; //点赞用户
    @ApiModelProperty("点赞目标")
    private Integer targetId; //点赞目标
}
