package pe.edu.uni.aprendiendoherencia.caso1;

public class Clase2 extends Clase1 {

	public Clase2() {
		super("Richard");
	}
	
	
	
	private String nombre = "Real Madrid";

	@Override
	public int sumar(int n1, int n2) {
		return super.sumar(n1, n2) * (n1 - n2);
	}

	public void saludar(){
		String saludo = "Hola " + super.nombre + " y " + this.nombre;
		System.out.println(saludo);
	}
}
