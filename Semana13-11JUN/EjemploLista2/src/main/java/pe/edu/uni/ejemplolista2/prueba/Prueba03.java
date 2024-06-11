package pe.edu.uni.ejemplolista2.prueba;

import pe.edu.uni.ejemplolista2.dto.Estudiante;
import pe.edu.uni.ejemplolista2.service.Lista;

public class Prueba03 {

	public static void main(String[] args) {
		
		// Creamos una lista vacía
		Lista lista = new Lista();

		// Agregamos estudiantes a la lista
		lista.agregar(new Estudiante("Pedro", 15));
		lista.agregar(new Estudiante("Alejamdra", 19));
		lista.agregar(new Estudiante("Cesar", 9));
		lista.agregar(new Estudiante("Karla", 18));
		lista.agregar(new Estudiante("Cinthia", 2));

		// Imprimimos los estudiantes de la lista
		lista.imprimir();
		
		Lista aprobados = lista.obtenerAprobados(); 

		// Imprimimos los estudiantes de la lista después de eliminar
		aprobados.imprimir();
		lista.imprimir();
		
	}
}
