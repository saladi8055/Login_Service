package com.scb.pod2.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.Generated;

@SpringBootApplication
@EnableDiscoveryClient
public class LoginServiceApplication {

	@Generated
	public static void main(String[] args) {
		SpringApplication.run(LoginServiceApplication.class, args);
	}

}
