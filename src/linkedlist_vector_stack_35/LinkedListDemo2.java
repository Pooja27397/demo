package linkedlist_vector_stack_35;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListDemo2 {
public static void main(String[] args) {
	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	linkedList.add(10);
	linkedList.add(40);
	linkedList.add(20);
	linkedList.add(30);
	linkedList.addFirst(70);
	//linkedList.addLast(80);
	int a=linkedList.get(3);
	System.out.println("4th index is="+a);
	
	//System.out.println("first way="+linkedList);
	
	Iterator<Integer> itr=linkedList.iterator();
	while(itr.hasNext());
	System.out.println(""+itr.next());
 
  for(Integer t:linkedList) {
	  System.out.println("Using for each loop="+t);
  }
}
}