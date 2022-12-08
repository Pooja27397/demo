package inputoutput_26;
import java.io.FileWriter;
public class FileWriterExample {
public static void main(String[] args) {
	try {
		FileWriter fw= new FileWriter("C:\\\\Users\\\\tushar patil\\\\Desktop\\\\pooja.txt");
		fw.write("Velocity corporate training centre pune");
		fw.close();
	} catch(Exception e) {
		System.out.println(e);

	}
	System.out.println("Success");

}
}
