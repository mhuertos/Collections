package pruebaHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		ArrayList<Coche> lista = new ArrayList<Coche>();
		Set <Coche> vehiculos= new HashSet <Coche>();
		
		lista.add(new Coche("Audi", 3));
		vehiculos.add(new Coche("Audi", 3));
		lista.add(new Coche("Zerrari", 2));
		vehiculos.add(new Coche("Zerrari", 2));
		lista.add(new Coche("Renault", 4));
		vehiculos.add(new Coche("Zerrari", 2));
		lista.add(new Coche("Renault", 4));
		vehiculos.add(new Coche("Renault", 4));
		lista.add(new Coche("Zerrari", 2));
				
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for(Coche e: vehiculos) {
			System.out.println(e);
		}
		
		
	}

}
