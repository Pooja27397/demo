package serialization_deserialization_27_2;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializeStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.name= "Rahul";
		s.age= 25;
		s.location= "Pune";
		try {
			FileOutputStream fos= new FileOutputStream("C:\\Users\\tushar patil\\Desktop\\tushar.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			System.out.println("Serialization is done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
