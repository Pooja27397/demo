package revision;

import java.util.Scanner;

public class FactorScanner {
	
		public static void m2(int num) {
			
			int b=1;
			while(b<=num)
			{
				if(num%b==0) {
			System.out.println(b);	
		   }
				b++;
			}
		}
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a number");
			int fact=scanner.nextInt();
			
			System.out.println("factors of number"+fact+"is=");
			
			m2(fact);
		
		}
	}

