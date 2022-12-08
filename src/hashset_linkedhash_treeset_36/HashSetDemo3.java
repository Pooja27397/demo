package hashset_linkedhash_treeset_36;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo3 {
public static void main(String[] args) {
	HashSet<String> hashset=new HashSet<String>();
	hashset.add("10");
	hashset.add("20");
	hashset.add("30");
	hashset.add("40");
	hashset.add("Velocity");
	hashset.add("Pune");
	Iterator itr=hashset.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
