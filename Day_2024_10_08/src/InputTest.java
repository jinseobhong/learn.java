import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO : Test about Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scanner.next();
		System.out.println("Name: " + name);
		System.out.print("Enter Name: ");
		int age = scanner.nextInt();
		System.out.println("Age: " + age);
		// Naming convention : Camel Case
		String userID = "abc123";
		System.out.println(userID);
	}

}
