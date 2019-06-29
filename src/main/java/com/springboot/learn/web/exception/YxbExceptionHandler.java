package com.springboot.learn.web.exception;

import com.springboot.learn.web.common.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理类,异常匹配是从上到下一次搜索的。
 * @author Aviator
 */
@RestControllerAdvice
public class YxbExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response handlerBadRequestException(){
        return new Response(404,"bad_request");
    }
}
