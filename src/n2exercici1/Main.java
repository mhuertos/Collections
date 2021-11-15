package n2exercici1;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<IntegerRandom> lista = new PriorityQueue<IntegerRandom>();
		
		lista.offer(new IntegerRandom());
		lista.offer(new IntegerRandom());
		lista.offer(new IntegerRandom());
		lista.offer(new IntegerRandom());
		lista.offer(new IntegerRandom());

		while(lista.size() > 0) {
			System.out.println(lista.peek());
			lista.poll();
		}
	}
}
