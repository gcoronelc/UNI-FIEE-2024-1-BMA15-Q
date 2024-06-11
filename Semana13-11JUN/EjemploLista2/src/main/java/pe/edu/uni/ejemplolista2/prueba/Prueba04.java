package pe.edu.uni.ejemplolista2.prueba;

import pe.edu.uni.ejemplolista2.dto.Estudiante;
import pe.edu.uni.ejemplolista2.service.Lista;

public class Prueba04 {

	public static void main(String[] args) {
		
		// Creamos una lista vacía
		Lista lista = new Lista();
		double promedio;

		// Agregamos estudiantes a la lista
		lista.agregar(new Estudiante("Pedro", 15));
		lista.agregar(new Estudiante("Alejamdra", 19));
		lista.agregar(new Estudiante("Cesar", 9));
		lista.agregar(new Estudiante("Karla", 18));
		lista.agregar(new Estudiante("Cinthia", 2));

		// Imprimimos los estudiantes de la lista
		lista.imprimir();
		
		 

		// Imprimimos los estudiantes de la lista después de eliminar
		promedio=lista.getNotaPromedio();
		
		System.out.println(""+promedio);
	}
}
