package pe.edu.uni.aprendiendojava.service;

import pe.edu.uni.aprendiendojava.dto.MateDto;

public class MateService {

	public MateDto procesar(MateDto dto){
		// Variables
		int suma;
		int resta;
		// Proceso
		suma = dto.getNum1() + dto.getNum2();
		resta = dto.getNum1() - dto.getNum2();
		// Reporte
		dto.setSuma(suma);
		dto.setResta(resta);
		return dto;
	}

	
}
