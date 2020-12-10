package com.zzwtec.nacosdiscovery.feign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallbackFactory implements FallbackFactory<FeignServiceFallback> {
    @Override
    public FeignServiceFallback create(Throwable throwable) {
        return new FeignServiceFallback(throwable);
    }
}
