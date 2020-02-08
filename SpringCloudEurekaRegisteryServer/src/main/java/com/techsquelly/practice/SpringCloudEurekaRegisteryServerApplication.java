package com.techsquelly.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaRegisteryServerApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringCloudEurekaRegisteryServerApplication.class, args);
	}

}
