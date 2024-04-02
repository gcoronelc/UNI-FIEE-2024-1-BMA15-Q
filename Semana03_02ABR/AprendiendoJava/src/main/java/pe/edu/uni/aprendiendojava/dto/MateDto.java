package pe.edu.uni.aprendiendojava.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class MateDto {
	// Datos
	private int num1;
	private int num2;
	// Reporte
	private int suma;
	private int resta;

	/**
	 * Constructor por defecto.
	 * Inicializa el objeto
	 */
//	public MateDto() {
//		this.num1 = 70;
//		this.num2 = 20;
//	}

	/**
	 * Constructor adicional.
	 * @param num1 Numero 1.
	 * @param num2 Numero 2.
	 */
	public MateDto(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.suma = 0;
		this.resta = 0;
	}
		
}
