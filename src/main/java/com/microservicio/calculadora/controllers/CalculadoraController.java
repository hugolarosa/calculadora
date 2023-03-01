package com.microservicio.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.calculadora.services.ICalculadoraServicio;

@RestController
@RequestMapping("/api")
public class CalculadoraController {
	
	@Autowired
	ICalculadoraServicio calculadoraServicio;
	

	@GetMapping("/calcula")
	public Long calcula(@RequestParam(name = "primerNumero") Long primerNumero,
			@RequestParam(name = "segundoNumero") Long segundoNumero,
			@RequestParam(name = "operacion") String operacion) {
		
		return calculadoraServicio.calcula(primerNumero, segundoNumero, operacion);
		
	}
	
}
