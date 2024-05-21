/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy2_reyna.services;

/**
 *
 * @author PROFESOR
 */
public class SerieService {

	public double calcularSerie(double x, int n) {
		//variable
		double serie = 0;

		//proceso
		for (int i = 0; i <= n; i++) {
			serie = serie + (this.potencia(-1, i) * this.potencia(x, 2 * i + 1) / (2 * i + 1));
		}

		//salida
		return serie;
	}

	public double potencia(double base, int exponente) {
		//variables
		double potencia = 1;

		//proceso
		for (int i = 0; i < exponente; i++) {
			potencia = (double) (base * potencia);
		}
		//salida
		return potencia;
	}
}
