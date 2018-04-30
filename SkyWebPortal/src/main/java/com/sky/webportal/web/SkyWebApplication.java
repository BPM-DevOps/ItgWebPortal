package com.sky.webportal.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration (exclude=HibernateJpaAutoConfiguration.class)
@ComponentScan("com.sky.webportal.web")
public class SkyWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyWebApplication.class, args);
	}
}
