package pe.edu.uni.appjava.service;

public class MateService {
	
	public int sumar(int n1, int n2){
		// Variables
		int suma;
		// Proceso
		suma = n1 + n2;
		// Reporte
		return suma;
	}
		
	public int restar(int n1, int n2){
		//variables
		int resta; 
		//proceso
		resta = n1 - n2; 
		//reporte
		return resta; 
	}
	
	public int max(int n1, int n2){
		//variable
		int m;
		//proceso
		if(n1>n2){
			m=n1;
		}
		else{
			m=n2;
		}
		//reporte
		return m;
	}
	
	
}
