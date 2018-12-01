package com.sohu.article.base;

/**
 * Created by administrator on 2018/9/20.
 */

public enum ResponseCodeEnums {
    //
    SUCCESS(0, "操作成功"),
    FAIL(1, "失败[异常]"),
    FAILED_BUSI_ERROR(3, "业务逻辑错误"),
    FAILED_ISNULL_ERROR(4, "参数值或者返回数据为空");

    private Integer code;
    private String msg;

    private ResponseCodeEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
