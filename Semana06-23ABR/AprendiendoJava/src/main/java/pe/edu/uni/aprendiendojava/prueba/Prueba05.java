package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;
import java.util.Set;

public class Prueba05 {

	public static void main(String[] args) {

		// Datos
		Integer vector1[] = {23, 56, 89, 45, 23, 31, 31, 25};
		Integer vector2[] = {54, 23, 89, 25, 23, 11, 56, 88};

		// Trabajando con conjuntos
		Set<Integer> set1 = Set.of(vector1);
		Set<Integer> set2 = Set.of(vector2);
		
		//Set<Integer> setDif = set1.removeAll(set2);
		
		 // Reporte
		System.out.println(Arrays.toString(set1.toArray()));
		System.out.println(Arrays.toString(set1.toArray()));
		//System.out.println(Arrays.toString(setDif.toArray()));

	}

	
}
