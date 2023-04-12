package com.pr.controller;

import com.pr.enums.StatusType;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.extension.api.R;


@RestController
public class BaseController {
    public BaseController() {
    }

    protected <T> R<T> successHandler(T t) {
        return this.executeHandler(StatusType.OK, t);
    }

    protected <T> R<T> failHandler(T t) {
        return this.executeHandler(StatusType.FAIL, t);
    }

    public <T> R<T> executeHandler(StatusType statusType, T t) {
        R<T> r = new R();
        r.setData(t);
        r.setCode(statusType.getCode());
        r.setMsg(statusType.getDesc());
        return r;
    }
}
