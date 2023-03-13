package com.spring.testCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestCicdApplication {


	@GetMapping(path = "/welcome/{name}")
	public String welcome(@PathVariable String name){
		return "welcome to my home "+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestCicdApplication.class, args);
	}

}
