package com.example.demo.SimpleMessage;

import com.example.demo.SimpleMessage.IEnum;

/**
 * 消息级别枚举
 *
 * @author nibo
 */
public enum MessageLevel implements IEnum<String, String> {
    /**
     * 普通消息
     */
    INFO("info", "普通消息"),
    /**
     * 警告消息
     */
    WARN("warn", "警告消息"),
    /**
     * 失败消息
     */
    FAIL("fail", "失败消息");

    private String key;
    private String value;

    MessageLevel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}

