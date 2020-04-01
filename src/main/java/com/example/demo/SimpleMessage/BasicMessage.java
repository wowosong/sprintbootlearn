package com.example.demo.SimpleMessage;

//import com.hanboard.educloud.framework.web.enumeration.IMessageCodeEnum;
import com.example.demo.SimpleMessage.IMessageCodeEnum;
public  abstract class BasicMessage {
    private Object data;
    private String message;
    private IMessageCodeEnum code;

    public BasicMessage() {
    }

    public BasicMessage(IMessageCodeEnum code) {
        this.code = code;
        this.data = "";
        this.message = (String)code.getValue();
    }

    public BasicMessage(IMessageCodeEnum code, Object data) {
        this.code = code;
        this.data = data;
        this.message = (String)code.getValue();
    }

    public BasicMessage(IMessageCodeEnum code, String message) {
        this.code = code;
        this.data = "";
        this.message = message;
    }

    public BasicMessage(IMessageCodeEnum code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return (Integer)this.code.getKey();
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return this.message;
    }
}
