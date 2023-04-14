package com.pr.entiy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("math_data")
public class MathData {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private String name; //数学家名称
    private Integer sex; //性别
    private Integer age; //年龄
    private String basicInformation; //基本信息
    private String accomplishment; //成就
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime; //创建时间
}
