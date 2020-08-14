package com.reactlibrary;

public class ErrorData {

    private final String code;
    private final String message;

    public ErrorData(String code, String message) {

        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
