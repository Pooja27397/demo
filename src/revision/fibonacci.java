package revision;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=scanner.nextInt();
int a=0;
int b=1;

for(int i=1;i<=number;i++) {
	System.out.println(a+"");
	int t=a;
	a=a+b;
	b=t;
}
}
}