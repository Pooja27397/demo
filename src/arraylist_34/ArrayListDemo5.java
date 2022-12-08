//Merge two arrayList into one ArrayList
package arraylist_34;

import java.util.ArrayList;

public class ArrayListDemo5 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Pooja");
	al.add("Ashwini");
	al.add("Sagar");
	al.add("sonali");
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("Rakesh");
	al1.add("Tushar");
	al1.add("Srujan");
	ArrayList<String> al2=new ArrayList<String>();
	al2.addAll(al);
	al2.addAll(al1);
	System.out.println("Merge list element is"+al2);
} 
}
//we can not merge the heterogeneous elements
//In notes having integer value