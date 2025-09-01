package com.tejast11.rest_start.controller;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus https;

    public CloudVendorException(String message, Throwable throwable, HttpStatus https) {
        this.message = message;
        this.throwable = throwable;
        this.https = https;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttps() {
        return https;
    }
}
