package pe.edu.uni.pc2_py2_reyna.prueba;

import pe.edu.uni.pc2_py2_reyna.service.VectorService;

public class Prueba01_Constructor_Get {

	public static void main(String[] args) {
		//variables
		int length = 5;
		int[] vector3;
		int[] vector5;

		//proceso
		VectorService service = new VectorService(length);
		vector3 = service.getVector3();
		vector5 = service.getVector5();

		//salida
		imprimirVector(vector3, "Vector3: ");
		imprimirVector(vector5, "Vector5: ");
	}

	public static void imprimirVector(int[] vector, String nombre) {
		System.out.println(nombre);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + "\t");
		}
		System.out.println("");
	}
}
