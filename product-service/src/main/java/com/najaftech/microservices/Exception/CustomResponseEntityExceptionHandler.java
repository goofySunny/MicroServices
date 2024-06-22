package com.najaftech.microservices.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.najaftech.microservices.Model.ErrorResponse;


@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest req) {
        ErrorResponse err = ErrorResponse.builder()
            .description(req.getDescription(false))
            .errorMessage(ex.getMessage())
            .timestamp(LocalDateTime.now())
            .build();
        return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProductServiceException.class)
    public ResponseEntity<Object>  handleProductServiceException(Exception ex, WebRequest req) {
        ErrorResponse err = ErrorResponse.builder()
        .description(req.getDescription(false))
        .errorMessage(ex.getMessage())
        .timestamp(LocalDateTime.now())
        .build();
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

}
