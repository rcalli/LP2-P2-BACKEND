package com.example.sysmat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

	@GetMapping
	public String index() {
		return "Bienvenido al Proyecto CASO";
	}
}



