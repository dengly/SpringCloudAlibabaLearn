package com.zzwtec.nacosdiscoveryconsumer.controller;

import com.zzwtec.nacosdiscovery.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class DemoController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/test")
    public String demo(String name){
        return feignService.demo(name);
    }
}
