package polymorphism;

public class PolymophismTest5 {

	public static void main(String[] args) {
		Dog happy = new Dog();
		PolymophismTest5 test = new PolymophismTest5();
		test.testAnimal(happy);

		Dove dove = new Dove();
		test.testAnimal(dove);
	}

	public void testAnimal(Animal animal) {
		animal.move();
		// What type of animal is a dog?
		if (animal instanceof Dog) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if(animal instanceof Dog mydog) {
			mydog.bark();
		}
		// What type of animal is a pigeon?
		if (animal instanceof Dove) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
	}

}
