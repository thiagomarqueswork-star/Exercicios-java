package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void test() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0, 1.0), "Deve resultar 2");
	}
	
	void sub() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.sub(1.0, 1.0), "Deve resultar 2");
	}
	
	void mult() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.mult(1.0, 1.0), "Deve resultar 2");
	}
	
	void divisao() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.div(1.0, 1.0), "Deve resultar 2");
	}
	
	void potencia() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.poten(1.0, 1.0), "Deve resultar 2");
	}

}
