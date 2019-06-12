package com.example.info.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "example-client-slave",fallbackFactory = HystrixClientFallbackFactory.class)
public interface SlaveClientService {
    @RequestMapping(method = RequestMethod.GET,value = "/rpc/slave")
    String slave();
}
