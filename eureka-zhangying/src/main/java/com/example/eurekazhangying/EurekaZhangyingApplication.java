package com.example.eurekazhangying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaZhangyingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZhangyingApplication.class, args);
	}
}
