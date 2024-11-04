package polymorphism;

public class PolymophismTest {

	public static void main(String[] args) {
		// When the left and right types match
		Animal ani = new Animal();
		ani.move();

		// Created by assigning a child object to a parent type object
		Animal dog = new Dog();
		dog.move();
		// dog.bark();

		// Created by assigning the parent object to the child type object.
		// In principle impossible
		// Dove dove = new Animal();
		// dove.fly();

	}
}
