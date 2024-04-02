package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.Algo;

public class Prueba02 {
	
	static void cambiar(Algo o){
		int x = o.n1;
		o.n1 = o.n2;
		o.n2 = x;
	}
	
	static void cambiar(String s){
		s = "Gustavo";
		System.out.println("s (local): " + s);
	}
	
	public static void main(String[] args) {
		Algo o = new Algo();
		o.mostrar();
		cambiar(o);
		o.mostrar();
		cambiar(o);
		o.mostrar();
		
		String s = new String("Panchito");
		System.out.println("s: " + s); // Pachito
		cambiar(s);
		System.out.println("s: " + s); // Se espera Gustavo
	}
	
}
