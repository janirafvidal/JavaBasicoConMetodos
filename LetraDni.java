package Methods;

public class LetraDni {

	public static char letraDni (int dni) {
		
		char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
				'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 
				'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int resto = dni%23;
		
		return letras[resto];
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dni = Utilidades.leerEntero("Introduce DNI :");
		
		System.out.println(dni +" "+letraDni(dni));
		
	}

}
