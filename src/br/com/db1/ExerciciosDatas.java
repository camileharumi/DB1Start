package br.com.db1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExerciciosDatas {
	public Boolean anoBissexto(Integer ano) {
		if(ano % 4 == 0 && ano % 100 != 0) {
			return true;
		} else return false;
	}
	
	public Boolean diaUtil(String data) {
		
		String dia = data.substring(0, 2);
		String mes = data.substring(3, 5);
		String ano = data.substring(6, data.length());
		
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
		
		Integer diaSemana = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(diaSemana);
		if(diaSemana != 1 && diaSemana != 7) {
			return true;
		} else return false;
	}
	
	public Integer idadeDataNascimento() {
		
	}
	
	public Integer diasEntreDuasDatas() {
		
	}
	
	public Integer mesesEntreDuasDatas() {
		
	}
	
	public Integer anosEntreDuasDatas() {
		
	}
	
	public Double diferencaEntreDuasHoras() {
		
	}
}
