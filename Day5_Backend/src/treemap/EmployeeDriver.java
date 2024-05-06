package treemap;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeDriver {
	public static void main(String[] args) {

		TreeMap<Integer, Employee> employesmap = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter The Employee Id");
			Employee emp = new Employee();
			emp.setId(sc.nextInt());
			System.out.println("Enter the Name");
			emp.setName(sc.next());
			System.out.println("Enter the Salary");
			emp.setSalary(sc.nextDouble());
			employesmap.put(emp.getId(), emp);
			System.out.println("Inserted");
			System.out.println("More Employees?");
			if (sc.next().equalsIgnoreCase("no"))
				break;
		}
		sc.close();

		Iterator<Integer> iterator = employesmap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer itr = iterator.next();
			System.out.println(itr + " ====> " + employesmap.get(itr));
		}
	}
}
