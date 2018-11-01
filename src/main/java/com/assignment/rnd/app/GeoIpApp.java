package com.assignment.rnd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * This is the entry point of the application.
 * 
 * @author ashish.gupta
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = { "com.assignment.*" })
public class GeoIpApp {

	public static void main(String[] args) {
		SpringApplication.run(GeoIpApp.class, args);
	}

}
