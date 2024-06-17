package pe.edu.uni.ejemplocola.prueba;

import pe.edu.uni.ejemplocola.service.Queue;

public class Prueba04 {

	public static void main(String[] args) {
		
		Queue cola1 = new Queue();
		
		cola1.enqueue(40);	
		cola1.enqueue(79);
		cola1.enqueue(80);
		cola1.enqueue(46);
		cola1.enqueue(75);
		cola1.print();

		System.out.println("---------------------------");
		Queue colaPares = cola1.getColaPares();
		cola1.print();
		colaPares.print();
		
	}
	
}
