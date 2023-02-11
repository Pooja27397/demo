package hashset_linkedhash_treeset_36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashSet2 {

public static void main(String[] args) {
	ArrayList arraylist=new ArrayList();
	arraylist.add(50);
	arraylist.add(75);
	arraylist.add(50);
	arraylist.add(75);
	System.out.println("List is:"+arraylist);
	HashSet hashset=new HashSet(arraylist);
	//System.out.println("New element is:"+hashset);
	Iterator itr=hashset.iterator();
	while(itr.hasNext());
	System.out.println(itr.next());
}
}
