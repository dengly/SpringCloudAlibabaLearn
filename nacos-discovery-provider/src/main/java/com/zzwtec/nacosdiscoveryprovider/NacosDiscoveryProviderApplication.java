package com.zzwtec.nacosdiscoveryprovider;

import com.alibaba.cloud.sentinel.feign.SentinelFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringCloudApplication
@EnableFeignClients
public class NacosDiscoveryProviderApplication {

	@Bean
	@Scope("prototype")
	public SentinelFeign.Builder feignBuilder() {
		return SentinelFeign.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryProviderApplication.class, args);
	}

}
