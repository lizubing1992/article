package com.sohu.article.base;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.List;

/**
 * Created by administrator on 2018/9/20.
 */
public class ResponseBuilder {
    private static final Logger log = LoggerFactory.getLogger(ResponseBuilder.class);

    public ResponseBuilder() {
    }

    public static <T> WebResponse<T> build() {
        WebResponse<T> webResponse = new WebResponse(ResponseCodeEnums.SUCCESS.getCode(), ResponseCodeEnums.SUCCESS.getMsg());
        return webResponse;
    }

    public static <T> WebResponse<T> build(String msg) {
        WebResponse<T> webResponse = new WebResponse(ResponseCodeEnums.SUCCESS.getCode(), msg);
        return webResponse;
    }

    public static <T> WebResponse<T> build(T data) {
        WebResponse<T> webResponse = new WebResponse(ResponseCodeEnums.SUCCESS.getCode(), ResponseCodeEnums.SUCCESS.getMsg());
        webResponse.setData(data);
        return webResponse;
    }

    public static <T> WebResponse<T> build(Integer code, String msg, T data) {
        WebResponse<T> webResponse = new WebResponse(code, msg);
        webResponse.setData(data);
        return webResponse;
    }


    public static <T> WebResponse<T> buildFailResponse(String msg) {
        return new WebResponse(ResponseCodeEnums.FAIL.getCode(), msg);
    }

    public static <T> WebResponse<T> buildFailResponse(Exception ex) {
        StringBuilder msg = new StringBuilder();
        msg.append("提示：");
        msg.append(ex.getMessage());
        WebResponse<T> webResponse = new WebResponse(ResponseCodeEnums.FAIL.getCode(), msg.toString());
        if(StringUtils.isNotBlank(MDC.get("requestId"))) {
            msg.append("<br/>错误id：");
            msg.append(MDC.get("requestId"));
        }

        webResponse.setMsg(msg.toString());
        log.error("Exception:", ex);
        return webResponse;
    }

    public static <T> PageResultBean<T> buildPageResponse(List<T> list) {
        return new PageResultBean(list);
    }

    public static <T> PageResultBean<T> buildPageResponse(int pageNo, long totalCount, List<T> list) {
        return new PageResultBean(list,pageNo);
    }
}
