import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// Buffet
		// Adult male: 25000Won, Adult female: 21000Won, Youth: 15000Won
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age and gender.");

		int age = sc.nextInt();
		boolean man = sc.nextBoolean(); // true: Man, false: Woman

		if (age >= 19) {
			if (man == true) {
				System.out.println("Adult male : 25,000원");
			} else {
				System.out.println("Adult female : 21,000원");
			}
		} else {
			System.out.println("Youth : 15,000원");
		}

		boolean bool = true;
		if (bool) {
			System.out.println("Run");

		}
	}
}
