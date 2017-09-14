package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDatas;

public class ExerciciosDatasTest {

	ExerciciosDatas exDatas = new ExerciciosDatas();
	
	@Test
	public void anoBissextoTest() {
		Assert.assertTrue(exDatas.anoBissexto(2016));
	}
	
	@Test
	public void diaUtilTest() {
		Assert.assertTrue(exDatas.diaUtil("16/09/2017"));
	}
	
	@Test
	public void idadeDataNascimentoTest() {
		
	}
	
	@Test
	public void diasEntreDuasDatasTest() {
		
	}
	
	@Test
	public void mesesEntreDuasDatasTest() {
		
	}
	
	@Test
	public void anosEntreDuasDatasTest() {
		
	}
	
	@Test
	public void diferencaEntreDuasHorasTest() {
		
	}
}
