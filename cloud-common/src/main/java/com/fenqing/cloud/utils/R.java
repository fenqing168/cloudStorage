package com.fenqing.cloud.utils;

import lombok.Data;

/**
 * 返回数据
 */
@Data
public class R<T> {

    private Integer code;

    private String msg;

    private T data;

    public R(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> R ok(T data){
        return new R(0, "ok", data);
    }

    public static <T> R error(String msg){
        return new R(500, msg, null);
    }

}
