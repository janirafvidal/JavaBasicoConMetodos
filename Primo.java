package Methods;

public class Primo {

	public static boolean esPrimo (int num) {
		
		if (num%2!=0) {
			for (int i=3; i<=num/2; i= i+2) {
			
				if (num%i ==0) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Utilidades.leerEntero("Introduce un entero :");
		
		System.out.println(esPrimo(num));
	}

}
