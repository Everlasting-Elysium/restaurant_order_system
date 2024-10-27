package com.elysiam.restaurant_order_system.pojo.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;


@Data
public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseMessage(Integer code,String message,T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseMessage<T> Success(T data) {
        return new ResponseMessage<T>(HttpStatus.OK.value(), "success", data);
    }
}
