import java.util.Scanner;

public class IfTest2 {

	public static void mains(String[] args) {
		// Enter scores to process branches
		Scanner sc = new Scanner(System.in);
		System.out.print("Score : ");
		// Enter integers and substitute them into score
		int score = sc.nextInt();
		boolean pass;
		if (score >= 70) {
			// Code to be executed when the condition is true
			pass = true;
		} else {
			pass = false;
		}

		System.out.println("Ending the program");

	}
}
