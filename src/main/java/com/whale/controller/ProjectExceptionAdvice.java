package com.whale.controller;

import com.whale.exception.BusinessException;
import com.whale.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   // 开启异常处理器
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)// 需要处理的异常类型
    public Result doSystemException(SystemException ex){
        // 记录日志
        // 发送消息给运维
        // 发送右键给开发人员

        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)// 需要处理的异常类型
    public Result doBusinessException(BusinessException ex){
        // 记录日志
        // 发送消息给运维
        // 发送右键给开发人员，ex对象发送给开发人员

        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)// 需要处理的异常类型
    public Result doException(Exception ex){

        // 记录日志
        // 发送消息给运维
        // 发送右键给开发人员，ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试！");
    }
}
