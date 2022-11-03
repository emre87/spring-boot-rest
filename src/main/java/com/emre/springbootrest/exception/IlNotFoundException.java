package com.emre.springbootrest.exception;

public class IlNotFoundException extends RuntimeException{
    public IlNotFoundException(String msg) {
        super(msg);
    }
}
