package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosInteger {
	
	public Double somar(Double valor1, Double valor2) {
		return valor1 + valor2;
	}
	
	public Double subtrair(Double valor1, Double valor2) {
		return valor1 - valor2;
	}
	
	public Double multiplicar(Double valor1, Double valor2) {
		return valor1*valor2;
	}
	
	public Double dividir(Double valor1, Double valor2) {
		return valor1/valor2;
	}	
	
	public Boolean verificarPar(Integer valor) {
		if (valor%2 == 0) {
			return true;
		} else
			return false;
	}
	
	public Integer maiorNumero(Integer valor1, Integer valor2) {
		if(valor1 > valor2) {
			return valor1;
		} else {
			return valor2;
		}
	}
	
	public List<Integer> mostrarImpares(Integer valor) {
		List<Integer> valores = new ArrayList<Integer>();
		
		for (Integer x = valor; x<=100; x++) {
			if(x%2 != 0) {			
				valores.add(x);
			}
		}
		return valores;
	}
}
