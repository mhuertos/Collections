package n1exercici4;

import java.util.Collection;
import java.util.Iterator;

public class Iteraccion {
	
	public static <T> void iterCollection (Collection<T> empleados) {
		Iterator<T> mi_it = empleados.iterator();
		while(mi_it.hasNext()) {
			System.out.println(mi_it.next().toString());
		}
	}

}
