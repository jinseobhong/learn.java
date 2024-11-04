import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		// The statement to be executed in the if statement is declared as {}
		if (age >= 19) {
			System.out.println("is adult");
			System.out.println("Can enter the bar");
		}
		else if (age>=13) {
			System.out.println("is minor.");
			System.out.println("Have to go back home.");
		}
		else {
				if(age >= 10) {
					System.out.println("is an elementary school student");
				}
		else {
			System.out.println("is a child.");
			System.out.println("Have to go back home.");
		}
	  }
	}

}
