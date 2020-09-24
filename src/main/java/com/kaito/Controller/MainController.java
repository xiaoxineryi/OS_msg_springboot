package com.kaito.Controller;


import com.kaito.Error.CustomerError;
import com.kaito.Resp.Resp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String main(){
        return Resp.ErrorOf(CustomerError.NO_RECEIVER);
    }
}
