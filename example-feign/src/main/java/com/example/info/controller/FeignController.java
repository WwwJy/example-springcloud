package com.example.info.controller;

import com.example.info.service.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    ExampleClient example;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return example.helloCloud();
    }
}
