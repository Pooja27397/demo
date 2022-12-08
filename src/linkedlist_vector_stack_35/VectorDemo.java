package linkedlist_vector_stack_35;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<String> vector= new Vector<String>();
	vector.add("Ajay");
	vector.add("Velocity");
	vector.add("Pune");
	vector.add("Pune");
	System.out.println(vector);
	while(vector.contains("Pune")) {
		vector.remove("Pune");
	}
System.out.println("new vetor is="+vector);

 System.out.println("vector size="+vector.size());
  System.out.println("vector capacity="+vector.capacity());
  System.out.println("index="+vector.get(2));
  
 
}
}
