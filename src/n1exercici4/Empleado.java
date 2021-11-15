package n1exercici4;

public class Empleado implements Comparable<Empleado> {

	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String dameDatos() {
		return "Nombre: "+nombre+", Sueldo: "+sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		return this.getNombre().compareTo(o.getNombre());
	}

	

	

	

	
	
	

	
	
}
