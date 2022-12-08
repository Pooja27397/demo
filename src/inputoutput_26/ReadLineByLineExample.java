package inputoutput_26;

import java.io.*;
import java.util.Scanner;

public class ReadLineByLineExample {
	


	public static void main(String[] args) {
		try {
			//the file to be opened for reading
			
			FileInputStream fis=new FileInputStream("C:\\Users\\tushar patil\\Desktop\\pooja.txt");
			Scanner scanner=new Scanner(fis);  //file to be scanned
			//returns true if there is another line to read
			while(scanner.hasNextLine()) {
				System.out.println(scanner.hasNextLine());  //returns the line that was skipped
			}
			scanner.close(); //close the scanner
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}


