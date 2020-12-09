package com.zzwtec.nacosdiscoveryprovider;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@EnableDiscoveryClient
@SpringCloudApplication
@EnableFeignClients
public class NacosDiscoveryProviderApplication {

	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryProviderApplication.class, args);
	}

}
