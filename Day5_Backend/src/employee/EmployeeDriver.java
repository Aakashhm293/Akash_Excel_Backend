package employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {

		HashMap<Integer, Employee> empDetails = new HashMap<Integer, Employee>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Employee empObj = new Employee();
			System.out.println("Enter the Employee id ");
			empObj.setId(sc.nextInt());
			System.out.println("Enter the Name");
			empObj.setName(sc.next());
			System.out.println("Enter the Department Name");
			empObj.setDept(sc.next());
			System.out.println("Enter the Designation");
			empObj.setDesig(sc.next());
			empDetails.put(empObj.getId(), empObj);
			System.out.println("Any other employee?");
			if (!sc.next().equalsIgnoreCase("Yes"))
				break;
		}
		sc.close();

		Iterator<Integer> iterator = empDetails.keySet().iterator();
		while (iterator.hasNext()) {
			Integer str = iterator.next();
			System.out.println(str + " ==> " + empDetails.get(str));
		}
	}
}
