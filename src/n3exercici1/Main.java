package n3exercici1;

public class Main {
	

	public static void main(String[] args) {
		Contenedor obj = new Contenedor();
		obj.add("Saldaf");
		obj.add("Minerva");
		obj.add("Oscar");
		obj.add("Salazar");
		obj.add("Lawrence");
		
		obj.mostraArray();
		System.out.println();
		/////////////////////////////////
		obj.eliminaElement(1);
		obj.add("Terrence");
		obj.mostraArray();
		
		
		
	}

}
