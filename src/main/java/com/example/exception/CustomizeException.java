package com.example.exception;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 17:17
 */

public class CustomizeException extends RuntimeException {

    private static final long serialVersionUID = -6370612186038915645L;

    /*private final BaseResultCodeEnum response;

    public CustomizeException(BaseResultCodeEnum response) {
        this.response = response;
    }
    public BaseResultCodeEnum getResponse() {
        return response;
    }*/

    public int code;
    public String msg;

    public CustomizeException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
