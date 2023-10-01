package com.byron.authgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthGatewayApplication.class, args);
	}

}
