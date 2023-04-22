package com.pr.service;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import com.pr.entiy.Support;
import com.pr.entiy.User;
import com.pr.entiy.VO.SupportVO;
import com.pr.entiy.VO.UserVO;
import com.pr.service.DAO.SupportDAO;
import com.pr.service.DAO.UserDAO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupportService {
    @Resource
    private SupportDAO supportDAO;

    public Boolean creatSupport(SupportVO supportVO){
      return  supportDAO.save(JacksonUtil.convertToObj(supportVO,Support.class));
    }

    public Boolean deleteSupport(Integer id){
        return  supportDAO.removeById(id);
    }
}
