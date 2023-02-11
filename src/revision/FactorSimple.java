package revision;

public class FactorSimple {
	
	//Factor means the number which is divisible by how many numbers.
	public static void main(String[] args) {
		int a=1;
		int num=256;
		while(a<=num) {
		
			if(num%a==0) {
				System.out.println(a);
			}
			a++;
		}
	}

}
