package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;

public class Prueba04 {

	public static void main(String[] args) {

		int vector1[] = {23, 56, 89, 45, 23, 31, 31, 25};
		int vector2[] = {54, 23, 89, 25, 23, 11, 56, 88};

		int diferencia[] = diferencia(vector1, vector2);
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		System.out.println(Arrays.toString(diferencia));

	}

	private static int[] diferencia(int[] vector1, int[] vector2) {
		// Variables
		int[] diferencia;
		int[] diferencia2;
		int contDife;
		// Proceso
		diferencia = new int[vector1.length];
		contDife = 0;
		for (int dato : vector1) {
			if (!existe(dato, vector2) && !existe(dato, diferencia)) {
				diferencia[contDife] = dato;
				contDife++;
			}
		}
		diferencia2 = new int[contDife];
		System.arraycopy(diferencia, 0, diferencia2, 0, contDife);
		// Reporte
		return diferencia2;
	}

	private static boolean existe(int dato, int[] vector) {
		// Variables
		boolean rpta;
		// Proceso
		rpta = false;
		for (int valor : vector) {
			if (valor == dato) {
				rpta = true;
				break;
			}
		}
		// Reporte
		return rpta;
	}

}
