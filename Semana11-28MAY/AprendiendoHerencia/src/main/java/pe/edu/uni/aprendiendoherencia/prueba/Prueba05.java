package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.caso2.PromedioAbstract;
import pe.edu.uni.aprendiendoherencia.caso2.PromedioTipo2;

public class Prueba05 {
	
	public static void main(String[] args) {
		
		PromedioAbstract bean = new PromedioTipo2();
		System.out.println("Promedio: " + bean.promedio(14, 16, 18));
		
	}

	
}
