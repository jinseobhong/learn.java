package inheritance;

public class Soldier extends Human {
	int milnum;

	public Soldier() {
		super();
	}

	public Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}

	public void fight() {
		System.out.println("Fight for Contry");
	}
}
