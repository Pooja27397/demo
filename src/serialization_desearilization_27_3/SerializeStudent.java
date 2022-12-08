package serialization_desearilization_27_3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializeStudent {
public static void main(String[] args) throws Exception {
	Student student=new Student();
	Demo demo=new Demo();
	System.out.println("Serialization started");
	FileOutputStream fos= new FileOutputStream("C:\\Users\\tushar patil\\Desktop");
	ObjectOutputStream oos= new ObjectOutputStream(fos);
	FileInputStream fis=new FileInputStream("C:\\Users\\tushar patil\\Desktop");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student student1= (Student) ois.readObject();
	Demo demo1=(Demo) ois.readObject();
	System.out.println("Deserialization end");
	System.out.println(student1.username+" "+student1.password);
	System.out.println(demo1.c+" "+demo1.d);
}
}

