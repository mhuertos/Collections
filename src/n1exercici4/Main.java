package n1exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		ArrayList <Empleado> mis_empleados = new ArrayList <Empleado>();
		mis_empleados.add(new Empleado("Pedro Gimenez", 25000));
		mis_empleados.add(new Empleado("Jose Gutierrez", 50000));
		mis_empleados.add(new Empleado("Marina Dozveya", 50000));
		
		//Iteraccion.iterCollection(mis_empleados);
		
		HashSet <Empleado> e = new HashSet <Empleado>();
		e.add(new Empleado("Pedro Gimenez", 25000));
		e.add(new Empleado("Jose Gutierrez", 50000));
		e.add(new Empleado("Marina Dozveya", 50000));
		
		//Iteraccion.iterCollection(e);
		
		LinkedList <Empleado> mis_emp = new LinkedList <Empleado>();
		mis_emp.add(new Empleado("Pedro Gimenez", 25000));
		mis_emp.add(new Empleado("Jose Gutierrez", 50000));
		mis_emp.add(new Empleado("Marina Dozveya", 50000));
		
		//Iteraccion.iterCollection(mis_emp);
		
		TreeSet <Empleado> mis_e = new TreeSet <Empleado>();
		mis_e.add(new Empleado("Pedro Gimenez", 25000));
		mis_e.add(new Empleado("Jose Gutierrez", 50000));
		mis_e.add(new Empleado("Marina Dozveya", 50000));
		
		Iteraccion.iterCollection(mis_e);
		
	}

}
