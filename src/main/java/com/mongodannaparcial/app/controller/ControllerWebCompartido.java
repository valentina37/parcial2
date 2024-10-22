package com.mongodannaparcial.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWebCompartido {
	@GetMapping("/")
	public String compartidoIndexTemplate(Model model) {
		return "index-compartido";
	}
	
	
	
	
}
