package pe.edu.uni.ejemplocola.service;

import pe.edu.uni.ejemplocola.model.Node;

public class Queue {
	
	private Node front;
	
	public Queue() {
		this.front = null;
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (front == null) {
			front = newNode;
			return;
		}		
		Node actual = front;
		while (actual.getNext() != null) {
			actual = actual.getNext();
		}
		actual.setNext(newNode);
	}
	
	public int dequeue() {
		if (front == null) {
			throw new RuntimeException("Cola vacia.");
		}
		int value = front.getData();
		Node actual = front;
		front = actual.getNext();
		actual.setNext(null);
		return value;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void print() {
		if (front == null) {
			System.out.println("Cola vacia.");
			return;
		}
		Node actual = front;
		while (actual != null) {
			System.out.print(actual.getData() + " -> ");
			actual = actual.getNext();
		}
		System.out.println("NULL");
	}
	
	public Queue getColaPares() {
		Queue colaPares = new Queue();
		Node actual = front;
		while (actual != null) {
			if (actual.getData() % 2 == 0) {
				colaPares.enqueue(actual.getData());
				actual.setData(-1);
			} 
			actual = actual.getNext();
		}
		// Crear otra cola con los valores diferentes de -1
		actual = front;
		front = null;
		while(actual != null){
			if(actual.getData() != -1){
				enqueue(actual.getData());
			}
			actual = actual.getNext();
		}
		return colaPares;
	}
}
