package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class RestapicrudApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
	 return application.sources(RestapicrudApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(RestapicrudApplication.class, args);
	}

}

