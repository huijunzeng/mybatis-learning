package com.example.exception;

import java.util.function.Consumer;

/**
 * @Author: ZJH
 * @Date: 2019/10/17 18:18
 * 包装lamda表达式异常
 */
@FunctionalInterface
public interface ThrowingWrapper<T, E extends Exception> {
    void accept(T t) throws E;

    static <T, E extends Exception> Consumer<T> throwingConsumerWrapper(ThrowingWrapper<T, E> throwingConsumer, Class<E> exceptionClass) {

        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                try {
                    E exCast = exceptionClass.cast(ex);
                    System.err.println(
                            "Exception occured : " + exCast.getMessage());
                    throw new CustomizeException(BaseResultCodeEnum.FASLE);
                } catch (ClassCastException ccEx) {
                    throw new RuntimeException(ex);
                }
            }
        };
    }
}