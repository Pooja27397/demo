package hashset_linkedhash_treeset_36;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashset=new HashSet();
	hashset.add(10);
	hashset.add(20);
	hashset.add(30);
	hashset.add(40);
	hashset.add(20);
	
	//System.out.println(hashset);
	for(Object j:hashset) {
		System.out.println(j);
	}
}
}
//Duplicates are not allowed
//but at compile we cant get any error but if you run the program 
// then duplicate element are not shown in output. 