package com.pr.service;

import com.pr.entiy.ArticleComment;
import com.pr.entiy.VO.ArticleCommentVO;
import com.pr.entiy.VO.CommentVO;
import com.pr.service.DAO.ArticleCommentDAO;
import com.pr.service.DAO.SupportDAO;
import com.pr.util.JacksonUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleCommentService {
    @Resource
    private ArticleCommentDAO articleCommentDAO;
    @Resource
    private SupportDAO supportDAO;
    //get评论
    public List<CommentVO> getComment(Integer mathId){
        List<CommentVO> commentVOList = new ArrayList<>();
        List<Integer> supportNum=new ArrayList<>();
        List<ArticleComment> articleCommentList = articleCommentDAO.getComment(mathId);
        for (ArticleComment articleComment : articleCommentList) {
            supportNum.add(articleComment.getMatherId());
        }
        supportDAO.getSupportNum(supportNum);
        return null;
    }
    //新增评论
    public Boolean creatComment(ArticleCommentVO articleCommentVO){
        if(articleCommentVO.equals(null)){
            return false;
        }
        return articleCommentDAO.save(JacksonUtil.convertToObj(articleCommentVO,ArticleComment.class));
    }

    //删除评论
    public Boolean deleteComment(Integer id){
        if(id == null){
            return false;
        }
        return articleCommentDAO.removeById(id);
    }

    //评论数量
    public Integer CommentNum(Integer id){
        if(id == null){
            return 0;
        }
        List<ArticleComment> articleCommentList = articleCommentDAO.getComment(id);
        return articleCommentList.size();
    }

}
