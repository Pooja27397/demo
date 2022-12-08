package scanner_used_10;

import java.util.Scanner;

public class Student {

public int add(int a, int b) {
	int c=a+b;
	return c;
}

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first number");
	int firstnumber=scanner.nextInt();
	System.out.println("Enter the second number");
	int secondnumber=scanner.nextInt();
	System.out.println("First Number:"+firstnumber);
	System.out.println("Second Number"+secondnumber);
	
	Student student=new Student();
	int add=student.add(firstnumber, secondnumber);
	System.out.println("Addition:"+add);
}
}