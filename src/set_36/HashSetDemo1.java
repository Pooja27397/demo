package set_36;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo1 {
public static void main(String[] args) {
	LinkedHashSet hashset=new LinkedHashSet();
	hashset.add("ram");
	hashset.add("shyam");
	hashset.add(null);
	hashset.add(10);
	hashset.add("ram");
	System.out.println( hashset);
}
}


//It is exactly same as HashSet except
//1.. Insertion order is preserved
//2..Underlying data structure is hashtable+LinkedList




//3..Introduced in 1.4 version