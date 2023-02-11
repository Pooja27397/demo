package encapsulation_14;

import java.util.Scanner;

public class MainMethod {
public static void getUserInput() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=scanner.nextInt();
	System.out.println("Enter the name");
	String name=scanner.next();
	System.out.println("Enter the city");
	String city=scanner.next();
		
	
Student student =new Student();
student.setId(id);
student.setName(name);
student.setCity(city);
System.out.println("Id:"+student.getId());
System.out.println("Name:"+student.getName());
System.out.println("City:"+student.getCity());

} 
public static void main(String[] args) {
	getUserInput();
}
}
