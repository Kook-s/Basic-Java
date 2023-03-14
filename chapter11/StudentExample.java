package chapter11;

import java.util.HashMap;
import java.util.Objects;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("1"), "95");

		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
	}

}

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
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
		return Objects.equals(studentNum, other.studentNum);
	}
	
	
}