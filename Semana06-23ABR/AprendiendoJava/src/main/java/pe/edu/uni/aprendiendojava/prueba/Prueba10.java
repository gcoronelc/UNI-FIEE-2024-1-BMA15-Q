package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service2.MateService2;
import pe.edu.uni.aprendiendojava.service2.MateSpec;

public class Prueba10 {

	public static void main(String[] args) {
		
		MateSpec bean = new MateSpec() {
			@Override
			public int sumar(int n1, int n2) {
				return n1 * (n1 - n2);
			}
		};
		
		System.out.println("Nombre: " + MateSpec.NOMBRE);
		System.out.println("8 + 5 = " + bean.sumar(8, 5));
	}

	
}
