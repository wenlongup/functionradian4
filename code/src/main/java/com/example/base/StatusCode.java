package com.example.base;

/**
 * @ Author     ：李文龙
 * @ Date       ：Created in 2019/4/10 17:04
 * @ Description：
 * @ Modified By：
 **/
public interface StatusCode {
    // 成功
    int OK = 200;
    // 未登录
    int UNAUTHORIZED = 401;
    // 账号异常
    int FORBIDDEN = 402;
    // 请求异常
    int REQ_BAD = 410;
    // 手机号验证码错误
    int PHONECODE_ERROR = 411;
    // 短信发送频率超限
    int SMS_SEND_LIMIT = 412;
    // 服务端错误
    int SERVERERROR = 500;
}
