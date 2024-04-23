package pe.edu.uni.aprendiendojava.service;

import pe.edu.uni.aprendiendojava.dto.AlumnoDto;


public class AlumnoService {

	private AlumnoDto[] lista;

	public AlumnoService() {
		lista = new AlumnoDto[5];
		lista[0] = new AlumnoDto("Gustavo", 18);
		lista[1] = new AlumnoDto("Laura", 15);
		lista[2] = new AlumnoDto("Alejando", 18);
		lista[3] = new AlumnoDto("Claudia", 16);
		lista[4] = new AlumnoDto("Pedro", 17);
	}
	
	
	public int getPromedio(){
		return 15;
	}
	
	public void agregaer(AlumnoDto dto){
		AlumnoDto lista2[] = new AlumnoDto[lista.length + 1];
		System.arraycopy(lista, 0, lista2, 0, lista.length);
		lista2[lista2.length-1] = dto;
		lista = lista2;
	}

	public AlumnoDto[] getLista() {
		return lista;
	}
	
	
	
}
