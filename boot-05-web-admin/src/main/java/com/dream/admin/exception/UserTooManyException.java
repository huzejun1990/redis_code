package com.dream.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author: huzejun
 * @Date: 2021/4/8 15:42
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多")
public class UserTooManyException extends RuntimeException {

    public UserTooManyException(){
    }

    public UserTooManyException(String message){
        super(message);
    }
}
