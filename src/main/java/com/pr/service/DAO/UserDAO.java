package com.pr.service.DAO;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.pr.entiy.User;
import com.pr.entiy.VO.LoginUserVO;
import org.springframework.stereotype.Repository;
import com.pr.mapper.LoginUserMapper;

import java.util.List;

@Repository
public class UserDAO extends AbstractDAO<LoginUserMapper, User>{
    public User getUserInfoByUserAccount(LoginUserVO loginUserVO){
        User user = lambdaQuery().eq(StringUtils.isNotBlank(loginUserVO.getAccount()), User::getAccount, loginUserVO.getAccount())
                .eq(ObjectUtils.isNotEmpty(loginUserVO.getRole()),User::getRole,loginUserVO.getRole()).one();
        return user;
    }

    public List<User> getUser(String name){
        List<User> user = lambdaQuery().like(StringUtils.isNotBlank(name), User::getUserName, name).list();
        return user;
    }
}
