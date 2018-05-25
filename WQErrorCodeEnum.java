/**
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 * <p/>
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */
package com.jd.vip.plus.common;


/**
 * Description:微信手Q获取pin接口返回错误码
 *
 * @author donghuanqiang
 * @version 1.0.0
 */
/*
 * =========================== 维护日志 ===========================
 * 2017-04-06 15:04:54  donghuanqiang 新增
 * =========================== 维护日志 ===========================
 */
public enum WQErrorCodeEnum {
    SUCCESS(0, "获取成功"),
    SYSTEM_ERROR(1, "系统异常"),
    STORAGE_ERROR(2, "存储异常"),
    PARAM_IP_ERROR(10000, "1. 参数为空（biz为空、token为空） 2. 调用方ip不在白名单内"),
    TOKEN_ERROR(10001, "token无效（token过期或者token非法）"),
    PIN_ERROR(10003, "1.pin不存在 2.当前pin为默认pin");

    private int errorCode;
    private String errorMessage;

    WQErrorCodeEnum(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
