package polymorphism;

public class PolymophismTest2 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();

		// Upcasting: Convert child type → parent type
		// Always safe
		// Automatic type conversion is possible, so the cast operator can be omitted.
		Animal up = (Animal) dog;
		up.move();

		// Downcasting: Convert from parent type to child type
		// It can be dangerous.
		// Error if cast operator is omitted
		Dog down = (Dog) animal;
		down.move();
		down.bark();
	}
}
