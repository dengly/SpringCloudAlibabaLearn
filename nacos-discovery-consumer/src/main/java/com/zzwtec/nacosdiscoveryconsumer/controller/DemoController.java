package com.zzwtec.nacosdiscoveryconsumer.controller;

import com.zzwtec.nacosdiscovery.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("api")
public class DemoController {
    @Autowired
    private FeignService feignService;

    // 注入配置文件上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("getConfigInfo")
    public String getConfig(){
        return applicationContext.getEnvironment().getProperty("user.name");
    }

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String test(@RequestParam("name") String name){
        return feignService.demo(name);
    }

    @GetMapping("testGet")
    public String testGet(String name){
        return feignService.demo(name);
    }
}
