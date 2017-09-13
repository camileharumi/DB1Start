package br.com.db1.test;

import java.util.ArrayList;

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
		//Assert.assertTrue(exInteger.mostrarImpares(95) == 3);
		//ArrayList<Integer> expected = new ArrayList<>(95,97,99);
		//Assert.assertArrayEquals(exInteger.mostrarImpares(95), expected);
		//assertEquals(Arrays.asList(95, 97, 99), exInteger.mostrarImpares(95));
	}
}
