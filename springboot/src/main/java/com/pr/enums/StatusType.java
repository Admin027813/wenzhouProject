package com.pr.enums;

/**
 * @author: zjr
 * @create: 2022/4/8 12:45 AM
 * @description: 状态
 **/
public enum StatusType {
    OK(0, "OK"),
    FAIL(5000, "未知错误"),
    ILLEGAL_ARGUMENT(5001, "非法参数"),
    FEIGN_ERROR(5002, "客户端调用未知异常"),
    DB_ERROR(5100, "数据库操作错误"),
    DUPLICATE_COLUMN(5101, "非唯一性错误"),
    AUTH_ERROR(5200, "认证/授权错误"),
    NO_LOGIN(5201, "访问受限，请先登录"),
    LOGIN_ERROR(5202, "账号或者密码错误"),
    TOKEN_ERROR(5203, "获取token错误"),
    INVALID_TOKEN(5204, "无效的token"),
    RESOURCE_ACCESS_DENIED(5205, "资源访问受限，请开通该资源授权"),
    INTERFACE_ACCESS_DENIED(5206, "接口访问受限，没有该接口权限"),
    NO_ENOUGH_CLEARANCE(5209, "访问受限，没有足够的权限"),
    NO_REGISTER(5211, "请先注册"),
    OLD_PASSWORD_ERROR(5212, "原密码输入错误"),
    INVALID_REQUEST(5400, "无效的请求");

    private final int code;
    private final String desc;

    StatusType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
