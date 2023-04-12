package com.pr.entiy;

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
public class MathData {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private String name; //数学家名称
    private Integer sex; //性别
    private Integer age; //年龄
    private String basicInformation; //基本信息
    private String accomplishment; //成就
    private Timestamp createTime; //创建时间
}
