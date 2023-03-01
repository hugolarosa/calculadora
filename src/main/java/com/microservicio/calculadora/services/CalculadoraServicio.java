package com.microservicio.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServicio implements ICalculadoraServicio {

	@Override
	public Long calcula(Long primerNumero, Long segundoNumero, String operacion) {
		switch(operacion){
			case "suma":
				return primerNumero + segundoNumero;
			case "resta":
				return primerNumero - segundoNumero;
				default:
					throw new RuntimeException("Operacion no existente");
		}
	}

	
	
}
