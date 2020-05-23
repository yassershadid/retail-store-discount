package com.retail.store.discount.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.retail.store.discount.api.response.ApiErrorResponse;
import com.retail.store.discount.service.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(value = IllegalArgumentException.class)
  public ResponseEntity<ApiErrorResponse> invalidInput(IllegalArgumentException exception) throws JsonProcessingException {
    final ApiErrorResponse apiErrorResponse = new ApiErrorResponse(HttpStatus.BAD_REQUEST.name(),
        HttpStatus.BAD_REQUEST.value(),
        exception.getMessage(),
        new Date());

    return new ResponseEntity<ApiErrorResponse>(apiErrorResponse, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = ServiceException.class)
  public ResponseEntity<ApiErrorResponse> serviceException(ServiceException exception) throws JsonProcessingException {
    final ApiErrorResponse apiErrorResponse = new ApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.name(),
        HttpStatus.INTERNAL_SERVER_ERROR.value(),
        exception.getMessage(),
        new Date());

    return new ResponseEntity<ApiErrorResponse>(apiErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
