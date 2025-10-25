package com.jsbprojs.hello_world.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.err.println("http://localhost:8080/");
	}

	@GetMapping("/")
	public String index() {
		return "index Page";
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	
}
