import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// Can log in by logging in.
		Scanner sc = new Scanner(System.in);
		System.out.print("Rank : ");
		int rank = sc.nextInt();

		// 1: Gold medal 2,3: Excellence Award 4,5: Encouragement Award
		switch (rank) {
		case 1:
			System.out.println("Gold medal");
			break;
		case 2:
		case 3:
			System.out.println("Excellence Award");
			break;
		case 4:
		case 5:
			System.out.println("Encouragement Award");
			break;
		}

	}

}
