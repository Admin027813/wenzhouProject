package com.pr.service.DAO;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.pr.entiy.User;
import org.springframework.stereotype.Repository;
import com.pr.mapper.LoginUserMapper;

@Repository
public class UserDAO extends AbstractDAO<LoginUserMapper, User>{
    public User getUserInfoByUserAccount(String userAccount){
        return  lambdaQuery().eq(StringUtils.isNotBlank(userAccount), User::getAccount, userAccount).one();
    }
}
