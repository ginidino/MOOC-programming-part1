package WEEK5;

public class Student {
	private String name;
	private String studentNum;
	
	// Exercise 88.1: Class Student
	public Student(String name, String studentNum) {
		this.name = name;
		this.studentNum = studentNum;
	}
	// Exercise 88.1: Class Student
	public String getName() {
		return this.name;
	}
	// Exercise 88.1: Class Student
	public String getStudentNumber() {
		return this.studentNum;
	}
	
	public String toString() {
		return name + " (" + studentNum + ")";
	}
}
