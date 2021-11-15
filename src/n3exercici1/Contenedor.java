package n3exercici1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contenedor {
	
	private String[] lista;
	private int index = 0;
	
	public Contenedor() {
		lista = new String[3];
	}
	
	
	
	public void add(String nuevaStr) {
		boolean valorIntroducido=false;
		while(!valorIntroducido) {
			if(arrayLlena()) {
				aumentaLengthArray();
			}else {
				lista[index] = nuevaStr;
				index++;
				valorIntroducido = true;
			}
		}
	}
	
	
	
	
	public int length() {
		return lista.length;
	}
	
	

	public boolean arrayLlena() {
		if(index == lista.length) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

	private void aumentaLengthArray() {
		lista = Arrays.copyOf(lista, lista.length + 1);
	}
	
	
	
	
	public void eliminaElement(int indexElemento) {
		if(indexElemento < lista.length) {
			String[] nuevaArray = new String[lista.length -1];
			int indice = 0;
			for(int i = 0; i < lista.length; i++) {
				if(i != indexElemento) {
					nuevaArray[indice] = (String)Array.get(lista, i);
					indice++;
				}
			}
			lista = nuevaArray;
			index--;
		}else {
			System.out.println("El valor introducido como parámetro no se corresponde con una posición del array.");
		}
	}
	
	
	
	
	
	public void mostraArray(){
		for(String e: lista) {
			System.out.println(e);
		}
	}
}
