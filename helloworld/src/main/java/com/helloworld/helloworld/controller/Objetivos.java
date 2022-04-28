package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class Objetivos {
	@GetMapping
	public String objetivos () {
		return "Aprender de ponta a ponta como funciona um projeto, tirar todas as dúvidas sobre Spring Boot e manter a persistência.";
	}

}
