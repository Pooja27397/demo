package set_36;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet hashset=new HashSet();
	hashset.add("Ram");
	hashset.add("Shayam");
	hashset.add("null");
	hashset.add(10);
	hashset.add("Shayam");
	System.out.println(hashset);
}
}
//Duplicates not allowed in hashSet but if you try to insert they wont get any compile.
//after run the program not show duplicate element only one element is allowed in output.
// In HashSet insertion order is not preserved.
//Duplicates not allowed
//Heterogeneous objects are allowed
//null insertion is possible