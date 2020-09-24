package com.kaito.Resp;

import com.alibaba.fastjson.JSONObject;
import com.kaito.Error.CustomerError;
import com.kaito.Error.CustomerException;

public class Resp {
    public static String OkOf(Object object){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("errorMsg","");
        jsonObject.put("data",object);
        return jsonObject.toString();
    }

    public static String ErrorOf(CustomerError customerError){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",customerError.getCode());
        jsonObject.put("errorMsg",customerError.getErrorMsg());
        return jsonObject.toString();
    }

    public static String ErrorOf(CustomerException customerException){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",customerException.getCode());
        jsonObject.put("errorMsg",customerException.getErrorMsg());
        return jsonObject.toString();
    }
}
