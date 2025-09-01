package com.tejast11.rest_start.controller;

import com.tejast11.rest_start.exception.CloudVendorNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {
    @ExceptionHandler(value = {CloudVendorNotFound.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(CloudVendorNotFound cloudVendorNotFound){
        CloudVendorException cloudVendorException = new CloudVendorException(cloudVendorNotFound.getMessage(),
                cloudVendorNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }
}
