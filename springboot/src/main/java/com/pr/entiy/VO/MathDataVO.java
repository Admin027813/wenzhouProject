package com.pr.entiy.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @program: springboot
 * @description:数学家数据
 * @author: 何兰兰
 * @create: 2023-04-11 13:45
 **/
@Data
@TableName("math_data")
public class MathDataVO {
    @TableId(type = IdType.AUTO)
    private int Id;
    private String name;
    private int sex;
    private int age;
    private String basicInformation;
    private String accomplishment;
    private Timestamp createTime;
}
