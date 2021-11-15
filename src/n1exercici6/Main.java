package n1exercici6;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		/*Crea un objecte buit LinkedList<Integer>. 
		 * Utilitzant un iterador ListIterator, 
		 *afegeixi valors sencers a la llista inserint-los 
		 *sempre a la meitat d'aquesta.
		 */

		LinkedList<Integer> nlist = new LinkedList<Integer>();
		
		for(int i= 0; i<10; i++) {
			llenaColeccion(nlist, i);
		}
		System.out.println(nlist);

	}
	
	//método genérico
	public static <T> void llenaColeccion(LinkedList<Integer> cole, Integer e) {
		ListIterator<Integer> it = cole.listIterator(cole.size()/2);
		it.add(e);
	}
	

}
