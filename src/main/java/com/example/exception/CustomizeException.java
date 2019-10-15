package com.example.exception;

import java.io.Serializable;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 17:17
 */

public class CustomizeException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 5L;

    private final BaseResultCodeEnum response;

    public CustomizeException(BaseResultCodeEnum response) {
        this.response = response;
    }
    public BaseResultCodeEnum getResponse() {
        return response;
    }

}
