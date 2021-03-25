package Methods;

public class Positivos {

	public static int positivosArray (int[] numeros) {
		
		int total=0;
		
		for (int numero:numeros) {
			if (numero > 0) {
				total++;
			}
		}
		
		return total;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int [20];
		
		Utilidades.rellenaArray(array, -10, 10);
		
		System.out.println("Hay " + positivosArray(array) +" positivos");
	}

}
