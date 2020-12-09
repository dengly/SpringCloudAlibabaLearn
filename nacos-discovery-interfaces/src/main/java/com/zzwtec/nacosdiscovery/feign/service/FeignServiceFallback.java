package com.zzwtec.nacosdiscovery.feign.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("FeignServiceFallback")
public class FeignServiceFallback implements FeignService {
    @Override
    public String demo(@RequestParam("name") String name) {
        return "调用失败";
    }
}
