package In.co.exception;

public class Multicatch {

	
	public static void main(String[] args) {
		String name = null;
		String name1 = "bhumi";
		int[] i = {1,2,3};
		int a = 10/2;
		
		try {
			
			System.out.println(name1.charAt(3));
			System.out.println(i[2]);
			System.out.println(a);
			System.out.println(name.charAt(2));
		}catch(NullPointerException e ) {
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e1){
			e1.printStackTrace();
			
			
			
		}catch(ArithmeticException e2) {
			e2.printStackTrace();
			
		}
		finally {
			System.out.println("finally");
		}
	}
	
}
