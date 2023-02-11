package hashset_linkedhash_treeset_36;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

public static void main(String[] args) {
	LinkedHashSet linkedhashset=new LinkedHashSet();
	 linkedhashset.add(10);
	 linkedhashset.add(20);
	 linkedhashset.add(30);
	 linkedhashset.add("Pune");
	 linkedhashset.add("Velocity");
	 linkedhashset.add("Velocity");
	// System.out.println(linkedhashset);
  Iterator itr=linkedhashset.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
  }
}
