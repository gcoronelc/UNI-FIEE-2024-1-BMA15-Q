package pe.edu.uni.aprendiendoherencia.caso2;

public class PromedioTipo1 extends PromedioAbstract{

	@Override
	public double promedio(int pp, int ep, int ef) {
		double pf = (pp + ep + ef) * 1.0 / 3;
		return pf;
	}

}
