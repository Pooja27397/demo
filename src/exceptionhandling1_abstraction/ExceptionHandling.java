package exceptionhandling1_abstraction;

public class ExceptionHandling {
	//Arithmetic Exception
public static void main(String[] args) {
System.out.println("First line");
System.out.println("Second line");
System.out.println("Third line");
try {
int a= 10/0;
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println("Fourth line");
System.out.println("Fifth line");
}
}
