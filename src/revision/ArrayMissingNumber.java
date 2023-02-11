package revision;

public class ArrayMissingNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7,8,9,10};  //array declaration and initialization
		  int size=a.length; //storing array length in variable
		  for(int num=1;num<=size;num++) { //checking number from 1 to max number in array
			  int count=0;  //variable to
			 // count occurance of number
			  for(int j=0;j<size;j++) {  //a loop to compare each element
				  if(num==a[j]) {
				  count++;
			  }
			  }
		        if(count==0) {  //If the number is not present i.e. count is zero
		        	 System.out.println("Missing number is>>"+num);
		        	 //print the number
		        	 
			  
			  
		  }
		  }
	}
}
