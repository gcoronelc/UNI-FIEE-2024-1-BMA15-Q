package pe.edu.uni.aprendiendojava.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class AlumnoDto {
	
	private String nombre;
	private int nota;
	
}
