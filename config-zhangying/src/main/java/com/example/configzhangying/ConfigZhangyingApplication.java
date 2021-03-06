package com.example.configzhangying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableConfigServer
public class ConfigZhangyingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigZhangyingApplication.class, args);
	}
}
