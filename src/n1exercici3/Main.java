package n1exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
 

	public static void main(String[] args) {
		Generadora obj = new Generadora();
		
		//Rellenamos Array y la mostramos
		String[] arrayActores = new String[obj.getLength()];
		for(int i=0; i < arrayActores.length; i++) {
			arrayActores[i] = obj.next();
			System.out.print(arrayActores[i]+" ");
		}
		System.out.println();
		
		//Rellenamos un ArrayList y lo mostramos
		ArrayList<String> arrayListActores = new ArrayList<String>();
		for(int i = 0; i< 15; i++) {
			arrayListActores.add(obj.next());
		}
		System.out.println(arrayListActores);
		
		//Rellenamos un LinkedList y lo mostramos
		LinkedList<String> arrayLinkedList = new LinkedList<String>();
		for(int i = 0; i < 15; i++) {
			arrayLinkedList.add(obj.next());
		}
		System.out.println(arrayLinkedList);
		
		//Rellenamos un HashSet y lo mostramos:
		HashSet<String> arrayHashSet = new HashSet<String>();
		for(int i = 0; i < 15; i++) {
			arrayHashSet.add(obj.next());
		}
		System.out.println(arrayHashSet);
		
		//Rellenamos un TreeSet
		TreeSet<String> ts = new TreeSet<String>();
		for(int i = 0; i < 15; i++) {
			ts.add(obj.next());
		}
		System.out.println(ts);
		
	}

}
