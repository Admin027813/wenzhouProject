package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.MathDataVO;
import com.pr.service.ArticleCommentService;
import com.pr.service.MathDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/math")
@RestController
@Api(tags = "数学家信息模块")
public class MatherDataController extends BaseController{
    @Resource
    private MathDataService mathDataService;
    @Resource
    private ArticleCommentService articleCommentService;

    @GetMapping("getMath")
    @ApiOperation("获取数学家信息")
    public R<MathDataVO> getMathData(@RequestParam Integer id){
        MathDataVO math = mathDataService.getMathInfo(id);
        return successHandler(math);
    }

    @GetMapping("selectMath")
    @ApiOperation("获取数学家信息")
    public R<List<MathDataVO>> getSelectData(@RequestParam String name){
        List<MathDataVO> math = mathDataService.getMath(name);
        return successHandler(math);
    }

    @GetMapping("getMathList")
    @ApiOperation("获取数学家列表")
    public R<List<MathDataVO>> getMathList(){
        return successHandler(mathDataService.getMathList());
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
