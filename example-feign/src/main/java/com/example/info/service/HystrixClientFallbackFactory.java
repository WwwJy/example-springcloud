package com.example.info.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<ExampleClient> {


    @Override
    public ExampleClient create(Throwable throwable) {
        return new ExampleClient() {
            @Override
            public String helloCloud() {
                return "连接超时: " + throwable.getMessage();
            }
        };
    }
}
