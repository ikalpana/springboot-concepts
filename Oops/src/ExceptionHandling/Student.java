package ExceptionHandling;

public class Student {

	private long id;
	private String name;
	private String email;
	private double marks;

	

	public Student(long id, String name, String email, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}

	

}
