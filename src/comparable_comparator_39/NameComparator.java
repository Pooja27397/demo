package comparable_comparator_39;
//Sort data by using Name;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
@Override
  public int compare(Student stu1,Student stu2) {
	return stu1.name.compareTo(stu2.name);
}

}