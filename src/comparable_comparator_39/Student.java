package comparable_comparator_39;

public class Student {

int id;
String name;
int Salary;
 public Student(int id,String name,int Salary) {
	 super();
	 this.id=id;
	 this.name=name;
	 this.Salary=Salary;
 }
public int getId() {
	return id;
}
 public void setId(int id) {
	 this.id=id;
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
} 
   public int getSalary() {
	   return Salary;
   }
   public void setSalary(int Salary) {
	   this.Salary=Salary;
   }
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
}
}