package com.fanxuebo.springcloudeurekaclientone.frame.exception;

import com.fanxuebo.springcloudcommon.constant.CommonResDto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author fanxuebo
 * @description 全局的统一异常处理类
 * @Company sinosig
 * @createDate 2019-10-12 14:14:15 星期六
 */
@ControllerAdvice
@ResponseBody
public class RunTimeExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public CommonResDto exceptionHandler(RuntimeException e, HttpServletResponse response) {
        return new CommonResDto(e.getStackTrace()[0]);
    }
}
