//Java Bean
public class Human {
	private Number age;
	private String name;
	
	// Initialization block
	{
		// Initialize before constructor
	}

	// Constructor
	// If there is even just one constructor, the compiler does not create a default constructor.
	Human() {
		// call the parent's constructor
		// Super refers to the parent class
		// The parent of every class is the Object class
		super();
	}

	// Constructor overloading
	Human(Object obj) {
		if (getType(obj) == "Invalid") {
			throw new IllegalArgumentException(
					"Invalid Argument, Don't enter parameters other than Number Type or String Type as parameters.");
		}
		try {
			switch (getType(obj)) {
			case "String":
				this.setName((String) obj);
			case "Integer":
				this.setAge((Integer) obj);
			case "Double":
				this.setAge((Double) obj);
			}
		} catch (Exception e) {

		}
	}

	Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	// Method that returns the type of an object as a string
	public String getType(Object obj) {
		if (obj instanceof String) {
			return "String";
		} else if (obj instanceof Integer) {
			return "Integer";
		} else if (obj instanceof Double) {
			return "Double";
		} else {
			return "Invalid";
		}
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setAge(Double age) {
		// truncate decimal places
		this.age = age.intValue();
	}

	public Number getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
