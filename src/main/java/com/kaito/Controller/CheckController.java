package com.kaito.Controller;

import com.alibaba.fastjson.JSONObject;
import com.kaito.Resp.Resp;
import com.kaito.Service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @Autowired
    CheckService checkService;

    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public String check(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("urgent_wait_queue",checkService.getUrgent());
        jsonObject.put("ready_queue",checkService.getReady());
        jsonObject.put("temp",checkService.getTemp());
        return Resp.OkOf(jsonObject);
    }
}
