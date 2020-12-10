package com.zzwtec.nacosdiscovery.feign.service;

public class FeignServiceFallback implements FeignService {
    private Throwable throwable;

    FeignServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String demo(String name) {
        return "调用失败 "  + throwable.getMessage();
    }
}
