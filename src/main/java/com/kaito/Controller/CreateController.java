package com.kaito.Controller;

import com.alibaba.fastjson.JSONObject;
import com.kaito.OS.Character.MyThread;
import com.kaito.OS.System.SystemUtil;
import com.kaito.Resp.Resp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CreateController {
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String createThread(){
        MyThread myThread = SystemUtil.createMyThread();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pid",myThread.getPid());
        return Resp.OkOf(jsonObject);
    }
}
