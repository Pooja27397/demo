package exceptionhandling1_abstraction;

public class ArithmaticException {
	/*
	 * example for reference>> try with two catch blocks in this we have follow the
	 * exception sequence that is child to parent.
	 */
	public static void main(String[] args) {
		System.out.println("line number1");
		System.out.println("line number2");
		try {
			int a=10/0;//risky code
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		
		}
	  finally {
		  System.out.println("this is the finally block");	
		
		}
	}
}
