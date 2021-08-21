package com.eventoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.eventoapp.controllers"})
public class EventoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoAppApplication.class, args);
	}

}
