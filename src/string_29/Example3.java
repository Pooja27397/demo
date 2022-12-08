package string_29;

public class Example3 {
public static void main(String[] args) {
	String str="Velocity training centre pune";
	int Counter=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch== '') {
			Counter++;
		}
	}
	System.out.println("Total space in string are"+Counter);
}
}



