package com.kaito.Controller;

import com.alibaba.fastjson.JSONObject;
import com.kaito.Resp.Resp;
import com.kaito.Service.ReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ReceiveController {
    @Autowired
    ReceiveService receiveService;
    @RequestMapping(value = "/receive",method = RequestMethod.POST)
    public String receive(@RequestParam(name = "receiver_pid") int receiver_pid){
        receiveService.receive(receiver_pid);

        String msg = receiveService.getMsg(receiver_pid);
        int s_id = receiveService.getSenderId(receiver_pid);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",msg);
        jsonObject.put("s_id",s_id);
        return Resp.OkOf(jsonObject);
    }
}
