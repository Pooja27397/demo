package arraylist_34;

public class Student {
	//arrayListdemo6
	
// id,name,salary
	int id;
	String name;
	String salary;
	public Student(int id,String name,String salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
