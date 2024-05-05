package collectionclasses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddStudentData {
	public static void main(String[] args) {

		List<Student> students = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Student stu = new Student();
			System.out.println("Enter Student Id");
			stu.setId(sc.nextInt());
			System.out.println("Enter name");
			stu.setName(sc.next());
			System.out.println("Enter The Age");
			stu.setAge(sc.nextInt());
			System.out.println("Enter The Marks");
			stu.setMarks(sc.nextInt());
			System.out.println("Is there a next student to add?");
			students.add(stu);
			if (!sc.next().equalsIgnoreCase("yes"))
				break;
		}
		Iterator<Student> stuitetator = students.iterator();
		while (stuitetator.hasNext()) {
			System.out.println(stuitetator.next());
		}

		sc.close();
	}
}
