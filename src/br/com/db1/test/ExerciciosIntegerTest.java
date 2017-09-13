package br.com.db1.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {
	private ExerciciosInteger exInteger = new ExerciciosInteger();
	
	@Test
	public void somarTest() {
		Double tmp = 7d;
		Assert.assertEquals(tmp, exInteger.somar(5d, 2d));
	}
	
	@Test
	public void subtrairTest() {
		Assert.assertTrue(exInteger.subtrair(6d, 2d) == 4d);
	}
	
	@Test
	public void multiplicarTest() {
		Assert.assertTrue(exInteger.multiplicar(2d, 5d) == 10d);
	}
	
	@Test
	public void dividirTest() {
		Assert.assertTrue(exInteger.dividir(10d, 5d) == 2d);
	}
	
	@Test
	public void verificarParTest() {
		Assert.assertTrue(exInteger.verificarPar(4));
	}
	
	@Test
	public void verificarMaiorNumeroTest() {
		Assert.assertTrue(exInteger.maiorNumero(10, 5) == 10);
	}
	
	@Test
	public void mostrarImparesTest() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(95);
		expected.add(97);
		expected.add(99);
		Assert.assertEquals(expected,exInteger.mostrarImpares(95));
	}
}
