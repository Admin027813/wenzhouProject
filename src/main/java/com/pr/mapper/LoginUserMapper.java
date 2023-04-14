package com.pr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pr.entiy.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginUserMapper extends BaseMapper<User> {
}
