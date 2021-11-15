package pruebasComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Habitacion[] habitaciones = {
			new Habitacion("James", 01),
			new Habitacion("Marya", 02),
			new Habitacion("Thomas", 03),
			new Habitacion("Eduard", 04)
		};
		
		//Arrays.sort(habitaciones);
		Arrays.sort(habitaciones, new Comparator<Habitacion>() {
			public int compare(Habitacion first, Habitacion second) {
				return first.getName().compareTo(second.getName());
			}
		});
		
		
		for(Habitacion e: habitaciones) {
			System.out.println(e);
		}

	}

}
