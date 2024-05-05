package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import comparable.Student;

public class StudentRunner {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Student stu = new Student();
			System.out.println("Enter the Student Id");
			stu.setId(sc.nextInt());
			System.out.println("Enter the Student name");
			stu.setName(sc.next());
			System.out.println("Enter the Age");
			stu.setAge(sc.nextInt());
			System.out.println("Enter the Marks");
			stu.setMarks(sc.nextInt());
			students.add(stu);
			System.out.println("More Students?");
			if (!sc.next().equalsIgnoreCase("Yes")) {
				break;
			}
		}

		sc.close();
		
		Comparator<Student> sortingLogic = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getId() > o2.getId())
					return 1;
				else
					return -1;
			}
		};

		Collections.sort(students,sortingLogic);

		for (Student integer : students) {
			System.out.println(integer);
		}
	}
}
