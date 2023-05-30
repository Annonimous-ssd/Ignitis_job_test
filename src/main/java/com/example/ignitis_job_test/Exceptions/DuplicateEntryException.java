package com.example.ignitis_job_test.Exceptions;

public class DuplicateEntryException extends RuntimeException {
    public DuplicateEntryException(String message) {
        super(message);
    }

    public DuplicateEntryException(String message, Throwable cause) {
        super(message, cause);
    }
}
