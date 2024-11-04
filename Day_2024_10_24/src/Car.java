
public class Car {
	String name;
	boolean gasoline;

	void run() {
		if (gasoline) {
			System.out.print("Vroom");
		} else {
			System.out.println("Rattle");
		}
	}
	
	void stop() {
		System.out.println("Squeak");
	}

}
