package com.pr.service.DAO;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.pr.entiy.User;
import org.springframework.stereotype.Repository;
import com.pr.mapper.LoginUserMapper;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-11 16:04
 **/
@Repository
public class UserDAO extends AbstractDAO<LoginUserMapper, User>{
    public User getUserInfoByUserAccount(String userAccount){
        return  lambdaQuery().eq(StringUtils.isNotBlank(userAccount), User::getAccount, userAccount).one();
    }
}
