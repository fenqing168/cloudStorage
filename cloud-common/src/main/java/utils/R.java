package utils;

import lombok.Data;

/**
 * 返回数据
 */
@Data
public class R<T> {

    private Integer code;

    private String msg;

    private T t;

    public R(Integer code, String msg, T t){
        this.code = code;
        this.msg = msg;
        this.t = t;
    }

    public static <T> R ok(T t){
        return new R(0, "ok", t);
    }

    public static <T> R error(String msg){
        return new R(500, msg, null);
    }

}
