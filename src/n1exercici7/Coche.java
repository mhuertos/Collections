package n1exercici7;

public class Coche implements Comparable<Coche>{
	
	private String marca;
	private int caballos;
	
	public Coche(String m, int c) {
		marca = m;
		caballos = c;
	}
	
	public String toString() {
		return " [Marca: "+marca+". Potencia: "+caballos+" caballos]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caballos;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Coche))
			return false;
		Coche other = (Coche) obj;
		if (caballos != other.caballos)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		return true;
	}

	@Override
	public int compareTo(Coche o) {
		return this.hashCode()-o.hashCode();
	}
	
	

	
}
