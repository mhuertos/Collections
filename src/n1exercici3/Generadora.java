package n1exercici3;

import java.util.Arrays;

public class Generadora {
	
	private String pers[]  =new String[7];
    private static int index = 0; //La declaro static para determinar que es variable de clase, no de objeto.
    
    public Generadora() {
        pers[0] = "Pedro";
        pers[1] = "Ravioli";
        pers[2] = "Thomas";
        pers[3] = "Ramon";
        pers[4] = "Lubina";
        pers[5] = "Sonia";
        pers[6] = "Carabina";
    }
    
   
    public String next() {
        int temp=index;
        index = index+1;
        index = index%pers.length;
        return pers[temp];
    }
    
    public int getLength() {
    	return pers.length;
    }


	@Override
	public String toString() {
		return "Generadora [pers=" + Arrays.toString(pers) + "]";
	}

}
