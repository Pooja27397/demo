package revision;

import java.util.Scanner;

public class PrimeNum {
/*write a java program to check number is prime or not.
prime number means number which is divisible by 1 and itself.
If number is divisible by any other number expect mentioned then
is not prime number*/
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a number");
			int number=scanner.nextInt();
		
		//int number=7;
		int count=0;
		for(int i=number;i>0;i--) {
			if(number%i==0) {
				count++;
			}
			}
		if(count>2) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is prime");
		}
}
}