package pruebasArrayList;

import java.lang.Comparable;
import java.util.Objects;

public class Coche implements Comparable<Coche>{
	
	private String marca;
	private int largo;
	
	public Coche() {
		
	}
	
	public Coche(String marca, int largo) {
		this.marca = marca;
		this.largo = largo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", largo=" + largo + "]";
	}

	@Override
	public int compareTo(Coche o) {
		return this.getMarca().compareTo(o.getMarca());
	}

	@Override
	public int hashCode() {
		return Objects.hash(largo, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Coche)) {
			return false;
		}
		Coche other = (Coche) obj;
		return largo == other.largo && Objects.equals(marca, other.marca);
	}

	


	
	
	

}
