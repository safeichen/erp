package com.aqemachinery.erp.common;

import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 6702080800586452313L;

    /**
     * 错误码.
     */
    private Integer code;

    /**
     * 提示信息.
     */
    private String message;

    /**
     * 具体的内容.
     */
    private T data;

    private String timestamp;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getTimestamp(){
        return String.valueOf(DateTime.now().getMillis());
    }
}
