package comparable_comparator_39;
public class Employee implements Comparable <Employee>  {

   int id;
   String name;
   int Salary;
  public Employee(int id, String name,int Salary) {
	  super();
	  this.id=id;
	  this.name=name;
	  this.Salary=Salary;
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
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	this.Salary = salary;
}
//Sort data by using salary, comparison, id
@Override
public int compareTo(Employee employee) {
	 if(Salary==employee.Salary)
		  return 0;
	 else if(Salary==employee.Salary)
		 return 1;
	 else
		 return -1;
}
   
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
}
}