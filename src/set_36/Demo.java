package set_36;

import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add("Jay");
	ts.add("ram");
	ts.add("Shyam");
	System.out.println(ts);
}
}
//In the TreeSet insertion order is not preserved
//If you are try to insert the hetrogeneous objects then it will get the run time exception like classcastexception.
//Null insertion is not possible, if you try to insert the null then it will get run time error as NullPointerException.
 




