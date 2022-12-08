package string_29;

public class StringDemo1 {
public static void main(String[] args) {
	String s1= "Velocity";
	String s2=new String("Velocity");
	s2=s1;
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
}
