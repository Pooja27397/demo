package hashset_linkedhash_treeset_36;

import java.util.HashSet;

public class hashSetDemo4 {

public static void main(String[] args) {
	HashSet hashset= new HashSet();
	hashset.add(10);
	hashset.add(20);
	hashset.add(30);
	hashset.add("Velocity");
	hashset.add("Pune");
	//System.out.println(hashset.remove("velocity"));
	//System.out.println(hashset);
	//System.out.
HashSet hashset1=new HashSet();
hashset1.add(40);
hashset1.add(50);
hashset1.add(60);
hashset.addAll(hashset1);
//System.out.println(hashset);
HashSet hashset2=new HashSet();
hashset2.add("Mumbai");
hashset2.add("Delhi");
hashset.addAll(hashset2);
System.out.println(hashset);
}
}


