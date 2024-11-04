import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		// Display a message when entering 1
		// Display a message when entering 2
		// If not, show a message when entering other integers
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("It's an integer of 1");
		} else if (num == 2) {
			System.out.println("It's an integer of 2.");
		} else if (num == 3) {
			System.out.println("It's an integer of 3.");
		} else {
			System.out.println("Please enter out of 1, 2, 3.");
		}
		System.out.println("Ending the program");
		return;
	}
}
