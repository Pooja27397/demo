package mapexamples_38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

//ArrayList with HashMap Example
public class MapWithArrayList1 {
 public static void main(String[] args) {
	 List<String> computeraccessories=new ArrayList<String>();
	 computeraccessories.add("Watch");
	 computeraccessories.add("Speaker");
	 computeraccessories.add("Laptop");
	 
	 List<String> electronics=new ArrayList<String>();
	 electronics.add("keyboard");
	 electronics.add("mouse");
	 electronics.add("printer");
	 
	 List<String> furniture=new ArrayList<String>();
	 furniture.add("bed");
	 furniture.add("chair");
	 furniture.add("Sofa");
	 //Categories as key& value as ArrayList
	 HashMap<String,List<String>> categories=new HashMap<String,List<String>>();
	 categories.put("Computer", computeraccessories);
	 categories.put("Electronics", electronics);
	 categories.put("Furniture", furniture);
 //eshop as key string value  as hashmap
	 HashMap<String,HashMap<String,List<String>>> eshop=
	 new HashMap<String,HashMap<String,List<String>>>();
	 eshop.put("Eshop", categories);
	 
	 //How to itearte
	 Set <String> s=eshop.keySet();  //only key s contain e shop
	for(String str:s) {
		 System.out.println(str);
		 System.out.println(eshop.get(str));
		 
	 }
 
}
}