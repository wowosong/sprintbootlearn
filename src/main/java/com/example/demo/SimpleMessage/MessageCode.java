package com.example.demo.SimpleMessage;

//import com.hanboard.educloud.framework.web.enumeration.IMessageCodeEnum;
import com.example.demo.SimpleMessage.IMessageCodeEnum;


/**
 * 基础消息 code 枚举
 *
 * @author nibo
 */
public enum MessageCode implements IMessageCodeEnum {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),
    /**
     * 普通错误，泛指未成功
     */
    NORMAL_ERROR(1, "普通错误"),

    // region==================系统级错误code==================
    /**
     * 系统异常
     */
    SYS_ERROR(10000, "系统异常"),

    // endregion

    // region==================业务级错误code===================
    /**
     * 业务异常
     */
    SERVICE_ERROR(20000, "业务异常"),

    // region==================oauth2认证级错误code===================
    /**
     *认证异常
     */
    OAUTH_ERROR(20001,"认证异常");
    // endregion

    private Integer key;
    private String value;

    MessageCode(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
