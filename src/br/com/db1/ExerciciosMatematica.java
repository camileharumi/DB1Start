package br.com.db1;

public class ExerciciosMatematica {
	
	public Double menorDoisDoubles(Double v1, Double v2) {
		/*if(v1<v2) {
			return v1;
		} else {
			return v2;
		}*/
		return Math.min(v1, v2);
	}
	
	public Double menorTresDoubles(Double v1, Double v2, Double v3) {
		if(v1<v2 && v1<v3) {
			return v1;
		} else if (v2<v1 && v2<v3) {
			return v2;
		} else {
			return v3;
		}
	}
	
	public Double mediaTresNumeros(Double v1, Double v2, Double v3) {
		Double media = (v1+v2+v3)/3;
		return media;
	}
	
	public Double areaTriangulo(Double base, Double altura) {
		Double area = ((base*altura)/2);
		return area;
	}
}
