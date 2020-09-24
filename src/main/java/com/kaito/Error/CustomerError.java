package com.kaito.Error;

public enum CustomerError implements ICustomerError{
    NO_RECEIVER(201,"找不到对应接收者");

    Integer code;
    String errorMsg;

    CustomerError(Integer code,String message){
        this.code = code;
        this.errorMsg = message;
    }
    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }
}
