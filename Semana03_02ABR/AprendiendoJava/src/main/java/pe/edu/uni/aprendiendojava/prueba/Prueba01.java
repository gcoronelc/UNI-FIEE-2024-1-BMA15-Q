package pe.edu.uni.aprendiendojava.prueba;

public class Prueba01 {
	
	private String nombre;
	private int edad;
	private char tipo;
	
	public void mostrarValores(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Tipo: " + String.valueOf(tipo));
		
		double sueldo = 10000.00;
		System.out.println("Sueldo: " + sueldo);
	}
	
	public static void main(String[] args) {
		Prueba01 o = new Prueba01();
		o.mostrarValores();
	}
}
