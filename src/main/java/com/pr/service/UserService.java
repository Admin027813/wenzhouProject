package com.pr.service;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import com.pr.entiy.User;
import com.pr.entiy.VO.UserVO;
import com.pr.service.DAO.UserDAO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDAO userDAO;

    public UserVO getUserInfoByUserAccount(String userAccount){
        return JacksonUtil.convertToObj(userDAO.getUserInfoByUserAccount(userAccount), UserVO.class);
    }

    public UserVO getInfo(){
        SaSession saSession = StpUtil.getSession();
        UserVO user = saSession.getModel("UserInfo", UserVO.class);
        return user;
    }

    public List<UserVO> getUserList(){
        return JacksonUtil.convertToList(userDAO.list(), UserVO.class);
    }


    public boolean updataUserData(UserVO userVO){
        return userDAO.updateById(JacksonUtil.convertToObj(userVO, User.class));
    }

    public boolean creatUserData(UserVO userVO){
        return userDAO.save(JacksonUtil.convertToObj(userVO, User.class));
    }

    public boolean deleteUserData(Integer id){
        Boolean b = userDAO.removeById(id);
        StpUtil.kickout(id);
        return b;
    }

    public boolean deleteUserDatas(List id){
        Boolean b = userDAO.removeByIds(id);
        StpUtil.kickout(id);
        return b;
    }
}
