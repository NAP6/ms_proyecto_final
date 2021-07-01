package com.proyecto.registyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistyServerApplication.class, args);
	}

}
