import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		// When you enter a month, a few things happen.
		Scanner sc = new Scanner(System.in);
		System.out.print("Month : ");
		int month = sc.nextInt();
		int days = 0; // 일
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		System.out.println(month + "Month is " + days + " .");
	}

}
