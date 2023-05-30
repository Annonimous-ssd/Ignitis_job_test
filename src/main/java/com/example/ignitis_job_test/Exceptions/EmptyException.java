package com.example.ignitis_job_test.Exceptions;

public class EmptyException extends RuntimeException {
    public EmptyException(String message) {
        super(message);
    }

    public EmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
