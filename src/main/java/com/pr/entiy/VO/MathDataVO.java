package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class MathDataVO {
    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private int sex;
    private int age;
    private String basicInformation;
    private String accomplishment;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createTime;
}
