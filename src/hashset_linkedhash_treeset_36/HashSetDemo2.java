package hashset_linkedhash_treeset_36;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
public static void main(String[] args) {
	HashSet<String> hashset=new HashSet<String>();
	//16 internally size increase
	hashset.add("10");
	hashset.add("20");
	hashset.add("30");
	hashset.add(null);
	Iterator<String> itr=hashset.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
