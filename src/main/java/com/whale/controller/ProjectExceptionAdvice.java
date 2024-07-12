package com.whale.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   // 开启异常处理器
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)// 需要处理的异常类型
    public Result doException(Exception ex){
        System.out.println("异常"+ex);
        return new Result(666,null,"出现异常"+ex);
    }
}
