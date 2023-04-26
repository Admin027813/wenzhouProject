package com.pr.service.DAO;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.pr.entiy.VO.MathDataVO;
import com.pr.util.JacksonUtil;
import org.springframework.stereotype.Repository;
import com.pr.entiy.MathData;
import com.pr.mapper.MathDataMapper;

import java.util.List;

@Repository
public class MathDataDAO extends AbstractDAO<MathDataMapper, MathData>{
    public List<MathDataVO> getMath(String name){
       return JacksonUtil.convertToList(lambdaQuery().like(StringUtils.isNotBlank(name),MathData::getName,name).list(),MathDataVO.class);
    }
}
