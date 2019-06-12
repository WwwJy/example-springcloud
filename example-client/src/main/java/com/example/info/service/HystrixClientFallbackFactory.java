package com.example.info.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<SlaveClientService> {


    @Override
    public SlaveClientService create(Throwable throwable) {
        return new SlaveClientService() {
            @Override
            public String slave() {
                return "连接超时: " + throwable.getMessage();
            }
        };
    }
}
