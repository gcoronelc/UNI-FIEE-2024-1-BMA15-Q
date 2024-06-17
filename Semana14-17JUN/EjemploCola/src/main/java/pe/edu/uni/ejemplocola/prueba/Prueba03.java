package pe.edu.uni.ejemplocola.prueba;

import pe.edu.uni.ejemplocola.service.Queue;

public class Prueba03 {

	public static void main(String[] args) {
		
		Queue cola1 = new Queue();
		
		cola1.enqueue(40);	
		cola1.enqueue(100);
		cola1.enqueue(80);
		cola1.enqueue(45);

		while(!cola1.isEmpty()){
			int value = cola1.dequeue();
			System.out.println("Chau " + value);
		}
	}
	
}
