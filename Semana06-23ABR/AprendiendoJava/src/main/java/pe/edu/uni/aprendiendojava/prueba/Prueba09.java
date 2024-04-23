package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service2.MateService2;
import pe.edu.uni.aprendiendojava.service2.MateSpec;

public class Prueba09 {

	public static void main(String[] args) {
		MateSpec bean = new MateService2();
		System.out.println("Nombre: " + MateSpec.NOMBRE);
		System.out.println("8 + 5 = " + bean.sumar(8, 5));
	}

	
}
