package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.AlumnoDto;
import pe.edu.uni.aprendiendojava.service.AlumnoService;

public class Prueba12 {

	public static void main(String[] args) {
		AlumnoService service = new AlumnoService();
		service.agregaer(new AlumnoDto("Lidia",15)	);
		System.out.println("Promedio: " + service.getPromedio());
		for(AlumnoDto bean: service.getLista()){
			System.out.println(bean);
		}
	}
	
}
