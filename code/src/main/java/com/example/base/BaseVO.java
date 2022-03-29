package com.example.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wenlongup
 * @Date 2019年10月24日20:48:53
 */
@Getter
@Setter
public class BaseVO<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public BaseVO() {
    }

    public BaseVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> BaseVO<T> build200() {
        return new BaseVO<>(StatusCode.OK, "success");
    }

    public static <T> BaseVO<T> build200(T data) {
        return new BaseVO<>(StatusCode.OK, "success", data);
    }

    public static <T> BaseVO<T> build410(String msg) {
        return new BaseVO<>(StatusCode.REQ_BAD, msg);
    }

    public static <T> BaseVO<T> build500(String msg) {
        return new BaseVO<>(StatusCode.SERVERERROR, msg);
    }
}
