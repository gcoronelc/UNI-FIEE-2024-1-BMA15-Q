package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba07 {
	
	public static void main(String[] args) {
		//variables
		int numFilas = 2;
		int numColumnas = 3;
		int matrizGenerada1[][];
		int matrizGenerada2[][];
		int matrizSuma[][];
		int i;
		int j;
		//Proceso
		MateService service = new MateService();
		matrizGenerada1 = service.genMatriz(numFilas, numColumnas);
		matrizGenerada2 = service.genMatriz(numFilas, numColumnas);
		matrizSuma = service.sumaMatriz(matrizGenerada1, matrizGenerada2);
		//reporte
		mostarMatriz("Matriz1", matrizGenerada1); 
		mostarMatriz("Matriz2", matrizGenerada2); 
		mostarMatriz("MatrizSuma", matrizSuma); 	
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
