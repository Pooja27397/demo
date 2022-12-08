package serialization_deserialization_27_2;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {
public static void main(String[] args) {
	try {
		FileInputStream fis= new FileInputStream("C:\\Users\\tushar patil\\Desktop\\tushar.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o= ois.readObject();
		Student s=(Student) o;  //convert the student
		System.out.println(s.name);
		System.out.println(s.age);  // wont be deserializable will print default value
		System.out.println(s.location);
	} catch(Exception e) {
		e.printStackTrace();

	}
}
}
