package n3exercici2;

import java.util.Arrays;

public class Contenedor {
	
	private int index = 0;
	private int[] lista;
	
	public Contenedor(){
		lista = new int[1];
	}
	
	public void add(int num) {
		boolean insercionCorrecta = false;
		while(!insercionCorrecta) {
			if(index < lista.length) {
				lista[index] = num;
				index++;
				insercionCorrecta = true;
			}else {
				ampliarArray();
			}
		}
	}
	
	public void ampliarArray() {
		lista = Arrays.copyOf(lista, lista.length + 1);
	}
	
	public void eliminarElemento(int elemento) {
		if(elemento < lista.length) {
			int indice = 0;
			int[] newArray = new int[lista.length - 1];
			for(int i = 0; i < lista.length; i++) {
				if(i != elemento) {
					newArray[indice] = lista[i];
					indice++;
				}
			}
			lista=newArray;
			index--;
		}else {
			System.out.println("Este valor supera el tamaño del array.");
		}
	}
	
	
	public void mostraArray() {
		for(int e: lista) {
			System.out.println(e);
		}
		System.out.println();
	}

}
