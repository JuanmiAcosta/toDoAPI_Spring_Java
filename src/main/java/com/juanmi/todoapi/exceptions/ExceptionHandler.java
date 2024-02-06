package com.juanmi.todoapi.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice // Ayuda al controlador a manejar las excepciones
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ToDoExceptions.class})
    protected ResponseEntity<Object> handleConflict (ToDoExceptions ex, WebRequest request){
        String bodyOfResponse = ex.getMessage();
        return handleExceptionInternal ( ex, bodyOfResponse, new HttpHeaders(), ex.getHttpStatus(), request);
    }
}
