package com.uni.turno.exception;

public class TurnoNotFoundException extends RuntimeException {
    public TurnoNotFoundException(String message) {
        super(message);
    }
}