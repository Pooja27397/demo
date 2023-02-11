package revision;

import java.util.Scanner;

public class CountingString {
	/*
	 * 1..Design a method for counting the alphabet, vowels, & numbers from String.
	 * Input should be from user into main method& pass that to methods. And result
	 * will print into main method.
	 */
	//Declaring the static variables for counting the alphabet,vowels & numbers
		 private int countAlphabet;
		 private int countVowels;
		 private int countNumbers;
		  //Method for counting alphabets
		  public int getAlphabetCounts(String inputData) {
			   //Iterate the loop for reading the values from input string
			  for(int i=0;i<inputData.length();i++) {
				  //Get count for alphabet & vowels
				  if(inputData.charAt(i)<= 'Z'&& inputData.charAt(i) >= 'A'
		 		|| inputData.charAt(i)<='z' && inputData.charAt(i)>='a') 
					  countAlphabet++;
					  
				  }
				  return countAlphabet;
			  }
			  
			  // Method for counting vowels
			 public int getVowelsCounts(String inputData) {
				 //iterate the loop for reading the values from input string
				 for(int i=0;i<inputData.length();i++) {
					 if(inputData.charAt(i)=='a' || inputData.charAt(i)=='e' || inputData.charAt(i)=='i'
							|| inputData.charAt(i)=='o' || inputData.charAt(i)=='u'
						|| inputData.charAt(i)=='A' || inputData.charAt(i)=='E'
						|| inputData.charAt(i)=='I' || inputData.charAt(i)=='O'
						 || inputData.charAt(i)=='U') 
				 countVowels++;
					 }
					 return countVowels;
				 }
		 
			 // Method for counting numbers
			 public int getNumbersCounts(String inputData) {
				 // Iterate the loop for reading the values from input string
				 for(int i=0;i<inputData.length();i++) {
					 //Get count for numbers
					 if(inputData.charAt(i)<='9' && inputData.charAt(i)>=0)
						 countNumbers++;
				 }
				 return countNumbers;
				  
			 } 
		public static void main(String[] args) {
			//Object Creation
			CountingString countingstring=new CountingString();
			 //Taking user input String
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input string");
		String inputvalue = scanner.nextLine();
		 
		//Get vowels, alphabets &   number counts from  input string
		System.out.println("Alphabets count in input string>>"+countingstring.getAlphabetCounts(inputvalue));
		System.out.println("Vowels count in input string>>"+countingstring.getVowelsCounts(inputvalue));
		 
		 System.out.println("Numbers count in input string>>"+countingstring.getNumbersCounts(inputvalue));
		}
	}
		
		
			


