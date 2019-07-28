package com.port.datauser.controller;

import com.port.datauser.util.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Autowired
    FeignService feignService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return feignService.hello();
    }


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "success";
    }

}
