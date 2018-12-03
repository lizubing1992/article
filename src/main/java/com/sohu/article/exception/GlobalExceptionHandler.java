package com.sohu.article.exception;

import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by BlueT on 2017/3/4.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = TipException.class)
    public WebResponse<String> tipException(Exception e) {
        LOGGER.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return ResponseBuilder.buildFailResponse(e.getMessage());
    }


    @ExceptionHandler(value = Exception.class)
    public WebResponse<String> exception(Exception e){
        LOGGER.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return ResponseBuilder.buildFailResponse(e.getMessage());
    }
}
