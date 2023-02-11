package hashmap_linkedhash_treemap_37;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo2 {

 public static void main(String[] args) {
	 LinkedHashMap<Integer, String> map=new LinkedHashMap();
	 map.put(10, "Ram");
	 map.put(10, "Yogesh"); //override
	Set<Integer> s=map.keySet();
	Iterator<Integer>itr=s.iterator();
	while(itr.hasNext()) {
	
	int i = itr.next();
	System.out.println("Key="+i);
	System.out.println("Value="+map.get(i));
 }
}

 }
