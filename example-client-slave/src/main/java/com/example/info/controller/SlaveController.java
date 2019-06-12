package com.example.info.controller;

import com.example.info.service.MasterClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by w景洋
 * on 2019/6/12
 */
@RestController
public class SlaveController {

    @Autowired
    MasterClientService masterClientService;

    @RequestMapping(value = "/rpc/slave",method = RequestMethod.GET)
    public String slave(){
        return "rpc slave";
    }

    @RequestMapping(value = "/rpc/master",method = RequestMethod.GET)
    public String master(){
        return masterClientService.master();
    }
}
