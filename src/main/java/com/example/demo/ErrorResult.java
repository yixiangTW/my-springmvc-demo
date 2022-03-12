package com.example.demo;

public class ErrorResult {
    private String message;

    public String getMessage() {
        return message;
    }

    public ErrorResult(String message) {
        this.message = message;
    }

    public ErrorResult() {
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
