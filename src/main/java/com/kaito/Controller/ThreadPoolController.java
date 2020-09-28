package com.kaito.Controller;

import com.alibaba.fastjson.JSONObject;
import com.kaito.OS.System.MySystem;
import com.kaito.Resp.Resp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadPoolController {
    @RequestMapping(value = "/getThreadPool",method = RequestMethod.GET)
    public String getThreadPool(){
        int free_total = MySystem.getfreeTotal();
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("free_total",free_total);
        return Resp.OkOf(jsonObject);
    }
}
