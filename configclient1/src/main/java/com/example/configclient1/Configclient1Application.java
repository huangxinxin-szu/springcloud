package com.example.configclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@SpringBootApplication
@RestController
public class Configclient1Application {

	@Value("${message:Hello default}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(Configclient1Application.class, args);
	}

	@GetMapping("/message")
	String getMessage() {
		return this.message;
	}

}
