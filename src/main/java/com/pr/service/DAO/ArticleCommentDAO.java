package com.pr.service.DAO;

import org.springframework.stereotype.Repository;
import com.pr.entiy.ArticleComment;
import com.pr.mapper.ArticleCommentMapper;

import java.util.List;

@Repository
public class ArticleCommentDAO extends AbstractDAO<ArticleCommentMapper,ArticleComment>{

    public List<ArticleComment> getComment(Integer mathId){
        return lambdaQuery().eq(ArticleComment::getMatherId,mathId).orderByAsc(ArticleComment::getCreateTime).list();
    }
}
