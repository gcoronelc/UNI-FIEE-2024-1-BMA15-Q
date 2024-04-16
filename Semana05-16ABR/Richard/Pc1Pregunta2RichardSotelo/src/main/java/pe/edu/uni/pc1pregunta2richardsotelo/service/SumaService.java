package pe.edu.uni.pc1pregunta2richardsotelo.service;

import pe.edu.uni.pc1pregunta2richardsotelo.dto.SumaDto;

public class SumaService {

	public SumaDto sumatoria(SumaDto dto) {
		//variables
		double potencia;
		double suma = 0;
		//proceso
		potencia = dto.getX();
		for (int i = 0; i <= dto.getN(); i++) {
			suma = suma + potencia / (2 * i + 1);
			potencia = potencia * dto.getX() * dto.getX() * -1;
		}
		//retorno
		dto.setSuma(suma);
		return dto;

	}
}
