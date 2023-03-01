package com.microservicio.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServicio implements ICalculadoraServicio {

	@Override
	public Long calcula(Long primerNumero, Long segundoNumero, String operacion) {
		switch(operacion){
			case "+":
				return primerNumero + segundoNumero;
			case "-":
				return primerNumero + segundoNumero;
				default:
					throw new RuntimeException("Operacion no existente");
		}
	}

	
	
}
