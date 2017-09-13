package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosMatematica;

public class ExerciciosMatematicaTest {
	ExerciciosMatematica exMat = new ExerciciosMatematica();
	
	@Test
	public void menorDoisDoublesTest() {
		Assert.assertTrue(exMat.menorDoisDoubles(5d, 2d) == 2d);
	}
	
	@Test
	public void menorTresDoublesTest() {
		Assert.assertTrue(exMat.menorTresDoubles(6d, 8d, 3d) == 3d);
	}
	
	@Test
	public void mediaTresNumerosTest() {
		Assert.assertTrue(exMat.mediaTresNumeros(4d, 4d, 4d) == 4d);
	}
	
	@Test
	public void areaTrianguloTest() {
		Assert.assertTrue(exMat.areaTriangulo(4d, 4d) == 8d);
	}
}
