package com.pr.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.pr.entiy.VO.SupportVO;
import com.pr.service.SupportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@Api("点赞模型")
@RequestMapping("/support")
public class SupportController extends BaseController{
    @Resource
    private SupportService supportService;

    @ApiOperation("点赞")
    @PostMapping("/creatSupport")
    public R<Boolean> creatSupport(@RequestBody SupportVO supportVO){
        return successHandler(supportService.creatSupport(supportVO));
    }

    @ApiOperation("删除点赞")
    @PostMapping("/deleteSupport")
    public R<Boolean> deleteSupport(@RequestParam Integer id){
        return successHandler(supportService.deleteSupport(id));
    }

}
