package com.kaito.Controller;

import com.kaito.Error.CustomerError;
import com.kaito.Resp.Resp;
import com.kaito.Service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class SendController {

    @Autowired
    SendService sendService;
    @RequestMapping(value = "/send",method = RequestMethod.POST)
    public String send(@RequestParam(name = "sender_pid") int sender_pid,
                       @RequestParam(name = "receiver_pid") int receiver_pid,
                       @RequestParam(name = "msg") String msg){
        if (sendService.hasReceiver(receiver_pid)){
            sendService.send(sender_pid,receiver_pid,msg);
            return Resp.OkOf(null);
        }else{
            return Resp.ErrorOf(CustomerError.NO_RECEIVER);
        }
    }
}
