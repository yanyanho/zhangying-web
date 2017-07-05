package com.example.gatwayzhangying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatwayZhangyingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatwayZhangyingApplication.class, args);
	}
}
