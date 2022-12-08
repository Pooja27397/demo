package string_29;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1=new String("Velocity");
		String s2=new String("Pune");
		s2=s1;
		System.out.println(s2==s1);
		System.out.println(s1.equals(s2));
			
	}

}
