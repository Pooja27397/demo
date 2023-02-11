package comparable_comparator_39;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee(101,"Ramesh",9000));
	al.add(new Employee(102,"Anjali", 10000));
	al.add(new Employee(103,"Pooja",12000));
	  Collections.sort(al);
	 for(Employee emp:al) {
		 System.out.println("id>>" +emp.getId()  +"name>>" +emp.getName()  +"Salary>>" +emp.getSalary());
	  }
} 
}