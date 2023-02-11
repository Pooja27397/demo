package revision;

public class ArrayDuplicateElement {
	public static void main(String[] args) {
	
int[] a= {10,30,40,20,50,80,40,10,90,30};
  int size=a.length;
  System.out.println("Duplicate elements of array are::");
     
       for(int i=0;i<size;i++) {
    	   for(int j=1+i;j<size;j++) {
    		   if(a[i]==a[j]) {
    			   System.out.println(a[i]);
    		   }
    	   }
       }

}
}