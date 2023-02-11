package hashmap_linkedhash_treemap_37;

import java.util.*;

public class TreeMap {
public static void main(String[] args) {
	TreeMap<String,String> treemap= new TreeMap<String,String>();  //
	treemap.put("20","Velocity");
	treemap.put("10","Pune");
	treemap.put("50","Software");
	//System.out.println(treemap);
	Set<String> s=treemap.keySet();
	for(String i:s) {
		System.out.println("key="+i);
		System.out.println("Value="+treemap.get(i));
	}
}

}