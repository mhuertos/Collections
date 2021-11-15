package n1exercici8;

public class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String nom, int sou) {
		this.nombre = nom;
		this.sueldo = sou;
	}
	
	public String getNombre() {
		return "Nombre: "+nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double nuevoSueldo) {
		sueldo = nuevoSueldo;
	}
	
	public String toString() {
		return "Nombre: "+nombre+", sueldo: "+sueldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
	

}
