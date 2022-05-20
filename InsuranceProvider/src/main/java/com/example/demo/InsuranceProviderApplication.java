package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/insurace-service")
public class InsuranceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

	@GetMapping("/getAllPlans")
	public List<String> getPlans(){
		return Stream.of("gold","platinum","silver").collect(Collectors.toList());
	}
}
