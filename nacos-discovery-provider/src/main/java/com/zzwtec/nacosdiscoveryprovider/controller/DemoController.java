package com.zzwtec.nacosdiscoveryprovider.controller;

import com.zzwtec.nacosdiscovery.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements FeignService {
    @Value("${server.port}")
    private String port;

    @Override
    public String demo(@RequestBody String name){
        return "hello "+name + " @ "+port;
    }
}
