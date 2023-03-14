package chapter13.test_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


public class HashMapExample {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"조민우"));
		
	    Iterator<Student> iterator = set.iterator();
	    while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
		
	}
}

class Student{
	public int studentNum;
	public String name;
	
	public Student(int studentNum , String name) {
		this.studentNum=studentNum;
		this.name=name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return studentNum == other.studentNum;
	}


	
	
	
}