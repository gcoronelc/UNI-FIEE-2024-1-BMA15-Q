package pe.edu.uni.pc2_py2_reyna.service;

public class VectorService {

	private int[] vector3;
	private int[] vector5;

	//constructor
	public VectorService(int n) {
		//variables
		int[] vectorDe3 = new int[n];
		int[] vectorDe5 = new int[n];
		//proceso
		for (int i = 0; i < n; i++) {
			vectorDe3[i] = generarMultiplo(3);
			vectorDe5[i] = generarMultiplo(5);
		}
		//salida
		vector3 = vectorDe3;
		vector5 = vectorDe5;
	}

	//métodos
	public int[] getVector3() {
		return this.vector3;
	}

	public int[] getVector5() {
		return this.vector5;
	}

	public int[] vectorComun() {
		//variables 
		int length = this.vector3.length;
		int[] vectorM3 = getVector3();
		int[] vectorM5 = getVector5();
		int numeroActual;
		int[] vectorComun = new int[length];
		int indexVectorComun = 0;
		//proceso
		for (int i = 0; i < length; i++) {
			numeroActual = vectorM3[i];
			if (buscarElemento(numeroActual, vectorM5) && !buscarElemento(numeroActual, vectorComun)) {
				vectorComun[indexVectorComun] = numeroActual;
				indexVectorComun++;
			}
		}
		//salida
		int[] vectorComunReducido = new int[indexVectorComun];
		System.arraycopy(vectorComun, 0, vectorComunReducido, 0, indexVectorComun);
		return vectorComunReducido;
	}

	public int[] vectorUnion() {
		//variables 
		int length = this.vector3.length;
		int[] vectorM3 = getVector3();
		int[] vectorM5 = getVector5();
		int numeroActual;
		int[] vectorUnion = new int[length * 2];
		int indexVectorUnion = 0;
		//proceso
		for (int i = 0; i < length; i++) {
			numeroActual = vectorM3[i];
			if (!buscarElemento(numeroActual, vectorUnion)) {
				vectorUnion[indexVectorUnion] = numeroActual;
				indexVectorUnion++;
			}
		}
		for (int i = 0; i < length; i++) {
			numeroActual = vectorM5[i];
			if (!buscarElemento(numeroActual, vectorUnion)) {
				vectorUnion[indexVectorUnion] = numeroActual;
				indexVectorUnion++;
			}
		}
		//salida
		int[] vectorUnionReducido = new int[indexVectorUnion];
		System.arraycopy(vectorUnion, 0, vectorUnionReducido, 0, indexVectorUnion);
		return vectorUnionReducido;
	}

	//métodos adicionales
	private int generarMultiplo(int multiplo) {
		//variables
		int numeroGenerado;
		//proceso
		while (true) {
			numeroGenerado = (int) (Math.random() * 40 + 10.0);
			if (numeroGenerado % multiplo == 0) {
				break;
			}
		}
		//retorno
		return numeroGenerado;
	}

	private boolean buscarElemento(int elemento, int[] vector) {
		//variable
		boolean encontrado = false;
		//proceso
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == elemento) {
				encontrado = true;
			}
		}
		//salida
		return encontrado;
	}
}
