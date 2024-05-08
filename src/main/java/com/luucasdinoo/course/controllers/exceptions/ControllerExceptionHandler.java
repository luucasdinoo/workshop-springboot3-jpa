package com.luucasdinoo.course.controllers.exceptions;

import com.luucasdinoo.course.services.exceptions.ResourceNotFountException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFountException.class)
    public ResponseEntity<StandardError> controllerNotFound(ResourceNotFountException e, HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus status =HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
