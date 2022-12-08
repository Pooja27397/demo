package revision;

import java.util.Scanner;

public class PrimeScanner {
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number");
int no=scanner.nextInt();
int count=0;
for(int i=no;i>0;i--) {
	if(no%i==0) {
		count++;
	}
}
if(count>2) {
	System.out.println("Number is not prime");
}else {
	System.out.println("Number is prime");
}
}
}
