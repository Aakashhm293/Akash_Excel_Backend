package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class EmployeeRunner {
	public static void main(String[] args) {
		List<Employee> employes = new ArrayList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			Employee emp = new Employee();
			System.out.println("Enter the Employee Id");
			emp.setId(sc.nextInt());
			System.out.println("Enter the Employee Name");
			emp.setName(sc.next());
			System.out.println("Enter the Salary");
			emp.setSalary(sc.nextDouble());
			employes.add(emp);
			if(!sc.next().equalsIgnoreCase("Yes")) {
				break;
			}
		}
		sc.close();
		
		Collections.sort(employes);
		
		for (Employee employee : employes) {
			System.out.println(employee);
		}
	}
}