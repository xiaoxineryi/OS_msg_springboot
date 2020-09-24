package com.kaito.Error;

public class CustomerException extends RuntimeException{
    private Integer code;
    private String errorMsg;
    public CustomerException(Integer code,String errorMsg){
        this.code = code;
        this.errorMsg = errorMsg;
    }
    public CustomerException(ICustomerError iCustomerError){
        this.code = iCustomerError.getCode();
        this.errorMsg = iCustomerError.getErrorMsg();
    }
    public Integer getCode() {
        return code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
