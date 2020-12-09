package com.zzwtec.nacosdiscovery.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="nacos-discovery-provider", fallback = FeignServiceFallback.class)
@RequestMapping("nacos-discovery-provider")
public interface FeignService {
    @RequestMapping(value = "demo", method = RequestMethod.POST)
    public String demo(@RequestBody String name);
}
