package pe.edu.uni.ejemplolista2.prueba;

import pe.edu.uni.ejemplolista2.dto.Estudiante;

public class Prueba02 {

	public static void main(String[] args) {
		
		Estudiante bean = new Estudiante("Sergio", 20);
		
		System.out.println(bean);
		System.out.println(bean.toString());
		
		
	}
}
