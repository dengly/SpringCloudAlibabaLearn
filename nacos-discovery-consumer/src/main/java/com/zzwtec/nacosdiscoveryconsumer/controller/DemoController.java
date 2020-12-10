package com.zzwtec.nacosdiscoveryconsumer.controller;

import com.zzwtec.nacosdiscovery.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("api")
public class DemoController {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String test(@RequestParam("name") String name){
        return feignService.demo(name);
    }

    @GetMapping("testGet")
    public String testGet(String name){
        return feignService.demo(name);
    }
}
