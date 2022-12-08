//create the arraylist for user defined type for student
package arraylist_34;

import java.util.*;

public class ArrayListDemo6 {
public static void main(String[] args) {
	ArrayList<Student> arraylist=new ArrayList<Student>();
	arraylist.add(new Student(20,"ram","25000"));
	arraylist.add(new Student(10,"ramesh","9000"));
	//By using Iterator
	Iterator<Student> itr=arraylist.iterator();
	while(itr.hasNext()) {
		System.out.println("student list>>"+itr.next());
		
	}
// By using for each Loop
	for(Student e1:arraylist) {
		System.out.println("data is>>"+e1);
	}
}
	}
//In notes having Employee class
//But I am taking Student as a class but the elements are same as notes