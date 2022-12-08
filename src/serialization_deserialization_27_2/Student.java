package serialization_deserialization_27_2;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	transient int age;
	String location;

}
