package com.pineapple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.pineapple.*")
@SpringBootApplication( exclude = {SecurityAutoConfiguration.class} ,scanBasePackages = "com.pineapple.*")
public class PineappleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PineappleApplication.class, args);
	}

}
