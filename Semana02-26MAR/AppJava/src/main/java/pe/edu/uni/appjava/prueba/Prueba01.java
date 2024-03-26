package pe.edu.uni.appjava.prueba;

import pe.edu.uni.appjava.service.MateService;

public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		int n1 = 70;
		int n2 = 40;
		// Proceso
		MateService service = new MateService();
		int suma = service.sumar(n1, n2);
		int resta = service.restar(n1, n2);
		int maxi = service.max(n1, n2);
		// Salida
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Maximo: " + maxi);

	}
	
}
