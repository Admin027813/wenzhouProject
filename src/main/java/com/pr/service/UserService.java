package com.pr.service;

import com.pr.entiy.VO.LoginUserVO;
import com.pr.entiy.VO.UserVO;
import com.pr.service.DAO.UserDAO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: springboot
 * @description:
 * @author: 何兰兰
 * @create: 2023-04-11 15:15
 **/
@Service
public class UserService {
    @Resource
    private UserDAO userDAO;
    public UserVO getUserInfoByUserAccount(String userAccount){
        return JacksonUtil.convertToObj(userDAO.getUserInfoByUserAccount(userAccount), UserVO.class);
    }
}
