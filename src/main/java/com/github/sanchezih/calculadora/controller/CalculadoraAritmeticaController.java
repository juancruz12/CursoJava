package com.github.sanchezih.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aritmetica")
public class CalculadoraAritmeticaController {

	public CalculadoraAritmeticaController() {
	}

	@RequestMapping(value = "/sumar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Integer sumar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {
		return operando1 + operando2;
	}

	@RequestMapping(value = "/multiplicar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Integer multiplicar(@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {
		return operando1 * operando2;
	}
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "operando1"})
	public Integer factorial(@RequestParam("operando1") Integer operando1) {
		int factorial = 1;
		int counter = operando1;
		while (counter != 1) {
			factorial = factorial * counter;
			counter -= 1;
		}
		return factorial;
	}
	@RequestMapping(value = "/raiz", method = RequestMethod.GET, params = { "operando1"})
	public double raiz(@RequestParam("operando1") Integer operando1) {
		return Math.sqrt(operando1);
	}
	@RequestMapping(value = "/esPrimo", method = RequestMethod.GET, params = { "operando1"})
	public boolean esPrimo(@RequestParam("operando1") Integer operando1) {
		if (operando1 == 0 || operando1 == 1 || operando1 == 4) {
		    return false;
		  }
		  for (int x = 2; x < operando1 / 2; x++) {
		    if (operando1 % x == 0)
		      return false;
		  }
		  return true;
	}
	

}