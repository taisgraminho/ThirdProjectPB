package com.CompassChallenge.consumeExternalApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumeExternalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeExternalApiApplication.class, args);
	}

}
