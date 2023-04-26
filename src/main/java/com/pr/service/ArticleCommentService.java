package com.pr.service;

import com.pr.entiy.ArticleComment;
import com.pr.entiy.Support;
import com.pr.entiy.User;
import com.pr.entiy.VO.ArticleCommentVO;
import com.pr.entiy.VO.CommentVO;
import com.pr.service.DAO.ArticleCommentDAO;
import com.pr.service.DAO.SupportDAO;
import com.pr.service.DAO.UserDAO;
import com.pr.util.JacksonUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ArticleCommentService {
    @Resource
    private ArticleCommentDAO articleCommentDAO;
    @Resource
    private SupportDAO supportDAO;
    @Resource
    private UserDAO userDAO;
    //get评论
    public List<ArticleCommentVO> getComment(Integer mathId){
        List<Support> supports =  supportDAO.list();
        List<User> users = userDAO.list();
        List<ArticleComment> articleCommentList = articleCommentDAO.getComment(mathId);
        List<ArticleCommentVO> articleCommentVOS =  JacksonUtil.convertToList(articleCommentList,ArticleCommentVO.class);
        for (ArticleCommentVO articleComment : articleCommentVOS) {
            int supSum = 0;
            for (Support support : supports) {
                if(support.getType().equals(1) && support.getTargetId().equals(articleComment.getId())){
                    supSum++;
                }
            }
            for (User user : users) {
                if(user.getId() == articleComment.getUserId()){
                    articleComment.setUserName(user.getUserName());
                }
            }
            articleComment.setSupport(supSum);
        }
        return articleCommentVOS;
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
