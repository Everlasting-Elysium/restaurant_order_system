package com.elysiam.restaurant_order_system.exception;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.elysiam.restaurant_order_system.pojo.dto.ResponseMessage;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    Logger logs = org.slf4j.LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class})
    public ResponseMessage HandleException(Exception e,HttpServletRequest request,HttpServletResponse response) {
        logs.error("[ERROR]", e);
        return new ResponseMessage(500, e.toString(),null);
    }

}
