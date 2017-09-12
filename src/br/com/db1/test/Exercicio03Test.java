package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.exercicio03.Calculadora;

public class Exercicio03Test {
	
	private Calculadora calc = new Calculadora();
	
	@Before
	public void before() {
		calc.zerarCalculo();
		System.out.println("Rodou 1 teste");		
	}
	
	@After
	public void after() {		
		System.out.println("Resultado: " + calc.exibirResultado());		
		System.out.println("Finalizou 1 teste");
		System.out.println("");
	}
	
	@Test
	public void zerarCalculoTest() {
		calc.zerarCalculo();		
		Assert.assertTrue(calc.exibirResultado() == 0);
	}
	
	@Test
	public void somarTest() {
		calc.somar(2d, 4d);		
		Assert.assertTrue(calc.exibirResultado() == 6d);
	}
	
	@Test
	public void subtrairTest() {
		calc.subtrair(5d, 3d);		
		Assert.assertTrue(calc.exibirResultado() == 2d);
	}
	
	@Test
	public void dividirTest() {
		calc.dividir(6d, 2d);		
		Assert.assertTrue(calc.exibirResultado() == 3d);
	}
	
	@Test
	public void multiplicarTest() {
		calc.multiplicar(2d, 5d);		
		Assert.assertTrue(calc.exibirResultado() == 10d);
	}
}
