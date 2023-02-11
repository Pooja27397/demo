package revision;

public class Fabonacci {
	public static void main(String[] args) {
int number=7;
int a=0;
int b=1;
for(int i=1;i<=number;i++) {
	
		System.out.println(a+" ");
	
	int t=a;
	a=a+b;
	b=t;
}
}
}
