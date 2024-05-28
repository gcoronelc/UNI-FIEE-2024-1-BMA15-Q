package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.caso2.PromedioAbstract;

public class Prueba03 {
	
	public static void main(String[] args) {
		
		PromedioAbstract bean = new PromedioAbstract() {
			@Override
			public double promedio(int pp, int ep, int ef) {
				return (pp+ep+ef) * 1.0 / 3.0;
			}
		};
		
		System.out.println("Promedio: " + bean.promedio(14, 16, 18));
	}

	
}
