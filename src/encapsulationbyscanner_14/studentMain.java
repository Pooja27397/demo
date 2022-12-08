package encapsulationbyscanner_14;

import java.util.Scanner;

public class studentMain {
public static void getUserInput() {
	System.out.println("enter StudentId:");
	Scanner scanner= new Scanner(System.in);
	int id=scanner.nextInt();
	System.out.println("Enter the name:");
	String name=scanner.next();
	System.out.println("Enter the city");
	String city=scanner.next();
	System.out.println("Enter RollNo");
	int rollno=scanner.nextInt();

	Student student=new Student();
	student.setStudentId(id);
	student.setStudentName(name);
	student.setStudentCity(city);
	student.setStudentRollNo(rollno);
System.out.println("Student Id:"+student.getStudentId());
System.out.println("Student Name :"+student.getStudentName());
System.out.println("Student City:"+student.getStudentName());
System.out.println("Student RollNo:"+student.getStudentRollNo());
}
public static void main(String[] args) {
	getUserInput();
}
	
}
	
	

