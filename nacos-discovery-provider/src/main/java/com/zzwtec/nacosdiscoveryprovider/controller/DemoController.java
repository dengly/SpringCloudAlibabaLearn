package com.zzwtec.nacosdiscoveryprovider.controller;

import com.zzwtec.nacosdiscovery.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController implements FeignService {
    @Value("${server.port}")
    private String port;

    @Value("${user.name:空}")
    private String userName;

    @GetMapping("getConfigInfo")
    public String getConfig(){
        return userName;
    }

    @Override
    public String demo(@RequestBody String name){
        return "hello "+name + " @ "+port;
    }
}
