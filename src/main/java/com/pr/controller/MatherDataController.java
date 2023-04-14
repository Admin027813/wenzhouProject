package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.MathDataVO;
import com.pr.entiy.VO.UserVO;
import com.pr.service.MathDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/math")
@RestController
@Api(tags = "数学家信息模块")
public class MatherDataController extends BaseController{
    @Resource
    private MathDataService mathDataService;

    @GetMapping("getMath")
    @ApiOperation("获取数学家信息")
    public R<MathDataVO> getMathData(@RequestParam Integer id){
        MathDataVO math = mathDataService.getMathInfo(id);
        return successHandler(math);
    }

    @PutMapping("updataMath")
    @ApiOperation("修改数学家信息")
    public R<Boolean> updataMathData(@RequestBody MathDataVO mathDataVO){
        return successHandler(mathDataService.updataMathData(mathDataVO));
    }

    @PostMapping("creatMath")
    @ApiOperation("新增数学家信息")
    public R<Boolean> creatMathData(@RequestBody MathDataVO mathDataVO){
        return successHandler(mathDataService.creatMathData(mathDataVO));
    }

    @DeleteMapping("deleteMath")
    @ApiOperation("删除数学家信息")
    public R<Boolean> deleteMathData(@RequestParam Integer id){
        return successHandler(mathDataService.deleteMathData(id));
    }
}
