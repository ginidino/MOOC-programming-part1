package test5;

public class Student {
	private String name;
	private String studentNum;
	
	public Student(String name, String studentNum) {
		this.name = name;
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public String getStudentNumber() {
		return studentNum;
	}
	
	public String toString() {
		return name + " (" + studentNum + ")";
	}
}
