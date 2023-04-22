package com.pr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pr.entiy.MathData;
import com.pr.entiy.VO.MathDataVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MathDataMapper extends BaseMapper<MathData> {
    List<MathDataVO> getMathList();
}
