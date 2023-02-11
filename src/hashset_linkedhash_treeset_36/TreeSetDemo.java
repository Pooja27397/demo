package hashset_linkedhash_treeset_36;

import java.util.TreeSet;

public class TreeSetDemo {

public static void main(String[] args) {
	TreeSet treeset=new TreeSet();
	treeset.add("Velocity");
	treeset.add("Pune");
	treeset.add("Rahul");
	//treeset.add(30);  //Hetrogeneous objects are not allowed at run time we will get exception as ClassCastException
	//treeset.add(null); //null also not allowed at run time get error as NullPointerException
	System.out.println("First Set="+treeset);
	TreeSet treeset1=new TreeSet();
	treeset1.add(50);
	treeset1.add(10);
	treeset1.add(100);
	System.out.println("Second set:"+treeset1);
}
}
 