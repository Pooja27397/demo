package linkedlist_vector_stack_35;

import java.util.Vector;

public class Test {
public static void main(String[] args) {
	Vector v=new Vector();
	for(int i=1;i<=10;i++) {
		v.addElement(i);
	}
	System.out.println(v.capacity());
	v.addElement("Rakesh");
	System.out.println(v.capacity());
	System.out.println(v);
}
}