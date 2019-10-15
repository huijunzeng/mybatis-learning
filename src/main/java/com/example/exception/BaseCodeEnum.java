package com.example.exception;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 17:08
 */
public interface BaseCodeEnum<C, S> {
    C code();

    S msg();
}
