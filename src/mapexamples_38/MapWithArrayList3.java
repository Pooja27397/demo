package mapexamples_38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapWithArrayList3 {
public static void main(String[] args) {
List<String> computeraccessories=new ArrayList<String>();
  computeraccessories.add("Speaker");
  computeraccessories.add("Watch");
  computeraccessories.add("printer");
 
 List<String> electronics =new ArrayList<String>();
    electronics.add("Remote");
    electronics.add("Fan");
    electronics.add("Mouse");
    electronics.add("Freeze");
    
  List<String> furniture= new ArrayList<String>();
     furniture.add("Bed");
     furniture.add("Sofa");
     furniture.add("cupboard");
     
    HashMap<String,List<String>> categories=new HashMap<String,List<String>>();
       categories.put("Computer", computeraccessories);
       categories.put("Electronics", electronics);
       categories.put("Furniture", furniture);
       
     HashMap<String,HashMap<String,List<String>>> eshop=new HashMap<String,HashMap<String,List<String>>>();
           eshop.put("Eshop", categories);
         Set<String>  s=eshop.keySet();
         for(String str:s) {
        	 System.out.println(str);
        	 System.out.println(eshop.get(str));
         }
}
         }
           
        	   