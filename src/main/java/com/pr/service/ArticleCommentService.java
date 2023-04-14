package com.pr.service;

import com.pr.entiy.ArticleComment;
import com.pr.entiy.VO.ArticleCommentVO;
import com.pr.service.DAO.ArticleCommentDAO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ArticleCommentService {
    @Resource
    private ArticleCommentDAO articleCommentDAO;

//    public List<CommentVO> getComment(Integer mathId){
//        List<CommentVO> commentVOList = new ArrayList<>();
//        List<ArticleComment> articleCommentList = articleCommentDAO.getComment(mathId);
//        articleCommentList.stream().filter(comment1 -> comment1.getParentCommentId().equals(mathId)).map(
//            comment2 -> {
//                if (comment2)
//            }
//        );
//    }
    //新增评论
    public Boolean creatComment(ArticleCommentVO articleCommentVO){
        if(articleCommentVO.equals(null)){
            return false;
        }
        return articleCommentDAO.save(JacksonUtil.convertToObj(articleCommentVO,ArticleComment.class));
    }

    //修改评论
    public Boolean updateComment(ArticleCommentVO articleCommentVO){
        if(articleCommentVO.equals(null)){
            return false;
        }
        return articleCommentDAO.updateById(JacksonUtil.convertToObj(articleCommentVO,ArticleComment.class));
    }

    //删除评论
    public Boolean deleteComment(Integer id){
        if(id == null){
            return false;
        }
        return articleCommentDAO.removeById(id);
    }

}
