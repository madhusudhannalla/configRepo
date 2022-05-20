package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Rest {

	@Autowired
	//@Lazy
	private RestTemplate rest;
	
	@Value("${insuranceProviderUrl}")
	private String insuranceProviderUrl;
	
	
	@Value("${hai}")
	private String hai;
	
	
	
	@GetMapping("/getPlans")
	public List<String> getAllPlans(){
		
		
		System.out.println("hai");
		System.out.println(hai);
		System.out.println(insuranceProviderUrl);
		List<String> list=rest.getForObject(insuranceProviderUrl, List.class);
		
		return list;
	}
	
}
