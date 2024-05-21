package pe.edu.uni.aprendiendoherencia.caso1;

public class Clase1 {

	/*
	public Clase1() {
		System.out.println("Hola, te saluda Gustavo.");
	}
*/
	
	public Clase1(String amigo) {
		System.out.println("Hola " + amigo +", te saluda Gustavo.");
	}

	protected String nombre = "Gustavo Coronel";

	public int sumar(int n1, int n2) {
		return (n1 + n2);
	}

}
