package com.whale.exception;

public class BusinessException extends RuntimeException{  // 运行时异常，自动向上抛
    private Integer code;
    public BusinessException( Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
