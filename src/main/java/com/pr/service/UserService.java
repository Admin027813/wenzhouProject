package com.pr.service;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import com.pr.entiy.User;
import com.pr.entiy.VO.LoginUserVO;
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

    public User getUserInfoByUserAccount(LoginUserVO loginUserVO){
        return userDAO.getUserInfoByUserAccount(loginUserVO);
    }

    public UserVO getInfo(){
        SaSession saSession = StpUtil.getSession();
        User user = saSession.getModel("UserInfo", User.class);
        return JacksonUtil.convertToObj(userDAO.getById(user.getId()),UserVO.class);
    }

    public List<UserVO> getUser(String name){
        return JacksonUtil.convertToList(userDAO.getUser(name),UserVO.class);
    }

    public List<UserVO> getUserList(){
        List<User> users = userDAO.list();
        SaSession saSession = StpUtil.getSession();
        User user = saSession.getModel("UserInfo", User.class);
        users.remove(user);
        return JacksonUtil.convertToList(users,UserVO.class);
    }


    public boolean updataUserData(UserVO userVO){
        return userDAO.updateById(JacksonUtil.convertToObj(userVO, User.class));
    }

    public boolean creatUserData(UserVO userVO){
        userVO.setUserName(userVO.getAccount());
        userVO.setRole(1);
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
