package com.emre.springbootrest.exception;

public class IlAlreadyExistsException extends RuntimeException {
    public IlAlreadyExistsException(String msg) {
        super(msg);
    }
}