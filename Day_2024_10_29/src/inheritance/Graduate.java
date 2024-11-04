package inheritance;

public class Graduate extends Student {

	String thesis;

	public Graduate() {
		System.out.println("Default Graduate Constructor");
	}

	public Graduate(int age, String name, int stNum, String major, String thesis) {
		super(age, name, stNum, major);
		this.thesis = thesis;
	}

	public void research() {
		System.out.println("I research");
	}
}
