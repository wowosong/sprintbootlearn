package com.example.demo.exceptionT;

public class ErrorResponseEntity {
    public ErrorResponseEntity(String message,int code){
        this.code=code;
        this.message=message;
    }
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
