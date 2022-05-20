package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
public class InsuranceClientApplication {

	
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientApplication.class, args);
		
		
	}

	
}
