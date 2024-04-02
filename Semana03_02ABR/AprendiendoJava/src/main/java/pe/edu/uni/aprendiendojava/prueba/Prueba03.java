package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.MateDto;
import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba03 {

	public static void main(String[] args) {
		// Datos
		MateDto dto = new MateDto();
		dto.setNum1(60);
		dto.setNum2(45);
		// Proceso
		MateService service = new MateService();
		dto = service.procesar(dto);
		// Reporte
		System.out.println("Suma: " + dto.getSuma());
		System.out.println("Resta: " + dto.getResta());
	}
	
}
