package com.cove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cove")
public class CodeCoveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeCoveApplication.class, args);
	}

}
