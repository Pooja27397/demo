package hashmap_linkedhash_treemap_37;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo1 {
public static void main(String[] args) {
	HashMap<Integer,String> map= new HashMap<Integer,String>();
	map.put(10, "Radhika");
	map.put(40, "Pooja");
	map.put(50, "Harshali");
	
	Set<Integer> s=map.keySet();  //s contain all the keys only ie we can use only integer here
	Iterator<Integer> itr=s.iterator();
	while(itr.hasNext()) {
		
		int i=itr.next();
System.out.println("key="+i);
System.out.println("Value="+map.get(i));
}
}
}