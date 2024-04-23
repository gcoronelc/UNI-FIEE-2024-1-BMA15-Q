/*
Autor: Rios
*/
package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;

public class Prueba02 {

	public static void main(String[] args) {

		int notas[] = {12, 8, 17, 10, 18};

		//datos
		int a;
		int i;
		int j;
		int sum = 0;
		double promedio;

		//proceso
		/*
		for (i = 0; i < 5; i++) {
			for (j = i + 1; j < 5; j++) {
				if (notas[i] > notas[j]) {
					a = notas[j];
					notas[j] = notas[i];
					notas[i] = a;
				} else {
					notas[i] = notas[i];
				}
			}
		}
		*/
		
		Arrays.sort(notas);
		for (i = 2; i < 5; i++) {
			sum = sum + notas[i];
		}
		promedio = sum / 3.0;
		//reporte
		System.out.println(Arrays.toString(notas));
		System.out.println("El promedio es: " + promedio);

	}

}
