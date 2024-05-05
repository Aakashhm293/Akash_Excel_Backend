package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeRunner {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Employee emp = new Employee();
			System.out.println("Enter the Employee id");
			emp.setId(sc.nextInt());
			System.out.println("Enter the Name");
			emp.setName(sc.next());
			System.out.println("Enter the Salary");
			emp.setSalary(sc.nextDouble());
			employee.add(emp);
			if (!sc.next().equalsIgnoreCase("Yes")) {
				break;
			}
		}
		sc.close();
		
		Comparator<Employee> sortAlgorithm = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId() > o2.getId())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(employee,sortAlgorithm);
		
		for (Employee employees : employee) {
			System.out.println(employees);
		}
	}
}
