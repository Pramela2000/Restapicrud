package com.example.controller;

import org.springframework.validation.FieldError;
import java.util.List;

public class ValidationException extends RuntimeException {
    private final List<FieldError> fieldErrors;

    public ValidationException(List<FieldError> fieldErrors) {
        super("Validation failed for " + fieldErrors.size() + " fields");
        this.fieldErrors = fieldErrors;
    }

    public List<FieldError> getFieldErrors() {
        return fieldErrors;
    }
}

