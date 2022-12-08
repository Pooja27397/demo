package interwiew_3Dec;

public class DuplicateElement_Array {

//This is the final answer i dind't understand the question at time of interview
	 public static void main(String[] args) {
		 int[] a= {10,20,30,40,50,60,10,30,70};  //Initialization and declaration of array
		 System.out.println("Duplicate elments of array are>>");
		 for(int i=0;i<a.length;i++) {
			 for(int j=1+i;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 System.out.println(a[i]);
				 }
			 }
		 }
	 }
}