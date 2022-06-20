package com.food.paytm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PaytmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmApplication.class, args);
	}

	@Bean
	public RestTemplate getInstanceRestTemplate() {
		return new RestTemplate();
	}
}
