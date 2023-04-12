package com.pr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pr.entiy.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-11 14:44
 **/
@Mapper
public interface LoginUserMapper extends BaseMapper<User> {
}
