package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class DemoDocker2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDocker2Application.class, args);
	}
	
	public String welcomeGreetings() {
		return "welcome to spring boot docker with out dockerfile..........";
	}

}
