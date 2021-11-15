package n2exercici1;

import java.util.Random;

public class IntegerRandom implements Comparable<IntegerRandom>{
	
	private int numero;
	
	public IntegerRandom() {
		Random rdm = new Random();
		numero = rdm.nextInt(101);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(IntegerRandom o) {
		//return this.getNumero()-o.getNumero();
		return this.getNumero()-o.getNumero();
	}

	@Override
	public String toString() {
		return "[numero=" + numero + "]";
	}
	
	

}
