package string_29;

public class StringDemo3 {
public static void main(String[] args) {
	String s1="Velocity";
	String s2=new String("Pune");
	System.out.println(s1=s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
