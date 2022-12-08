//Design the generic arraylist for string type only
package arraylist_34;

import java.util.ArrayList;

public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Ram");
	al.add("Rohit");
	al.add("radhika");
	for(String str:al) {
	System.out.println(" "+str);	
	}
}
}
