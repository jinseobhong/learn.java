import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// Receives a positive integer and outputs the result as odd or even
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Result : Even Number");
		} else {
			System.out.println("Result : Odd Number");
		}

	}

}
