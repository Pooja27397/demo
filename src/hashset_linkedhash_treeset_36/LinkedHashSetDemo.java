package hashset_linkedhash_treeset_36;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

public static void main(String[] args) {
	LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<Integer>();
	linkedhashset.add(10);
	linkedhashset.add(20);
	linkedhashset.add(30);
	//System.out.println(linkedhashset);
     for(int j:linkedhashset) {
    	 System.out.println(j);
     }
     }
}
