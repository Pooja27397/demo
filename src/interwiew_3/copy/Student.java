package interwiew_3.copy;

public class Student {
private String firstname;
private String lastname;
private String city;

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
}
}


