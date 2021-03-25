package Methods;

public class EsTriangulo {

	public static boolean esTriangulo (int num1, int num2, int num3) {
		
		if (num1 > num2 + num3) {
			return false;
			
		}else if (num2 > num1 + num3) {
			return false;
			
		}else if (num3 > num2 + num1) {
			return false;
			
		}else {
			return true;
		}
	}
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(esTriangulo(12,2,3));
		
	}

}
