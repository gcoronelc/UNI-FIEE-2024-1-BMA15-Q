package pe.edu.uni.ejemplolista2.service;

import pe.edu.uni.ejemplolista2.dto.Estudiante;

public class Lista {

	private Nodo cabeza;

	public Lista() {
		cabeza = null;
	}

	public void agregar(Estudiante dato) {
		Nodo nuevo = new Nodo(dato);
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

	public void imprimir() {
		if (cabeza == null) {
			System.out.println("Lista vacia.");
			return;
		}
		Nodo actual = cabeza;
		while (actual != null) {
			System.out.print(actual.getDato() + " => ");
			actual = actual.getSiguiente();
		}
		System.out.println("NULL");
	}

	public void eliminar(Estudiante dato) {
		if (cabeza == null) {
			return;
		}
		if (cabeza.getDato().toString().equals(dato.toString())) {
			cabeza = cabeza.getSiguiente();
			return;
		}
		Nodo actual = cabeza;
		while (actual.getSiguiente() != null) {
			if (actual.getSiguiente().getDato().toString().equalsIgnoreCase(dato.toString())) {
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
				return;
			}
			actual = actual.getSiguiente();
		}
	}

	public Lista obtenerAprobados() {
		Lista aprobados = new Lista();
		Nodo actual = cabeza;
		while (actual != null) {
			if (actual.getDato().getNota() >= 10) {
				aprobados.agregar(actual.getDato());
			}
			actual = actual.getSiguiente();
		}
		return aprobados;
	}

	public double getNotaPromedio() {
		if (cabeza == null) {
			return 0;
		}
		double promedio;
		double SumaNota = 0;
		int cont = 0;
		Nodo actual = cabeza;
		while (actual != null) {
			SumaNota += actual.getDato().getNota();
			cont++;
			actual = actual.getSiguiente();
		}
		promedio = SumaNota / cont;
		return promedio;
	}

}
