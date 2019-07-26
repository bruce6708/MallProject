package com.qm.common.enums;
public enum Status {
    GOOD(200),          //请求成功
    NOT_FOUND(404),     //未找到页面
    BAD(500);           //  服务器异常
    private Integer value;
    private Status(int value){
        this.value = value;
    }
    public Integer getValue(){
        return this.value;
    }

}
