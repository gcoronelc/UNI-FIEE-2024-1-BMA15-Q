package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba08 {
	
	public static void main(String[] args) {
		//variables
		int matrizGenerada1[][];
		int matrizGenerada2[][];
		int matrizProducto[][];
		int i;
		int j;
		//Proceso
		MateService service = new MateService();
		matrizGenerada1 = service.genMatriz(2, 3);
		matrizGenerada2 = service.genMatriz(3, 4);
		matrizProducto = service.prodMatriz(matrizGenerada1, matrizGenerada2);
		//reporte
		mostarMatriz("Matriz1", matrizGenerada1); 
		mostarMatriz("Matriz2", matrizGenerada2); 
		mostarMatriz("MatrizProducto",matrizProducto); 	
	}

	
	
	private static void mostarMatriz(String titulo, int[][] matriz) {	
		System.out.println(titulo);
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print("\t" +matriz[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	
}
