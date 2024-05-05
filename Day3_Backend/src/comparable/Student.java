package comparable;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private int marks;

	public int getId() {
		return id;
	}

	public Student setId(int id) {
		this.id = id;
		return null;
	}

	public String getName() {
		return name;
	}

	public Student setName(String name) {
		this.name = name;
		return null;
	}

	public int getAge() {
		return age;
	}

	public Student setAge(int age) {
		this.age = age;
		return null;
	}

	public int getMarks() {
		return marks;
	}

	public Student setMarks(int marks) {
		this.marks = marks;
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && marks == other.marks && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public Student() {
		super();
	}

	public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if (this.getId() > o.getId())
			return 1;
		else
			return -1;
	}
}
