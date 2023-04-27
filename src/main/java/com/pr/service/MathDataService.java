package com.pr.service;

import cn.dev33.satoken.stp.StpUtil;
import com.pr.entiy.ArticleComment;
import com.pr.entiy.MathData;
import com.pr.entiy.Support;
import com.pr.entiy.VO.MathDataVO;
import com.pr.service.DAO.ArticleCommentDAO;
import com.pr.service.DAO.MathDataDAO;
import com.pr.service.DAO.SupportDAO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MathDataService {
    @Resource
    private MathDataDAO mathDataDAO;
    @Resource
    private SupportDAO supportDAO;
    @Resource
    private ArticleCommentDAO articleCommentDAO;

    //详情
    public MathDataVO getMathInfo(Integer id){
        Integer sum =  supportDAO.getSupportNum(id);
        MathData mathData = mathDataDAO.getById(id);
        MathDataVO mathDataVO = JacksonUtil.convertToObj(mathData,MathDataVO.class);
        mathDataVO.setSupSum(sum);
        return mathDataVO;
    }

    //搜索
    public List<MathDataVO> getMath(String name){
        return mathDataDAO.getMath(name);
    }

    public List<MathDataVO> getMathList(){
     return JacksonUtil.convertToList(mathDataDAO.list(),MathDataVO.class);
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
