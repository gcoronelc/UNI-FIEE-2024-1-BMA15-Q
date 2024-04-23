package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.AlumnoService;

public class Prueba11 {

	public static void main(String[] args) {
		AlumnoService service = new AlumnoService();
		System.out.println("Promedio: " + service.getPromedio());
	}
	
}
