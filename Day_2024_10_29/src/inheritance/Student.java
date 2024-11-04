package inheritance;

public class Student extends Human {
	// independent member variable
	Integer studentNumber;
	String major;

	public Student() {
		System.out.println("Default student constructor");
	}

	// Constructor override
	public Student(int age, String name, int stNum, String major) {
		// Call parent constructor
		super(age, name);
		this.studentNumber = stNum;
		this.major = major;
	}

	public void study() {
		System.out.println("I study");
	}
}
