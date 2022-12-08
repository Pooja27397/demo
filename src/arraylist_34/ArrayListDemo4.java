//How to sort ArrayList
package arraylist_34;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(50);
	al.add(60);
	al.add(40);
	al.add(70);
	al.add(80);
	al.add(30);
	
	Collections.sort(al);
	System.out.println(al);
}

}
//In ArrayList we can sort only homogenous elements like integer And String seperately
//can not sort hetrogenous elements that is combination og both string & integer
//In notes having String Example