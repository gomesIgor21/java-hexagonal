package com.hexagonal.adapters.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiResponseError> buildError(IllegalArgumentException ex, HttpServletRequest req) {
        var status = HttpStatus.BAD_REQUEST;
        var body = new ApiResponseError(
                Instant.now(),
                status.value(),
                ex.getMessage(), req.getRequestURI()
        );
        return ResponseEntity.status(status).body(body);
    }
}
