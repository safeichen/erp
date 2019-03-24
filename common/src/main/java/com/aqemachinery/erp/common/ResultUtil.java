package com.aqemachinery.erp.common;

import com.aqemachinery.erp.common.Result;

public class ResultUtil {
    private static final Integer FAILCODE=-1;
    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.setCode(0);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> error(Integer code, String msg) {
        Result<T> result = new Result<T>();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
    public static <T> Result<T> error( String msg) {
        return  error(FAILCODE,msg);
    }
}
