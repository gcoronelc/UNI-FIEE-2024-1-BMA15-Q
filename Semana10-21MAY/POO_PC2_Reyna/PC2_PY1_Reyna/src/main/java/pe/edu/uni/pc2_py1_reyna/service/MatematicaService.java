/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.pc2_py1_reyna.service;

/**
 *
 * @author PROFESOR
 */
public class MatematicaService {

	public boolean numeroDeAmstrong(int numero) {
		return true;
	}

	public double evaluarSerie(int n) {
		//variable
		double serie = 1;
		//proceso
		for (int i = 2; i <= n; i++) {
			serie = serie + (1.0 / (double) i);
		}
		//salida
		return serie;
	}

	public String fibonacci(int n) {
		//variables
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		String numeros = "";
		//proceso
		for (int i = 0; i < n; i++) {
			numeros = numeros + Integer.toString(n1) + "   ";
			n3 = n1;
			n1 = n2 + n1;
			n2 = n3;
		}
		//salida
		return numeros;
	}
}
