package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.caso2.PromedioAbstract;
import pe.edu.uni.aprendiendoherencia.caso2.PromedioTipo1;

public class Prueba04 {
	
	public static void main(String[] args) {
		
		PromedioAbstract bean = new PromedioTipo1();
		System.out.println("Promedio: " + bean.promedio(14, 16, 18));
		
	}

	
}
