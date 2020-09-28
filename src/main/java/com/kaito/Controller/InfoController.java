package com.kaito.Controller;

import com.alibaba.fastjson.JSONObject;
import com.kaito.OS.System.MySystem;
import com.kaito.Resp.Resp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class InfoController {
    @RequestMapping(value = "/getInfo",method = RequestMethod.GET)
    public String getInfo(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("size",MySystem.getTotalSize());
        return Resp.OkOf(jsonObject);
    }
}
