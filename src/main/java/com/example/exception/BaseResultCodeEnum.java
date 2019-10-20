package com.example.exception;

public enum BaseResultCodeEnum implements BaseCodeEnum<Integer, String> {

    SUCCESS(200, "成功"),
    FASLE(1001, "操作失败，请重新请求"),
    DATE_PARAM_EMPTY(1002, "日期参数为空"),
    NAME_PARAM_EMPTY(1003, "名字参数不能为空");


    public int code;
    public String msg;

    private BaseResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer code() {
        return this.code;
    }

    @Override
    public String msg() {
        return this.msg;
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
