package n1exercici8;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		LinkedHashMap <String, Empleado> rrhh = new LinkedHashMap<String, Empleado>();
		rrhh.put("z", new Empleado("Antonio", 34500));
		rrhh.put("f", new Empleado("Olga", 70500));
		rrhh.put("r", new Empleado("Sonia", 45000));
		rrhh.put("h", new Empleado("Fernando", 65000));
		
		TreeMap<String, Empleado> sortedList = new TreeMap<>(rrhh);
		//System.out.println(sortedList);
		
		
		for(Map.Entry<String, Empleado> e: sortedList.entrySet()) {
			rrhh.remove(e.getKey(), e.getValue());
			rrhh.put(e.getKey(), e.getValue());
			
		}
		System.out.println(rrhh);

		
		

	
		
	}

}
