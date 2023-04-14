package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.MathDataVO;
import com.pr.entiy.VO.UserVO;
import com.pr.service.MathDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/math")
@RestController
public class MatherDataController extends BaseController{
    @Resource
    private MathDataService mathDataService;

    @GetMapping("getMath")
    public R<MathDataVO> getMathData(@RequestParam Integer id){
        MathDataVO math = mathDataService.getMathInfo(id);
        return successHandler(math);
    }

    @PutMapping("updataMath")
    public R<Boolean> updataMathData(@RequestBody MathDataVO mathDataVO){
        return successHandler(mathDataService.updataMathData(mathDataVO));
    }

    @PostMapping("creatMath")
    public R<Boolean> creatMathData(@RequestBody MathDataVO mathDataVO){
        return successHandler(mathDataService.creatMathData(mathDataVO));
    }

    @DeleteMapping("deleteMath")
    public R<Boolean> deleteMathData(@RequestParam Integer id){
        return successHandler(mathDataService.deleteMathData(id));
    }
}
