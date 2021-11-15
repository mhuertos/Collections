package pruebasArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Coche> lista = new ArrayList<Coche>();
		lista.add(new Coche("Audi", 3));
		lista.add(new Coche("Zerrari", 2));
		lista.add(new Coche("Renault", 4));
				
		//lista.remove(new Coche("Zerrari", 2));
		Collections.sort(lista);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
	}

}
