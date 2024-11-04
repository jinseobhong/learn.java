import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		// The statement to be executed in the if statement is declared as {}
		if (age >= 19) {
			System.out.println("is adult");
			System.out.println("Tobacco can be purchased.");
		} else {
			System.out.println("is Minor");
		}
	}

}
