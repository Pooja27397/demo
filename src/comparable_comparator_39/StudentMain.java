package comparable_comparator_39;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(101,"Pooja",40000));
	al.add(new Student(102,"Tushar",25000));
	al.add(new Student(103,"Srujan",60000));
	Collections.sort(al,new NameComparator());
			for(Student stu:al) {
				System.out.println("id>>"+stu.getId()+"name>>"+stu.getName()+"Salary>>"+stu.getSalary());
			}

}
}
