package mapexamples_38;
//Hoe to return map to method
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public HashMap<Integer,String> addEmployee(){
	HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
	hashmap.put(10, "Pooja");
	hashmap.put(20, "Tushar");
	hashmap.put(30, "Sruja");
	return hashmap;
}
public static void main(String[] args) {
	HashMapDemo hash=new HashMapDemo();
	System.out.println ("First way="+hash.addEmployee());
	HashMap<Integer,String> hashmap=hash.addEmployee();
	System.out.println("Second way="+hashmap);
	Map<Integer,String> map=hash.addEmployee();
	System.out.println("Third way="+map);
}
}