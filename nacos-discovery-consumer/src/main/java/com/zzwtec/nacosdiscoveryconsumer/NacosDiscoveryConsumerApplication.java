package com.zzwtec.nacosdiscoveryconsumer;

import com.alibaba.cloud.sentinel.feign.SentinelFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

// 这里必须要配置接口模块包 和 本模块包
@SpringBootApplication(scanBasePackages = {
		"com.zzwtec.nacosdiscovery.feign.service",
		"com.zzwtec.nacosdiscoveryconsumer.controller"
})
@SpringCloudApplication
@EnableFeignClients(basePackages = {"com.zzwtec.nacosdiscovery.feign.service"})
public class NacosDiscoveryConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryConsumerApplication.class, args);
	}

	@Bean
	@Scope("prototype")
	public SentinelFeign.Builder feignBuilder() {
		return SentinelFeign.builder();
	}

}
