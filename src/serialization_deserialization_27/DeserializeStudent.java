package serialization_deserialization_27;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {
	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\tushar patil\\Desktop\tushar.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Object o=ois.readObject();
		Student s=(Student) o;   //convert to student
		System.out.println(s.firstname);
		System.out.println(s.lastname);
		System.out.println(s.city);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
