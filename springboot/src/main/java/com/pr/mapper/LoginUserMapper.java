package com.pr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pr.entiy.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-11 14:44
 **/
@Mapper
public interface LoginUserMapper extends BaseMapper<LoginUser> {
}
