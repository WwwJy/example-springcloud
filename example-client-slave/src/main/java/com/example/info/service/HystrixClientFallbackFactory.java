package com.example.info.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<MasterClientService> {


    @Override
    public MasterClientService create(Throwable throwable) {
        return new MasterClientService() {
            @Override
            public String master() {
                return "连接超时: " + throwable.getMessage();
            }
        };
    }
}
