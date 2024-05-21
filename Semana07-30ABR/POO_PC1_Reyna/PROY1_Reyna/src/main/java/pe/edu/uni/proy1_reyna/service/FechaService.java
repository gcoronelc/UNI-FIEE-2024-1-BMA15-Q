/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy1_reyna.service;

import pe.edu.uni.proy1_reyna.Fecha.Fecha;

/**
 *
 * @author PROFESOR
 */
public class FechaService {

	public boolean verificarFecha(Fecha fecha) {
		//variables
		boolean valido = true;
		int dia;
		int mes;
		int año;

		//proceso
		dia = fecha.getDia();
		mes = fecha.getMes();
		año = fecha.getAño();

		//verificar variacion de día, mes
		if (mes > 12 || mes < 1) {
			valido = false;
		} else if (dia < 1 || dia > 31) {
			valido = false;
		} //varificar dia según mes
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 31) {
				valido = false;
			}
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 30) {
				valido = false;
			}
		} else if (mes == 2) {
			if (bisiesto(año)) {
				if (dia > 29) {
					valido = false;
				}
			} else {
				if (dia > 28) {
					valido = false;
				}
			}
		}
		//salida
		return valido;
	}

	public int trimestre(Fecha fecha) {
		//variables
		int trimestre = 0;
		int mes;

		//proceso
		mes = fecha.getMes();
		if (mes >= 1 && mes <= 3) {
			trimestre = 1;
		} else if (mes >= 4 && mes <= 6) {
			trimestre = 2;
		} else if (mes >= 7 && mes <= 9) {
			trimestre = 3;
		} else if (mes >= 10 && mes <= 12) {
			trimestre = 4;
		}

		//salida
		return trimestre;
	}

	public String estacion(Fecha fecha) {
		//variables
		int dia;
		int mes;

		//proceso
		dia = fecha.getDia();
		mes = fecha.getMes();

		if ((mes == 3 && dia >= 20) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 20)) {
			fecha.setEstación("Otonio");
		} else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia <= 21)) {
			fecha.setEstación("Invierno");
		} else if ((mes == 9 && dia >= 22) || (mes == 10) || (mes == 11) || (mes == 12 && dia <= 20)) {
			fecha.setEstación("Primavera");
		} else if ((mes == 12 && dia >= 21) || (mes == 1) || (mes == 2) || (mes == 3 && dia <= 19)) {
			fecha.setEstación("Verano");
		}

		//salida
		return fecha.getEstación();
	}

	//método adicional
	private boolean bisiesto(int año) {
		if (año % 4 != 0) {
			return false;
		}
		if (año % 100 != 0) {
			return true;
		}
		if (año % 400 != 0) {
			return false;
		}
		return true;
	}
}
