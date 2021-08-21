package com.eventoApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoControllers {
	
	@RequestMapping("/cadastroEvento")
	public String form() {
		return "evento/formEvento"; 
		
	}
}
