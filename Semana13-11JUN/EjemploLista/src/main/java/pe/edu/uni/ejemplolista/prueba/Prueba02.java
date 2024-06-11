package pe.edu.uni.ejemplolista.prueba;

import pe.edu.uni.ejemplolista.service.ListaEnteros;

public class Prueba02 {

	 public static void main(String[] args) {
		 
        // Creamos una lista vacía
        ListaEnteros listaNumeros = new ListaEnteros();

        // Agregamos elementos a la lista
		  
        listaNumeros.agregarAlInicio(81);
        listaNumeros.agregarAlInicio(20);
        listaNumeros.agregarAlInicio(33);
        listaNumeros.agregar(48);
        listaNumeros.agregar(15);
		  
        // Imprimimos los elementos de la lista
        listaNumeros.imprimir();
		  
    }
	 
}
