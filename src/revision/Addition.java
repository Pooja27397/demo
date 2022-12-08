package revision;

public class Addition {
	public int getAddNumber(int number) {
		return number;
	}
	
	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		Addition add=new Addition();
				add.getAddNumber((a+b));
	System.out.println("Addition of two numbers:"+(a+b));
	}
}
