package employee;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private String desig;

	public int getId() {
		return id;
	}

	public Employee setId(int id) {
		this.id = id;
		return null;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return null;
	}

	public String getDept() {
		return dept;
	}

	public Employee setDept(String dept) {
		this.dept = dept;
		return null;
	}

	public String getDesig() {
		return desig;
	}

	public Employee setDesig(String desig) {
		this.desig = desig;
		return null;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desig=" + desig + "]";
	}

	public Employee(int id, String name, String dept, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
	}

	public Employee() {
		super();
	}
}
