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

    public MathDataVO getMathInfo(Integer id){
        MathData mathData = mathDataDAO.getById(id);
        return JacksonUtil.convertToObj(mathData,MathDataVO.class);
    }

    public List<MathDataVO> getMathList(){
     List<MathData> mathData = mathDataDAO.list();
     List<Support> supports =    supportDAO.list();
     List<ArticleComment> articleComments = articleCommentDAO.list();
     List<MathDataVO> mathDataVOS =  JacksonUtil.convertToList(mathData,MathDataVO.class);
        for (MathDataVO mathDataVO : mathDataVOS) {
            int supSum = 0;
            int artSum = 0;
            for (Support support : supports) {
                if(support.getType().equals(1)&&support.getTargetId().equals(mathDataVO.getId())){
                    supSum++;
                    mathDataVO.setSupSum(supSum);
                }
            }
            for (ArticleComment articleComment : articleComments) {
                if(articleComment.getMatherId().equals(mathDataVO.getId())){
                    artSum++;
                    mathDataVO.setSupSum(artSum);
                }
            }
        }
        return mathDataVOS;
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
