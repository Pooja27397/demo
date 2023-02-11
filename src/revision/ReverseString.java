package revision;

public class ReverseString {
	public static void main(String[] args) {
		String name="Pooja";
		int lang=name.length();   //length method is used to calculate the number of character in the String
		String rev=" ";
		for(int i=lang-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		} 
		System.out.println("Reverse of"+name+"is::"+rev);
		}
	}


