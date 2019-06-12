package com.example.info.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "example-client",fallbackFactory = HystrixClientFallbackFactory.class)
public interface MasterClientService {
    @RequestMapping(method = RequestMethod.GET,value = "/rpc/master")
    String master();
}
