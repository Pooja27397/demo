package mapexamples_38;

import java.util.HashMap;

public class EmployeeHash {
public static void main(String[] args) {
	HashMap<Employee,String> hashmap=new HashMap<Employee,String>();
	Employee employee=new Employee();
	hashmap.put(employee, employee.getSalary());
	System.out.println(hashmap.get(employee));
hashmap.put(employee, employee.getName());
System.out.println(hashmap.get(employee));
HashMap<Employee,Integer> hash=new HashMap<Employee,Integer>();
hash.put(employee, employee.getId());
System.out.println(hash.get(employee));
}

	
	
		
	}