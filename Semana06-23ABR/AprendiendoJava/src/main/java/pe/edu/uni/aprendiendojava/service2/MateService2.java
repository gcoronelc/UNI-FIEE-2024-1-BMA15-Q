package pe.edu.uni.aprendiendojava.service2;

public class MateService2 implements MateSpec{

	@Override
	public int sumar(int n1, int n2) {
		return (n1 + n2) * (n1 - n2);
	}
	
}
