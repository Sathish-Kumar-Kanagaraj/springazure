package com.sathish.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AzuredemoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(AzuredemoApplication.class, args);
	}
	

	@GetMapping("/message")
	public String message() {
		return "Congrats!azure deploy success";
	}

}
