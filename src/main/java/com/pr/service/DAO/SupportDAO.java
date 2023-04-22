package com.pr.service.DAO;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.pr.entiy.Support;
import com.pr.entiy.User;
import com.pr.entiy.VO.SupportVO;
import com.pr.mapper.LoginUserMapper;
import com.pr.mapper.SupportMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SupportDAO extends AbstractDAO<SupportMapper, Support>{
    public List<SupportVO> getSupportNum(List<Integer> mathIds){
        List<SupportVO> supportVOS = new ArrayList<>();
        SupportVO supportVO = new SupportVO();
        for (Integer mathId : mathIds) {
            Support  support =  lambdaQuery().eq(ObjectUtil.isEmpty(mathId),Support::getTargetId,mathId).one();
            supportVO.setTargetId(support.getTargetId());
            supportVO.setUserId(support.getUserId());
            supportVOS.add(supportVO);
        }
        return supportVOS;
    }
}
