package com.pr.enums;

public class SysConstants {
    SysConstants() {
    }

    //todo 所有描述加上
    public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static final String MONTH_FORMAT = "yyyy-MM";

    public static final String COLON = ":";

    public static final String COMMA = ",";

    public static final String SESSION_USER_KEY = "UserInfo";

    public static final String LOGIN_OUT_SUCCESS = "退出成功";

    public static final String PASSWORD_CN = "密码";

    public static final Integer MENU_PARENT_ID = 0;

    public static final Integer STATUS_VALUE_TRUE = 1;

    public static final Long COMPANY_PARENT_ID = 0L;

    public static final Integer ADD = 1;

    public static final Integer SUBTRACT = 1;

    public static final Integer ONE = 1;

    public static final Integer ZERO = 0;

    public static final Double VOLTAGE = 500.0;

    /**
     * 设置集合名称
     */
    public static final String TIME_TASK = "time_task";
    public static final String FAULT_DATA = "fault_data";
    //设备编码
    public static final String EQUIPMENT_ID = "equipmentId";
    //时间字段
    public static final String SAVE_TIME = "saveTime";


    //星号
    public static final String ASTERISK = "*";

    //链接地址
    public static final String WEBSOCKET_PATH_PER_FIX = "/ws-push";

    public static final String WEBSOCKET_PATH = "/endpointWisely";

    //消息代理路径
    public static final String WEBSOCKET_BROADCAST_PATH = "/topic";

    public static final String WEBSOCKET_ERROR_PATH = "/topic/errors";

    //前端发送给服务端请求地址
    public static final String SUB_TO_SERVER_PATH = "/subscribe/devices";

    public static final String UNSUB_TO_SERVER_PATH = "/unsubscribe/devices";

    //服务端生产地址,客户端订阅此地址以接收服务端生产的消息
    public static final String PRODUCER_PATH = "/topic/getResponse";

    //点对点消息推送地址前缀
    public static final String P2P_PUSH_BASE_PATH = "/user";

    //点对点消息推送地址后缀,最后的地址为/user/用户识别码/data
    public static final String P2P_PUSH_PATH = "/data";

    //sa-token
    public static final String SA_TOKEN = "satoken";

    //用户断开连接
    public static final String USER_DISCONNECT = "用户{0}的连接已经断开";
}
