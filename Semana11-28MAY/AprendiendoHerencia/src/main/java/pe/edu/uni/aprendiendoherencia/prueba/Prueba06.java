package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.caso1.Clase1;
import pe.edu.uni.aprendiendoherencia.caso1.Clase2;
import pe.edu.uni.aprendiendoherencia.caso1.Clase3;
import pe.edu.uni.aprendiendoherencia.caso1.Clase4;

public class Prueba06 {
	
	public static void main(String[] args) {
		// Dato
		Clase4 bean = new Clase4();
		// Proceso
		boolean compObject = (bean instanceof Object);
		boolean compClase1 = (bean instanceof Clase1);
		boolean compClase2 = (bean instanceof Clase2);
		boolean compClase3 = (Clase3.class.isInstance(bean));
		// Reporte
		System.out.println("Compatible con Object: " + compObject);
		System.out.println("Compatible con Clase1: " + compClase1);
		System.out.println("Compatible con Clase2: " + compClase2);
		System.out.println("Compatible con Clase3: " + compClase3);
	}

	
}
