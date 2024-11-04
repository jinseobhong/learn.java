import java.util.Scanner;

public class IfTest4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Score: ");
		int score = sc.nextInt();
		// || Concatenation operator means OR
		if (score > 100 || score < 0) {
			// 0~100
			System.out.println("Please enter your score correctly");
			// Program exit
			System.exit(0);
			// Exits the method and returns a value.
			return;
		}
		// 90~100 : A
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			// && concatenation operator means And
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
