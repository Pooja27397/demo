package revision;

import java.util.Scanner;
//You can solve it by using scanner class only. if you dont know logic for method..

public class FabonacciScanner {
public static void getFabonacciNum(int number)	{


int a=0;
int b=1;

for(int i=1;i<=number;i++) {
	System.out.println(a+"");
	int t=a;
	a=a+b;
	b=t;
}
}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	  getFabonacciNum(num);
  }
  }