package hashmap_linkedhash_treemap_37;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {

 public static void main(String[] args) {
	 Map<String,String> map=new HashMap<String,String>();
	 //enter name/url pair
	 map.put("Ram", "Patil");
	 map.put("Shyam", "Deshmukh");
	 map.put("Rahul","Manjusha");
			 
	 //forEach(action)method to iterate map
	 map.forEach((k,v)->
	 System.out.println("Key="+k+",Value="+v));
 }
 }
