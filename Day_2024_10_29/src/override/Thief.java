package override;

public class Thief extends Human {
	String item;
	int star;

	public Thief() {
		super();
	}

	public Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}

	public void steal() {
		System.out.println("Steal a Item");
	}
}
