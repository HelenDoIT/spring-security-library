package com.library.common.exception;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
public class ServiceException extends RuntimeException{

    /**
     * result code  -1:error 0:success 1:fail
     */
    private Integer code;

    /**
     * result message
     */
    private String message;

    public ServiceException() {
    }

    public ServiceException(String message) {
        this.message = message;
    }

    public ServiceException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
