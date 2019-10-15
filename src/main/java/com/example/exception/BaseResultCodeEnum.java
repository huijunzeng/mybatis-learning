package com.example.exception;

public enum BaseResultCodeEnum implements BaseCodeEnum<Integer, String> {

    SUCCESS(200, "成功"),
    TEST(300, "重试"),
    FASLE(1001, "操作失败，请重新请求");


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
