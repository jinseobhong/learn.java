import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		// Display a message when entering 1
		// If not, show a message when entering other integers
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("It is an integer of 1.");
		} else {
			System.out.println("It is not an integer of 1.");
		}
		System.out.println("Ending the program");
	}
}
