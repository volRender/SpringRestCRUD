package com.litvishko.spring.rest_crud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandling {
    @ExceptionHandler
    public ResponseEntity<EmployeeGetExceptionInfo> notHaveANeededEmployeeHandlingException
            (NotHaveAnEmployeeException exception) {

        EmployeeGetExceptionInfo info = new EmployeeGetExceptionInfo();
        info.setInfo(exception.getMessage());

        return new ResponseEntity<>(info, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeGetExceptionInfo> notHaveANeededEmployeeHandlingException
            (Exception exception) {

        EmployeeGetExceptionInfo info = new EmployeeGetExceptionInfo();
        info.setInfo(exception.getMessage());

        return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
    }
}
