import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// Show message only when you enter 1
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("An integer of 1 has been entered.");
		}
		System.out.println("Ending the program");

	}
}
