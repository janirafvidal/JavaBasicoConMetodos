package Methods;

public class EsDivisible {

	public static boolean esDivisible (int num1, int num2) {
		
		if (num1%num2==0) {
			return true;
		}return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(esDivisible(8,4));
		
	}

}
