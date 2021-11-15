package n3exercici2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		long tiempo_inici = System.currentTimeMillis();
		Contenedor numeros = new Contenedor();
		numeros.add(23);
		numeros.add(2);
		numeros.add(26);
		numeros.add(8);
	
		numeros.mostraArray();
		
		numeros.eliminarElemento(3);
		numeros.mostraArray();
	
		numeros.add(45);
		numeros.mostraArray();
		
		long tiempo_final = System.currentTimeMillis();
		long tiempo_total = tiempo_final - tiempo_inici;
		System.out.println("Duración de la operación con ArrayList: "+tiempo_total);
		
		
		/////////////////////////////////////////////
		long tiempo_inici_2 = System.currentTimeMillis();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(15);
		nums.add(19);
		nums.add(54);
		
		System.out.println(nums);

		nums.remove(3);
		System.out.println(nums);
		
		nums.add(78);
		System.out.println(nums);
		
		long tiempo_final_2 = System.currentTimeMillis();
		
		long tiempo_total_2 = tiempo_final - tiempo_inici;
		System.out.println("Duración de la operación con ArrayList: "
		+tiempo_total+" milisegundos");
	}
}
