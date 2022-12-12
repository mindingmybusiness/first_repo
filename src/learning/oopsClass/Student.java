package learning.oopsClass;

public class Student {

	private String name;
	private String id;
	private String dob;
	private String classList;
	
	public Student(String name, String id, String dob, String classList) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.classList = classList;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", classList=" + classList + "]";
	}
	
	
	
}
