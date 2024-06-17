package pe.edu.uni.ejemplocola.prueba;

import pe.edu.uni.ejemplocola.service.Queue;

public class Prueba02 {

	public static void main(String[] args) {
		
		Queue cola1 = new Queue();
		
		cola1.enqueue(40);	
		cola1.enqueue(100);
		cola1.enqueue(80);
		cola1.enqueue(45);

		cola1.print();
	}
	
}
