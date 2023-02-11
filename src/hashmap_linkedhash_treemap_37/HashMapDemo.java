package hashmap_linkedhash_treemap_37;

import java.util.HashMap;
import java.util.Set;

//Example 1

public class HashMapDemo {
public static void main(String[] args) {
HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
  hashmap.put(10, "Ramesh");
  hashmap.put(20, "Rohit");
  hashmap.put(30, "Radhika");
  Set<Integer> s=hashmap.keySet();
  for(int i:s) {
	  System.out.println("Key="+i);
	  System.out.println("Value="+hashmap.get(i));
  }
  }
  }
   //get method is used to get the respective value of the key