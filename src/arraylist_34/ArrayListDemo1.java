//Design the generic arraylist for integer type only
package arraylist_34;

import java.util.ArrayList;

public class ArrayListDemo1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	for(int i:al) {
		System.out.println(" "+i);
	}
}
}
