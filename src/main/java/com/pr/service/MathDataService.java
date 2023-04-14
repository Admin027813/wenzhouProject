package com.pr.service;

import cn.dev33.satoken.stp.StpUtil;
import com.pr.entiy.MathData;
import com.pr.entiy.VO.MathDataVO;
import com.pr.service.DAO.MathDataDAO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MathDataService {
    @Resource
    private MathDataDAO mathDataDAO;

    public MathDataVO getMathInfo(Integer id){
        MathData mathData = mathDataDAO.getById(id);
        return JacksonUtil.convertToObj(mathData,MathDataVO.class);
    }

    public boolean updataMathData(MathDataVO mathData){
        return mathDataDAO.updateById(JacksonUtil.convertToObj(mathData, MathData.class));
    }

    public boolean creatMathData(MathDataVO mathData){
        return mathDataDAO.save(JacksonUtil.convertToObj(mathData, MathData.class));
    }

    public boolean deleteMathData(Integer id){
        Boolean b = mathDataDAO.removeById(id);
        StpUtil.kickout(id);
        return b;
    }
}
