package com.api.WorkoutApp.exception;

import lombok.Data;

@Data
public class ErrorObject {
    private Integer statusCode;
    private String message;
}
