
public class ExceptionDemo {
	String str=null;
	public static void main(String[] args) {
		int numerator=10;
		int denominator=5;
		float total =0;
		ExceptionDemo ed=null;
		int[] scores=new int[5];
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		System.out.println("statement 4");
		System.out.println("statement 5");
		try {
			total = numerator/denominator; //jvm creates an object for ArithmeticException
			scores[2]=90;				  // ArrayIndexOutOfBoundsException				
			System.out.println(ed.hashCode());//NullPointerException
		}catch(ArithmeticException e) {// handler
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getCanonicalName());
			System.out.println(e.getStackTrace().clone());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getCanonicalName());
			System.out.println(e.getStackTrace().clone());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getCanonicalName());
			System.out.println(e.getStackTrace().clone());
		}
		finally {
			System.out.println("This is finally");
		}
		
		System.out.println("The total is: "+total);
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
	}
}
