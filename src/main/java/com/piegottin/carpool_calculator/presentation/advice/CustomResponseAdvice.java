package com.piegottin.carpool_calculator.presentation.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomResponseAdvice {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleException(Exception ex) {
        CustomResponse customResponse = new CustomResponse("error", ex.getMessage());
        return new ResponseEntity<>(customResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
