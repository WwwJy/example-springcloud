package com.example.info.controller;

import com.example.info.service.SlaveClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCloudController {

    @Autowired
    SlaveClientService slaveClientService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloCloud(){
        return "hello SpringCloud !";
    }

    @RequestMapping(value = "/rpc/slave",method = RequestMethod.GET)
    public String slave(){
        return slaveClientService.slave();
    }

    @RequestMapping(value = "/rpc/master",method = RequestMethod.GET)
    public String master(){
        return "rpc master response";
    }
}
