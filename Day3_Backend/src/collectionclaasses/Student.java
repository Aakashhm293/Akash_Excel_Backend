package collectionclaasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student Id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			System.out.println("Some random text");
			if (!sc.next().equalsIgnoreCase("yes"))
				break;
		}
	}
}
