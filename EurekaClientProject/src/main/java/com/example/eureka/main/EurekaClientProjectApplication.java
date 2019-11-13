package com.example.eureka.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient

public class EurekaClientProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProjectApplication.class, args);
	}
	@Value("${spring.application.name}")
	public String name;
	@RequestMapping("/")
	public String name() {
		return name;
	}

}
