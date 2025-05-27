package com.patriot.multiauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
	public class MultiAuthMethodSystemApplication {

	public static void main(String[] args) {
		System.out.println("Starting MultiAuthMethodSystemApplication...");
		SpringApplication.run(MultiAuthMethodSystemApplication.class, args);
	}

}
