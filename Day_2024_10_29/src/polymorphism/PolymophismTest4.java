package polymorphism;

public class PolymophismTest4 {

	public static void main(String[] args) {
		Dog happy = new Dog();
		PolymophismTest4 test = new PolymophismTest4();
		test.testAnimal(happy);

		Dove dove = new Dove();
		test.testAnimal(dove);
	}

	public void testAnimal(Animal animal) {
		animal.move();
		if (animal instanceof Dog) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
	}

}
