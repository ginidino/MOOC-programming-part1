package test5;

import java.util.*;

public class Exercise88 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner reader = new Scanner(System.in);
		
		Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
        System.out.println();
        
		while (true) {
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
		System.out.print("Give search term: ");
		String term = reader.nextLine();
		System.out.println("Result:");
		
		for (Student student : list) {
			if(student.getName().contains(term)) {
				System.out.println(student);
			}
		}
	}
}
