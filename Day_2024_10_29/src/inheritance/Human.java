package inheritance;

public class Human {
	// Member variable to inherit
	Integer age;
	String name;

	public Human() {
		System.out.println("Default constructor");
	}

	public Human(int age, String name) {
		// Call self own constructor
		this();
		this.age = age;
		this.name = name;
	}

	public void intro() {
		System.out.println("I am " + name + ", "+age+" years old");
	}
}
