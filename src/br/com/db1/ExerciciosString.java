package br.com.db1;

public class ExerciciosString {

	public String devolverMaiusculas(String texto) {
		return texto.toUpperCase();
	}
	
	public String devolverMinusculas(String texto) {
		return texto.toLowerCase();
	}
	
	public Integer retornarQuantidadeLetras(String texto) {
		return texto.length();
	}
	
	public Integer retornarQuantidadeComEspaco(String texto) {
		return texto.length();
	}
	
	public Integer retornarMesmaQuantidade(String texto) {
		if(texto.contains(" ")) {
			texto.replaceAll(" ", "");
		}
		return texto.length();
	}
	
	public String retornarQuatroPrimeirasLetras(String texto) {
		return texto.substring(0, 4);
	}
	
	public String retornarAPartirTerceiraLetra(String texto) {
		return texto.substring(2, texto.length());
	}
	
	public String retornarUltimasQuatroLetras(String texto) {
		return texto.substring((texto.length() - 4), texto.length());
	}
	
	public String substituirAlunaNome(String texto) {
		return texto.replace("Camile", "ALUNA");
	}
	
	public String exibirTextoSeparado(String texto) {
		return texto.replaceAll(", ", "\r\n");
	}
	
	public Integer exibirVogais(String texto) {
		Integer cont = 0;
		for(int i = 0; i < texto.length(); i++)	{
		   char c = texto.charAt(i);
		   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			   cont++;
		   }
		}
		return cont;
	}
	
	public String retornarTextoInvertido(String texto) {
		String tmp = new StringBuffer(texto).reverse().toString();
		return tmp;
	}
	
}
