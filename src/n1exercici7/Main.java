package n1exercici7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Integer, Coche> garaje = new HashMap<Integer, Coche>();
		
		garaje.put(0, new Coche("Audi", 200));
		garaje.put(1, new Coche("Porche", 450));
		garaje.put(2, new Coche("Seat", 150));
		garaje.put(3, new Coche("Honda", 240));
		
		/*for(Map.Entry<Integer, Coche> e: garaje.entrySet()) {
			System.out.println(e.hashCode());
		}*/
		
		//Ordenación del HashMap por método BubbleSort a partir del hashCode;
		for(int i = 0; i < garaje.size(); i++) {
			for(int j = i+1; j < garaje.size(); j++) {
				if(garaje.get(i).compareTo(garaje.get(j)) > 0){
					Coche canvi = garaje.get(i);
					garaje.replace(i, garaje.get(i), garaje.get(j));
					garaje.replace(j, garaje.get(j), canvi);
				}
			}
		}
		
		/*for(Map.Entry<Integer, Coche> e: garaje.entrySet()) {
			System.out.println(e.getValue());
		}*/
		
		/////////////////////////////////////////////////////////
		
		LinkedHashMap <Integer, Coche> linkhs = new LinkedHashMap <Integer, Coche>();
		
		for(Map.Entry<Integer, Coche> e: garaje.entrySet()) {
			linkhs.put(e.getKey(), e.getValue());
		}
		
		System.out.println(linkhs);
		
		/////////////////////////////////////////////////////////
		
		
		LinkedHashSet <Coche> lhs = new LinkedHashSet <Coche>();
		
		for(Map.Entry<Integer, Coche> e: garaje.entrySet()) {
			lhs.add(e.getValue());
		}
		
		System.out.println(lhs);
		
		/////////////////////////////////////////////////////////
		
		HashSet<Coche> hs = new HashSet<Coche>();
		
		for(Map.Entry<Integer, Coche> e: garaje.entrySet()) {
			hs.add(e.getValue());
		}
		
		System.out.println(hs);
		
	}
}
