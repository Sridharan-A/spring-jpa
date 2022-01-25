package com.student.exception;

import com.student.core.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException exception) {
        ErrorDetails errorDetails = new ErrorDetails("Student not found", exception.getMessage());
        return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<String> handleExceptionMethodNotSupported(HttpRequestMethodNotSupportedException exception) {
        ErrorDetails errorDetails = new ErrorDetails("Operation cannot be performed with given data", exception.getMessage());
        return new ResponseEntity(errorDetails, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<String> handleInvalidInputException(InvalidInputException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exception) {
        ErrorDetails errorDetails = new ErrorDetails("Internal Error", exception.getMessage());
        return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
