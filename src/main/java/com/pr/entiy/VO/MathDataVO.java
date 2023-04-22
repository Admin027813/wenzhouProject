package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@ApiModel("数学家模型")
public class MathDataVO {
    @ApiModelProperty("id")
    @TableId(type = IdType.AUTO)
    private int id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("图片")
    private String img;
    @ApiModelProperty("死亡时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dieDate;
    @ApiModelProperty("出生时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate; //
    @ApiModelProperty("基本信息")
    private String basicInformation;
    @ApiModelProperty("成就")
    private String accomplishment;
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @ApiModelProperty("评论数量")
    private Integer ArtSum;
    @ApiModelProperty("点赞数量")
    private Integer supSum;
}
