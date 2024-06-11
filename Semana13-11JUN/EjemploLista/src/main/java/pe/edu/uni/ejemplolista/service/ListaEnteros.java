package pe.edu.uni.ejemplolista.service;

import java.util.Random;

public class ListaEnteros {

	private Nodo cabeza;

	public ListaEnteros() {
		cabeza = null;
	}

	public ListaEnteros(int n) {
		cabeza = null;
		Random random = new Random();
		for (int i = 1; i <= n; i++) {
			this.agregar(generaNumero(random));
		}
	}

	public void agregar(int valor) {
		Nodo nuevo = new Nodo(valor);
		if (cabeza == null) {
			cabeza = nuevo;
			return;
		}
		Nodo actual = cabeza;
		while (actual.getSiguiente() != null) {
			actual = actual.getSiguiente();
		}
		actual.setSiguiente(nuevo);
	}

	public void agregarAlInicio(int valor) {
		Nodo nuevo = new Nodo(valor);
		nuevo.setSiguiente(cabeza);
		cabeza = nuevo;
	}

	public void imprimir() {
		if (cabeza == null) {
			System.out.println("Lista vacia.");
			return;
		}
		Nodo actual = cabeza;
		while (actual != null) {
			System.out.print(actual.getValor() + " -> ");
			actual = actual.getSiguiente();
		}
		System.out.println("NULL");
	}

	public void eliminarNodo(int valor) {
		// Si lista esta vacia
		if (cabeza == null) {
			return;
		}
		// Si es el primero
		if (cabeza.getValor() == valor) {
			cabeza = cabeza.getSiguiente();
			return;
		}
		// Ubicar el nodo a  eliminar
		Nodo actual = cabeza;
		while (actual.getSiguiente() != null) {
			if (actual.getSiguiente().getValor() == valor) {
				break;
			}
			actual = actual.getSiguiente();
		}
		// No encontro ningun nodo
		if(actual.getSiguiente()==null){
			return;
		}
		// Eliminar nodo encontrado
		Nodo temp = actual.getSiguiente();
		actual.setSiguiente( temp.getSiguiente());
		temp.setSiguiente(null);
	}

	private int generaNumero(Random random) {
		int valor;
		valor = random.nextInt(20, 30);
		return valor;
	}

	public void ordenarLista(){
		
	}
	
	
}
