package com.georgialamni.exception;

public class GuestNotFoundException extends RuntimeException {

    public GuestNotFoundException(String s) {
        super(s);
    }
}
