package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	private ExerciciosString exString = new ExerciciosString();
	
	@Test
	public void devolverMaiusculasTest() {
		Assert.assertEquals("CACHORRO", exString.devolverMaiusculas("cachorro"));
	}
	
	@Test
	public void devolverMinusculasTest() {
		Assert.assertEquals("gato", exString.devolverMinusculas("GaTo"));
	}
	
	@Test
	public void retornarQuantidadeLetrasTest() {
		Assert.assertTrue(exString.retornarQuantidadeLetras("DB1START") == 8);
	}
	
	@Test
	public void retornarQuantidadeComEspacoTest() {
		Assert.assertTrue(exString.retornarQuantidadeComEspaco(" DB1START ") == 10);
	}
	
	@Test
	public void retornarMesmaQuantidadeTest() {
		Assert.assertTrue(exString.retornarQuantidadeLetras("DB1START") == 8);
	}
	
	@Test
	public void retornarQuatroPrimeirasLetrasTest() {
		Assert.assertEquals("Cami", exString.retornarQuatroPrimeirasLetras("Camile Harumi Aoto Prado"));
	}
	
	@Test
	public void retornarAPartirTerceiraLetraTest() {
		Assert.assertEquals("mile Harumi Aoto Prado", exString.retornarAPartirTerceiraLetra("Camile Harumi Aoto Prado"));
	}
	
	@Test
	public void retornarUltimasQuatroLetrasTest() {
		Assert.assertEquals("rado", exString.retornarUltimasQuatroLetras("Camile Harumi Aoto Prado"));
	}
	
	@Test
	public void substituirAlunaNomeTest() {
		Assert.assertEquals("ALUNA Harumi Aoto Prado", exString.substituirAlunaNome("Camile Harumi Aoto Prado"));
	}
	
	@Test
	public void exibirTextoSeparadoTest() {
		Assert.assertEquals("banana maçã melancia", exString.exibirTextoSeparado("banana, maçã, melancia"));
	}
	
	@Test
	public void exibirVogaisTest() {
		Assert.assertTrue(exString.exibirVogais("bola") == 2);
	}
	
	@Test
	public void retornarTextoInvertidoTest() {
		Assert.assertEquals("asac", exString.retornarTextoInvertido("casa"));
	}
}
