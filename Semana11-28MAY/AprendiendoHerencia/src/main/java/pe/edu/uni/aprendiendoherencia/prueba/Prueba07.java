package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.caso1.Clase1;
import pe.edu.uni.aprendiendoherencia.caso1.Clase2;
import pe.edu.uni.aprendiendoherencia.caso1.Clase3;
import pe.edu.uni.aprendiendoherencia.caso1.Clase4;

public class Prueba07 {
	
	public static void main(String[] args) {
		// Dato
		Clase2 bean = new Clase2();
		// Proceso
		boolean compObject = (bean instanceof Object);
		boolean compClase1 = (bean instanceof Clase1);
		boolean compClase4 = (bean instanceof Clase4);
		boolean compClase3 = (Clase3.class.isInstance(bean));
		// Reporte
		System.out.println("Compatible con Object: " + compObject);
		System.out.println("Compatible con Clase1: " + compClase1);
		System.out.println("Compatible con Clase4: " + compClase4);
		System.out.println("Compatible con Clase3: " + compClase3);
	}

	
}
