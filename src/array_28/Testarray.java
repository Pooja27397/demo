package array_28;
//Java program to illustrate how to declare, instantiate, initialize
//&traverse the Java array

public class Testarray {
public static void main(String[] args) {
	int a[]=new int[6];  //declaration& instantiation
	a[0] = 10;
	a[1] =20;
	a[2]  =30;
	a[3] =40;
	a[4] =50;
	a[5] =60;
	//traversing array
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}}
}



