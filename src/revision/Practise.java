package revision;

import java.util.Scanner;
public class Practise {
	private int countAlphabet;
	private int countVowels;
	public int getAlphabetCount(String inputData) {
		int size=inputData.length();
		for(int i=0;i<size;i++) {
			if(inputData.charAt(i)<='Z'&& inputData.charAt(i)>='A'
		|| inputData.charAt(i)<='z'&&inputData.charAt(i)>='a') 
				countAlphabet++;
			} 
			return countAlphabet;
		}
	public int getVowelsCount(String inputData) {
		int size=inputData.length();
		for(int i=0;i<size;i++) {
		if(inputData.charAt(i)=='a'|| inputData.charAt(i)=='e'||
		inputData.charAt(i)=='i' || inputData.charAt(i)=='o'|| inputData.charAt(i)=='u'
		|| inputData.charAt(i)=='A' || inputData.charAt(i)=='E'|| inputData.charAt(i)=='I'
		||inputData.charAt(i)=='U') 
		countVowels++;	
		
		}
		return countVowels;
	}
	
	public static void main(String[] args) {
		Practise counal=new Practise();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String");
		String inputvalue=sc.next();
		System.out.println("Number of alphabetcount in string::"+counal.getAlphabetCount(inputvalue));
	    System.out.println("Number of vowelsCount in string::"+counal.getVowelsCount(inputvalue));
	}


	}