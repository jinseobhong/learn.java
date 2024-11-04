package polymorphism;

public class PolymophismTest3 {

	public static void main(String[] args) {
		Dog happy = new Dog();
		PolymophismTest3 test = new PolymophismTest3();
		test.testAnimal(happy);

		Dove dove = new Dove();
		test.testAnimal(dove);
	}

	public void testAnimal(Animal animal) {
		// Upcasting
		// Animal animal = happy;

		// Downcasting
		Dog mydog = (Dog) animal;
		mydog.move();
		mydog.bark();
	}

}
