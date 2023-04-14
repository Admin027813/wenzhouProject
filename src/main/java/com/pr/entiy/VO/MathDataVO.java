package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@ApiModel("数学家模型")
public class MathDataVO {
    @ApiModelProperty("id")
    @TableId(type = IdType.AUTO)
    private int id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("性别")
    private int sex;
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("基本信息")
    private String basicInformation;
    @ApiModelProperty("成就")
    private String accomplishment;
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createTime;
}
