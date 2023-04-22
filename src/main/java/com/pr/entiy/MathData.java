package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@TableName("math_data")
public class MathData {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private String img;//图片
    private String name; //数学家名称
    @TableField(fill = FieldFill.INSERT)
    private Date dieDate; //死亡时间
    @TableField(fill = FieldFill.INSERT)
    private Date birthDate; //出生时间
    private String basicInformation; //基本信息
    private String accomplishment; //成就
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime; //创建时间
}
