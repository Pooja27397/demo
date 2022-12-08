//program for demostrate the arraylist method
package arraylist_34;

import java.util.ArrayList;

public class ArrayListDemo3 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	System.out.println("Size of list is="+al.size());
	System.out.println("List="+al);
	System.out.println(al.contains(20));  //it is used to check the number is available or not in that
	//if it is available it will give the output true and not available then false
}
}
