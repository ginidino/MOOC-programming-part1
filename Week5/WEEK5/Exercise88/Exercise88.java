package WEEK5;

import java.util.ArrayList;
import java.util.Scanner;

// Exercise 88: Students
public class Exercise88 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		Student pekka = new Student("Pekka Mikkola", "013141590");
		
		// Exercise 88.1: Class Student
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
        System.out.println();
        
        // Exercise 88.2: List of students
        while(true) {
        	System.out.print("name: ");
			String name = reader.nextLine();
			if (name.isEmpty()) {
				break;
			}
			System.out.print("studentnumber: ");
			String num = reader.nextLine();
			list.add(new Student(name, num));
        }
        System.out.println();
        
        for (Student student : list) {
        	System.out.println(student);
        }
        System.out.println();
        
        //Exercise 88.3: Search
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        
        for (Student student : list) {
        	if (student.getName().contains(term)) {
        		System.out.println(student);
        	}
        }
	}
}
