package br.com.db1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExerciciosDatas {
	public Boolean anoBissexto(Integer ano) {
		if(ano % 4 == 0) {
			return true;
		} else return false;
	}
	
	public Boolean diaUtil(String data) {
		
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		Integer dia = c.get(Calendar.DAY_OF_WEEK);
		if(dia > 0 && dia < 7) {
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
