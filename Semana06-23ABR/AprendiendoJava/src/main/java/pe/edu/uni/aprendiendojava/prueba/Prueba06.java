package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba06 {
	
	public static void main(String[] args) {
		//variables
		int numFilas = 4;
		int numColumnas = 5;
		int matrizGenerada[][];
		int i;
		int j;
		//Proceso
		MateService service = new MateService();
		matrizGenerada = service.genMatriz(numFilas, numColumnas);
		//reporte
		for(i=0;i<numFilas;i++){
			for(j=0;j<numColumnas;j++){
				System.out.print("\t" +matrizGenerada[i][j]);
			}
			System.out.println("\n");
		}
		
		
	}
	
	
}
