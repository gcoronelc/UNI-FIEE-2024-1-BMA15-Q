package pe.edu.uni.aprendiendoherencia.caso2;

public class PromedioTipo2 extends PromedioAbstract{

	@Override
	public double promedio(int pp, int ep, int ef) {
		double pf = (pp * 2 + ep + ef) * 1.0 / 4;
		return pf;
	}

}
