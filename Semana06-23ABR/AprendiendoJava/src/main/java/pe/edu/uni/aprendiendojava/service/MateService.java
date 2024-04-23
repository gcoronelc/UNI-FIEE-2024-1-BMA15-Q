package pe.edu.uni.aprendiendojava.service;

public class MateService {

	public int[][] genMatriz(int filas, int columnas) {
		int matriz[][] = new int[filas][columnas];
		int i;
		int j;
		for (i = 0; i < filas; i++) {
			for (j = 0; j < columnas; j++) {
				matriz[i][j] = (int) (Math.random() * (100 - 10 + 1) + 10);
			}
		}
		return matriz;
	}
	
	public int[][] sumaMatriz(int mat1[][], int mat2[][]){
		//variables
		int filasM1; 
		int filasM2; 
		int colM1; 
		int colM2; 
		int matrizSuma[][]; 
		//proceso
		filasM1 = mat1.length; 
		filasM2 = mat2.length; 
		colM1 = mat1[0].length; 
		colM2 = mat2[0].length; 
		if(filasM1 != filasM2 || colM1 != colM2){
			throw new RuntimeException("Las matrices deben ser de la misma dimensión"); 
		}
		matrizSuma = new int[filasM1][colM1];
		for(int i = 0; i < filasM1; i++){
			for(int j = 0; j < colM1; j++){
				matrizSuma[i][j] = mat1[i][j] + mat2[i][j]; 
			}
		}
		//salida
		return matrizSuma; 
	}
	
	
	public int[][] prodMatriz(int mat1[][], int mat2[][]){
		int filasM1 = mat1.length; 
		int filasM2 = mat2.length; 
		int colM1 = mat1[0].length; 
		int colM2 = mat2[0].length; 
		
		if (colM1 != filasM2)
			throw new RuntimeException("Las matrices deben cumplir con la condicion"); 
		
		int matrizProducto[][] = new int[filasM1][colM2];
		
		for(int i = 0; i < filasM1; i++)
		{
			for(int j = 0; j < colM2; j++)
			{
					for(int k = 0; k < colM1; k++)
						matrizProducto[i][j] += mat1[i][k] * mat2[k][j]; 
			}
		}
		return matrizProducto;
	}

}
