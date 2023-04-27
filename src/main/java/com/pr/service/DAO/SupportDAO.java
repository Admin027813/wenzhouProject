package com.pr.service.DAO;

import cn.hutool.core.util.ObjectUtil;
import com.pr.entiy.Support;
import com.pr.mapper.SupportMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SupportDAO extends AbstractDAO<SupportMapper, Support>{

    public Integer getSupportNum(Integer mathId){
            List<Support>  support =  lambdaQuery().eq(ObjectUtil.isEmpty(mathId),Support::getTargetId,mathId).list();
        return support.size();
    }
}
