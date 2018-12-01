package com.sohu.article.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by administrator on 2018/9/20.
 */
@ApiModel
public class WebResponse<T> {
    @ApiModelProperty("响应消息状态码, 0:操作成功, 非0:操作失败")
    private Integer code;
    @ApiModelProperty("状态码描述")
    private String msg;
    private T data;
    @ApiModelProperty("获取当前系统的时间戳")
    private long timestamp;

    public Integer getCode() {
        return this.code;
    }

    public WebResponse() {
        this.code = 0;
        this.msg = "操作成功";
        this.timestamp = System.currentTimeMillis();
    }

    public WebResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public WebResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.timestamp = System.currentTimeMillis();
    }

    public void setCodeAndMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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


    public void badArgument() {
        this.code = 401;
        this.msg = "参数不对";
        this.timestamp = System.currentTimeMillis();
    }


    public void badArgumentValue() {
        this.code = 402;
        this.msg = "参数值不对";
        this.timestamp = System.currentTimeMillis();
    }

    public void unlogin() {
        this.code = 501;
        this.msg = "请登录";
        this.timestamp = System.currentTimeMillis();
    }

    public void serious() {
        this.code = 502;
        this.msg = "系统内部错误";
        this.timestamp = System.currentTimeMillis();
    }

    public void unsupport() {
        this.code = 503;
        this.msg = "业务不支持";
        this.timestamp = System.currentTimeMillis();
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long currentTimeMillis) {
        this.timestamp = currentTimeMillis;
    }


    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
