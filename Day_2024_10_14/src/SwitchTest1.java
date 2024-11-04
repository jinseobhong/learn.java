import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		// Message displayed when 1 and 2 are entered
		Scanner sc = new Scanner(System.in);
		System.out.print("Integer : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Enter 1");
			break;
		case 2:
			System.out.println("Enter 2");
			break;
		default:
			System.out.println("Please enter 1 or 2.");
		}
		// break를 사용하지 않으면 해당 case 이후의 모든 문장이 반환됩니다.
		// It is okay to not break by default.
	}

}
