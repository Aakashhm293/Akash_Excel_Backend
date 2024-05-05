package hashcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import collectionclasses.Employee;

public class EmployeeDriver {
	public static void main(String[] args) {

		LinkedList<Employee> empsList = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Employee emp = new Employee();
			System.out.println("Enter Employee Id");
			emp.setId(sc.nextInt());
			System.out.println("Enter name");
			emp.setName(sc.next());
			System.out.println("Enter The salary");
			emp.setSalary(sc.nextDouble());
			System.out.println("Do you want to continue adding next?");
			empsList.add(emp);
			if (!sc.next().equalsIgnoreCase("yes"))
				break;
		}
		Iterator<Employee> empIter = empsList.iterator();
		while (empIter.hasNext()) {
			System.out.println(empIter.next());
		}

		sc.close();
	}
}
