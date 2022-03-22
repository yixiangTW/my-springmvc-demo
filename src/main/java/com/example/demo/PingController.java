package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class PingController {

    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String port() {
        return port;
    }
}
