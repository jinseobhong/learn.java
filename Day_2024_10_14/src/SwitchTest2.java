import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// Receive a rank and receive a medal
		Scanner sc = new Scanner(System.in);
		System.out.print("Ranking : ");
		int rank = sc.nextInt();

		// 1: Gold medal, 2: Silver medal, 3: Bronze medal, Others: Participation Award
		switch (rank) {
		case 1:
			System.out.println("Gold medal");
			break;
		case 2:
			System.out.println("Silver medal");
			break;
		case 3:
			System.out.println("Bronze medal");
			break;
		default:
			System.out.println("Participation Award");
		}
	}

}
