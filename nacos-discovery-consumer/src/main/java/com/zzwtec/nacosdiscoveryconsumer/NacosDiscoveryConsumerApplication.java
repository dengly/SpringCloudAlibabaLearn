package com.zzwtec.nacosdiscoveryconsumer;

import com.zzwtec.nacosdiscovery.feign.service.FeignServiceFallback;
import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@EnableDiscoveryClient
@SpringCloudApplication
@EnableFeignClients(basePackages = {
		"com.zzwtec.nacosdiscovery.feign.service"
})
public class NacosDiscoveryConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryConsumerApplication.class, args);
	}

	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}

	@Bean
	public FeignServiceFallback feignServiceFallback(){
		return new FeignServiceFallback();
	}
}
