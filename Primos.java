package Methods;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 3; num <= 100; num = num + 2) {

			if (Primo.esPrimo(num)) {
				System.out.println(num + " es un numero primo");
			}
		}

	}

}
